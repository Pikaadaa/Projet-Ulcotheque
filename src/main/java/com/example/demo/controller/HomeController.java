package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AuteurDTO;
import com.example.demo.dto.HomeDTO;
import com.example.demo.dto.IndicateursDTO;
import com.example.demo.dto.LivreDTO;
import com.example.demo.enums.EnumGenre;
import com.example.demo.service.AuteurService;
import com.example.demo.service.HomeService;
import com.example.demo.service.LivreService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd") //=> l’URL d’accès à votre controller.

public class HomeController {
	
	@Autowired
	private HomeService service;
	
	@Autowired
	private LivreService livreService ;
	
	@Autowired
	private AuteurService auteurService ;

	
	@GetMapping(value="/home")
	public HomeDTO getHome() {
		final List<LivreDTO> livres = livreService.findLivres();
		final List<AuteurDTO> auteurs = auteurService.findAuteur();
		//HashMap <String, String> test = new HashMap<>();
		final HomeDTO home = new HomeDTO();
		final IndicateursDTO indicateurs = new IndicateursDTO();
		indicateurs.setNbLivres(livres.size());
		final ArrayList<EnumGenre> listGenres = new ArrayList<EnumGenre>() ;
		for(LivreDTO livre : livres) {
			if(listGenres.contains(livre.getGenre())) {
				System.out.println("Déja dans tableau");
			}else {
				listGenres.add(livre.getGenre());
			}
		}
		indicateurs.setNbGenres(listGenres.size());
		indicateurs.setNbAuteurs(auteurs.size());
		home.setIndicateurs(indicateurs);
		home.setLivres(livres);
		
		
		return home;
	}
	
}
