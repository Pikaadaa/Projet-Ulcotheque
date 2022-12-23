package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LivreEntity;

@Repository
public interface HomeRepository extends JpaRepository<LivreEntity, Long>{
	
	
}