package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LivreDTO;
import com.example.demo.entity.LivreEntity;
import com.example.demo.enums.EnumGenre;
import com.example.demo.mapper.LivreMapper;
import com.example.demo.repository.LivreRepository;

@Service
public class LivreService {
	
	@Autowired
	private LivreRepository repo;
	
	public List<LivreDTO> findLivres() {
		return LivreMapper.map(repo.findAll());
	}
	
	public LivreEntity findById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<LivreEntity> findByGenre(EnumGenre genre){
		return repo.findByGenre(genre);
	}
	
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	public LivreEntity save(LivreEntity entities) {
		return repo.save(entities);
	}

}

