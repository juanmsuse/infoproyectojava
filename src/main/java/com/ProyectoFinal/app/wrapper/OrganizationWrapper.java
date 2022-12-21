package com.ProyectoFinal.app.wrapper;

import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.entity.Organization;


public class OrganizationWrapper {
	public static Organization dtoToEntity(OrganizationDto dto) {
		if(dto==null) return new Organization();
		Organization entity = new Organization();
		entity.setName(dto.getName());
		entity.setAddress(dto.getAddress());
		entity.setCuit(dto.getCuit());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setTel(dto.getTel());
		entity.setSubscription(dto.getSubscription());
		entity.setUser(dto.getUser());
		
		return entity;
		}	

			public static OrganizationDto entityToDto(Organization entity) {
			if(entity==null) return new OrganizationDto();
			
			OrganizationDto dto = new OrganizationDto();
			dto.setName(entity.getName());
			dto.setAddress(entity.getAddress());
			dto.setCuit(entity.getCuit());
			dto.setEmail(entity.getEmail());
			dto.setPassword(entity.getPassword());
			dto.setTel(entity.getTel());
			dto.setSubscription(entity.getSubscription());
			dto.setUser(entity.getUser());
			return dto;
			}	
}
