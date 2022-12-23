package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AuteurDTO;
import com.example.demo.entity.AuteurEntity;
import com.example.demo.mapper.AuteurMapper;
import com.example.demo.repository.AuteurRepository;

@Service
public class AuteurService {
	
	@Autowired
	private AuteurRepository repo;
	
	public List<AuteurDTO> findAuteur() {
		return AuteurMapper.map(repo.findAll());
	}
	
	public AuteurEntity findById(Long id) {
		return repo.findById(id).orElse(null);
	}

}
