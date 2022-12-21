package com.ProyectoFinal.app.dto;

import java.util.Date;

import javax.persistence.Column;

import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;

public class EventDto {
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date eventCelebration;
	
	private String address;
	
	private String type;
	
	private String name;
	
	private Organization organization;
	
	private User user;

	public Date getEventCelebration() {
		return eventCelebration;
	}

	public void setEventCelebration(Date eventCelebration) {
		this.eventCelebration = eventCelebration;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}