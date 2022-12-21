package com.ProyectoFinal.app.dto;

import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.User;

public class TurnDto {
	
	private User user;
	private Event event;
	private Organization organization;
	public TurnDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TurnDto(User user, Event event, Organization organization) {
		super();
		this.user = user;
		this.event = event;
		this.organization = organization;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
}
