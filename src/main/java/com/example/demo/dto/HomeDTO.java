package com.example.demo.dto;

import java.util.List;
import java.util.Map;

public class HomeDTO {
	
	private List<LivreDTO> livres;
	private IndicateursDTO indicateurs;
	private Map<String, Integer> genres;

	
	public HomeDTO(List<LivreDTO> livres, IndicateursDTO indicateurs, Map<String, Integer> genres) {
		this.livres = livres;
		this.indicateurs = indicateurs;
		this.genres = genres;
	}

	public HomeDTO() {
		
	}

	public List<LivreDTO> getLivres() {
		return livres;
	}


	public Map<String, Integer> getGenres() {
		return genres;
	}

	public void setGenres(Map<String, Integer> genres) {
		this.genres = genres;
	}

	public void setLivres(List<LivreDTO> livres) {
		this.livres = livres;
	}


	public IndicateursDTO getIndicateurs() {
		return indicateurs;
	}


	public void setIndicateurs(IndicateursDTO indicateurs) {
		this.indicateurs = indicateurs;
	}
	
	
}
