package com.ProyectoFinal.app.wrapper;

import com.ProyectoFinal.app.dto.EventDto;
import com.ProyectoFinal.app.wrapper.OrganizationWrapper;
import com.ProyectoFinal.app.entity.Event;


public class EventWrapper {
	public static Event dtoToEntity(EventDto dto) {
		if(dto==null) return new Event();
		Event entity = new Event();
		entity.setAddress(dto.getAddress());
		entity.setEventCelebration(dto.getEventCelebration());
		entity.setName(dto.getName());
		entity.setType(dto.getType());
		entity.setOrganization(dto.getOrganization());
		entity.setUser(dto.getUser());
		return entity;
		}	
	
	public static EventDto entityToDto(Event entity) {
		if(entity==null) return new EventDto();
		
		EventDto dto = new EventDto();
		dto.setName(entity.getName());
		dto.setAddress(entity.getAddress());
		dto.setEventCelebration(entity.getEventCelebration());
		dto.setType(entity.getType());
		dto.setOrganization(entity.getOrganization());
		dto.setUser(entity.getUser());
		return dto;
		}	


}
