package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.dto.AuteurDTO;
import com.example.demo.enums.EnumGenre;

@Entity // => Pour que votre application Spring boot sache que cette classe est une entité
@Table(name="livres") //=> le nom de la table de votre base de données associée à cet objet Entité.

public class LivreEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="genre")
	@Enumerated(EnumType.STRING)
	private EnumGenre genre;

	@Column(name="editeur")
	private String editeur;
	
	@Column(name="nbPages")
	private Integer nbPages;

	@Column(name="lieuParution")
	private String lieuParution;
	
	@ManyToOne @JoinColumn(name="auteur_id", nullable=false, referencedColumnName = "id")
    private AuteurEntity auteur; 

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public EnumGenre getGenre() {
		return genre;
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

	public void setGenre(EnumGenre genre) {
		this.genre = genre;
	}

	public AuteurEntity getAuteur() {
		return auteur;
	}

	public void setAuteur(AuteurEntity auteur) {
		this.auteur = auteur;
	}
	
	
	
}
