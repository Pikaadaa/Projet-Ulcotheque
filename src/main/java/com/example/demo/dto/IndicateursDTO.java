package com.example.demo.dto;

public class IndicateursDTO {

	private Integer nbLivres;
	private Integer nbAuteurs;
	private Integer nbGenres;
	
	public IndicateursDTO(Integer nbLivres, Integer nbAuteurs, Integer nbGenres) {
		this.nbLivres = nbLivres;
		this.nbAuteurs = nbAuteurs;
		this.nbGenres = nbGenres;
	}
	
	public IndicateursDTO() {
		
	}

	public Integer getNbLivres() {
		return nbLivres;
	}

	public void setNbLivres(Integer nbLivres) {
		this.nbLivres = nbLivres;
	}

	public Integer getNbAuteurs() {
		return nbAuteurs;
	}

	public void setNbAuteurs(Integer nbAuteurs) {
		this.nbAuteurs = nbAuteurs;
	}

	public Integer getNbGenres() {
		return nbGenres;
	}

	public void setNbGenres(Integer nbGenres) {
		this.nbGenres = nbGenres;
	}
	
	
}
