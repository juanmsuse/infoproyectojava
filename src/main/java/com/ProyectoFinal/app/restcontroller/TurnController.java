package com.ProyectoFinal.app.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoFinal.app.dto.TurnDto;
import com.ProyectoFinal.app.dto.UserDto;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.Turn;
import com.ProyectoFinal.app.entity.User;
import com.ProyectoFinal.app.service.IEventService;
import com.ProyectoFinal.app.service.IOrganizationService;
import com.ProyectoFinal.app.service.ITurnService;

@RequestMapping("api/v1/turn")
@RestController
public class TurnController {
	private static final Logger log = LoggerFactory.getLogger(TurnController.class);
	@Autowired
	IOrganizationService organizationService;
	@Autowired
	IEventService eventService;
	@Autowired
	ITurnService turnService;
	
	@GetMapping("/{orgagive}")
	public ResponseEntity<HashMap<String, Object>>findByid(@PathVariable (value="orgagive")Long id){
			HashMap<String, Object> response = new HashMap<String, Object>();
			List<Turn> turn = turnService.findByid(id);
			response.put("turnos dados por una org", turn);
			return new ResponseEntity<HashMap<String, Object>>(response,HttpStatus.OK);

	}
	

}
