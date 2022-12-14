package com.ProyectoFinal.app.dto;

import java.util.EventObject;
import java.util.List;

import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;

public class UserDto {
	
	private String name;
	
	private String lastname;

	private Integer dni;
	
	private String code;
	
	private List<Event> events;
	
	private Organization organization;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String name, String lastname, Integer dni, String code, List<Event> events,
			Organization organization) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
		this.code = code;
		this.events = events;
		this.organization = organization;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public Integer getDni() {
		return dni;
	}

	public String getCode() {
		return code;
	}

	public List<Event> getEvents() {
		return events;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

}