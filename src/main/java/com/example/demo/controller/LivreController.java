package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LivreDTO;
import com.example.demo.entity.LivreEntity;
import com.example.demo.enums.EnumGenre;
import com.example.demo.mapper.LivreMapper;
import com.example.demo.service.LivreService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/livres") //=> l’URL d’accès à votre controller.
public class LivreController {
	@Autowired
    private LivreService service;
	
	@GetMapping(value="/{id}")
	public LivreDTO findLivres(@PathVariable Long id) {
		return LivreMapper.map(service.findById(id));
	}
	
	@GetMapping
	public List<LivreDTO> findByGenre(@RequestParam EnumGenre genre) {
		if(genre != null) {
			return LivreMapper.map(service.findByGenre(genre));
		}else {
			return service.findLivres();
		}	
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteLivre(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	@PostMapping
	public void addLivre(@RequestBody LivreEntity livre) {
		service.save(livre);
	}
	
	@PutMapping(value="/{id}")
	public LivreEntity updateLivre(@PathVariable Long id , @RequestBody LivreEntity livre) {
		LivreEntity updateLivre = service.findById(id);
		updateLivre.setNom(livre.getNom());
		updateLivre.setGenre(livre.getGenre());
		updateLivre.setEditeur(livre.getEditeur());
		updateLivre.setNbPages(livre.getNbPages());
		updateLivre.setLieuParution(livre.getLieuParution());
		
		return service.save(updateLivre);
	}
}
