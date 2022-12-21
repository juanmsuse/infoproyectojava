package com.ProyectoFinal.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoFinal.app.dto.EventDto;
import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.repository.IEventDao;
import com.ProyectoFinal.app.wrapper.EventWrapper;
import com.ProyectoFinal.app.wrapper.OrganizationWrapper;
@Service
public class EventServiceImpl implements IEventService {
	private static final Logger log = LoggerFactory.getLogger(EventServiceImpl.class);
	@Autowired IEventDao eventDao;

	@Override
	public EventDto save(EventDto eventDto) {
		Event event = EventWrapper.dtoToEntity(eventDto);
		event = eventDao.save(event);
		eventDto = EventWrapper.entityToDto(event);
		return eventDto;

		
	}

	@Override
	public List <Event> findBytype(String type) {
		// TODO Auto-generated method stub
		return eventDao.findbytype(type);
	}

	@Override
	public Event findByid(Long id) {
		// TODO Auto-generated method stub
		return eventDao.getById(id);
	}

}



