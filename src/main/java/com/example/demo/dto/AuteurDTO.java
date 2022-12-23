package com.example.demo.dto;

import java.sql.Date;

public class AuteurDTO {
	
	private Long id;
	private String prenom;
	private String nom;
	private Date dateNaissance;
	
	public AuteurDTO(Long id, String prenom, String nom, Date dateNaissance){
		this.id = id ;
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}
	
	public AuteurDTO() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
}
