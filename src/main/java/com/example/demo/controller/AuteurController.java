package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AuteurDTO;
import com.example.demo.mapper.AuteurMapper;
import com.example.demo.service.AuteurService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/auteurs") //=> l’URL d’accès à votre controller.
public class AuteurController {
	@Autowired
    private AuteurService service;
	
	@GetMapping()
	public List<AuteurDTO> findAuteur() {
		return service.findAuteur();
	}
	
	@GetMapping(value="/{id}")
	public AuteurDTO findAuteur(@PathVariable Long id) {
		return AuteurMapper.map(service.findById(id));
	}
}
