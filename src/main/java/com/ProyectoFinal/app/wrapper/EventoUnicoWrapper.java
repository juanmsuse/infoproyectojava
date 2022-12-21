package com.ProyectoFinal.app.wrapper;

import com.ProyectoFinal.app.dto.EventDto;
import com.ProyectoFinal.app.dto.EventoUnicoDto;
import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;

public class EventoUnicoWrapper {
	public static EventoUnicoDto entityToDto(Event entity) {
		if(entity==null) return new EventoUnicoDto();
		
		EventoUnicoDto dto = new 	EventoUnicoDto();
		dto.setName(entity.getName());
		dto.setAddress(entity.getAddress());
		return dto;
}
}
