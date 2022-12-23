package com.example.demo.dto;

import com.example.demo.entity.AuteurEntity;
import com.example.demo.enums.EnumGenre;

public class LivreDTO {
	
	private Long id;
	private String nom ;
	private AuteurEntity auteur;
	private EnumGenre genre ; 
	private String editeur ; 
	private Integer nbPages ; 
	private String lieuParution;
	
	public LivreDTO(Long id, String nom, EnumGenre genre, String editeur, Integer nbPages, String lieuParution) {
		this.id = id;
		this.nom = nom;
		this.genre = genre;
		this.editeur = editeur; 
		this.nbPages = nbPages;
		this.lieuParution = lieuParution;
		this.auteur = auteur;
	}

	public String getNom() {
		return nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public AuteurEntity getAuteur() {
		return auteur;
	}

	public void setAuteur(AuteurEntity auteur) {
		this.auteur = auteur;
	}

	public EnumGenre getGenre() {
		return genre;
	}

	public void setGenre(EnumGenre genre) {
		this.genre = genre;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Integer getNbPages() {
		return nbPages;
	}

	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}

	public String getLieuParution() {
		return lieuParution;
	}

	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}
	

	
}
