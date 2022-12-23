package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.AuteurDTO;
import com.example.demo.dto.LivreDTO;
import com.example.demo.entity.AuteurEntity;
import com.example.demo.entity.LivreEntity;

public class LivreMapper {

	public static LivreDTO map(LivreEntity entity) {
		LivreDTO livre = new LivreDTO(entity.getId(), entity.getNom(), entity.getGenre(), entity.getEditeur(), entity.getNbPages(), entity.getLieuParution());
		return livre ;
	}
	
	public static List<LivreDTO> map(List<LivreEntity> entities){
		List<LivreDTO> result = new ArrayList<LivreDTO>();
		for(final LivreEntity entity : entities) {
			result.add(LivreMapper.map(entity));
		}
		return result;
		
	}
}
