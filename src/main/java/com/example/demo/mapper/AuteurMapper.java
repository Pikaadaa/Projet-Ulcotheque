package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.AuteurDTO;
import com.example.demo.entity.AuteurEntity;

public class AuteurMapper {
	
	public static AuteurDTO map(AuteurEntity entity) {
		AuteurDTO auteur = new AuteurDTO(entity.getId(), entity.getPrenom(), entity.getNom(), entity.getDateNaissance());
		return auteur ;
	}
	
	public static List<AuteurDTO> map(List<AuteurEntity> entities){
		List<AuteurDTO> result = new ArrayList<AuteurDTO>();
		for(final AuteurEntity entity : entities) {
			result.add(AuteurMapper.map(entity));
		}
		return result;
		
	}

}
