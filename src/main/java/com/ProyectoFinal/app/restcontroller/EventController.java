package com.ProyectoFinal.app.restcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoFinal.app.dto.EventDto;
import com.ProyectoFinal.app.dto.EventoUnicoDto;
import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.User;
import com.ProyectoFinal.app.service.IEventService;
import com.ProyectoFinal.app.service.IOrganizationService;
import com.ProyectoFinal.app.service.IUserService;
import com.ProyectoFinal.app.wrapper.EventoUnicoWrapper;

@RequestMapping("api/v1/event")
@RestController
public class EventController {
	private static final Logger log = LoggerFactory.getLogger(EventController.class);
	@Autowired
	IOrganizationService organizationService;
	@Autowired
	IEventService eventService;

@GetMapping("/eventotipo/{type}")
public ResponseEntity<HashMap<String, Object>> eventoscasuales(@PathVariable (value = "type") String type){
	HashMap<String, Object> response = new HashMap<String, Object>();
	List<Event> eventos= eventService.findBytype(type);
	List<EventoUnicoDto> cadena = new ArrayList<>(); 
	eventos.stream().forEach((e)->cadena.add(EventoUnicoWrapper.entityToDto(e)));
	
	if(!type.equals("casual")) {
		response.put("eventos unicos", cadena);
		return new  ResponseEntity<HashMap<String, Object>>(response,HttpStatus.OK);
		
	}
			response.put("eventos casuales", eventos);
			return new  ResponseEntity<HashMap<String, Object>>(response,HttpStatus.OK);
}
}
