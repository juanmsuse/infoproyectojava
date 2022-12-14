package com.ProyectoFinal.app.wrapper;

import org.hibernate.mapping.Set;

import com.ProyectoFinal.app.dto.UserDto;
import com.ProyectoFinal.app.entity.User;

public class UserWrapper {
	public static User dtoToEntity(UserDto dto) {
	if(dto==null) return new User();
	User entity = new User();
	entity.setName(dto.getName());
	entity.setLastname(dto.getLastname());
	entity.setDni(dto.getDni());
	entity.setCode(dto.getCode());
	entity.setOrganization(dto.getOrganization());
	entity.setEvents(dto.getEvents());
	
	return entity;
	}	

		public static UserDto entityToDto(User entity) {
		if(entity==null) return new UserDto();
		
		UserDto dto = new UserDto();
		dto.setName(entity.getName());
		dto.setLastname(entity.getLastname());
		dto.setDni(entity.getDni());
		dto.setCode(entity.getCode());
		dto.setOrganization(entity.getOrganization());
		dto.setEvents(entity.getEvents());
		return dto;
		}	
}
