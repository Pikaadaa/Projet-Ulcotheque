package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HomeRepository;
import com.example.demo.repository.LivreRepository;

@Service
public class HomeService {
	
	@Autowired
	private HomeRepository repo;

}
