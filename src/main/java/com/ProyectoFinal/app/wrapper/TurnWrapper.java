package com.ProyectoFinal.app.wrapper;

import com.ProyectoFinal.app.dto.EventDto;
import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.dto.TurnDto;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.Turn;

public class TurnWrapper {
	public static Turn dtoToEntity(TurnDto dto) {
		if(dto==null) return new Turn();
		Turn entity = new Turn();
		entity.setUser(dto.getUser());
		entity.setEvent(dto.getEvent());
		entity.setOrganization(dto.getOrganization());
		return entity;
}
	
	public static TurnDto entityToDto(Turn entity) {
		if(entity==null) return new TurnDto();
		
		TurnDto dto = new TurnDto();
		dto.setEvent(entity.getEvent());
		dto.setOrganization(entity.getOrganization());
		dto.setUser(entity.getUser());
		return dto;
}
}
