package com.ProyectoFinal.app.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ProyectoFinal.app.dto.EventDto;
import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;

public interface IEventService {
	public EventDto save(EventDto event);
	
	public List <Event> findBytype (String type);
	
	public Event findByid(Long id);
	
}
