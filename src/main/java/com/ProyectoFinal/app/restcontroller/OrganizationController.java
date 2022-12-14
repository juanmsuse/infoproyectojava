package com.ProyectoFinal.app.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoFinal.app.dto.OrganizationDto;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.User;
import com.ProyectoFinal.app.service.IOrganizationService;
@RequestMapping("api/v1/organization")
@RestController
public class OrganizationController {
	private static final Logger log = LoggerFactory.getLogger(OrganizationController.class);
	@Autowired
	IOrganizationService organizationService;
	
	@PostMapping("/neworganization")
	public ResponseEntity <Map<String,Object>>newOrganization(@RequestBody OrganizationDto organizationDto){
		log.info("organization"+organizationDto.toString());
		Map<String,Object>response= new HashMap<>();
		OrganizationDto newOrganization = organizationService.save(organizationDto);
		response.put("organization", newOrganization);
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK); 
		
	}
	@DeleteMapping("eliminar/{password}")
	public void removeOne(@PathVariable("password")String password) {
		organizationService.removeBypassword(password);
	}
	
	@GetMapping("/all")
	public List<Organization>findAll(){
		return organizationService.findByAll();
	}
	@GetMapping("/organization/{name}")
	public ResponseEntity<HashMap<String, Object>> organization1(@PathVariable(value = "name") String name){
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<Organization> organization = organizationService.findByname(name);
		response.put("organization", organization);
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);

}
	@GetMapping("/serch/{cuit}")
	public ResponseEntity<HashMap<String, Object>> organization(@PathVariable(value = "cuit") Integer cuit){
		HashMap<String, Object> response = new HashMap<String, Object>();
		Organization organization = organizationService.findBycuit(cuit);
		response.put("organization", organization);
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);

}
}