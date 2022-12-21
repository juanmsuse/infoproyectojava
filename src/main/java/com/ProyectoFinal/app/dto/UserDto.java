package com.ProyectoFinal.app.dto;

import java.util.EventObject;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.ProyectoFinal.app.entity.Event;
import com.ProyectoFinal.app.entity.Organization;
import com.ProyectoFinal.app.entity.Turn;

public class UserDto {
	@NotBlank(message = "El campo nombre no puede estar vacio")
	private String name;
	@NotBlank(message = "El campo apellido no puede estar vacio")
	private String lastname;
	@NotNull(message="El campo cuit no puede ser nulo")
	private Integer dni;
	@NotBlank(message = "El campo code no puede estar vacio")
	private String code;
	private Turn turn;
	private Event event;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Turn getTurn() {
		return turn;
	}
	public void setTurn(Turn turn) {
		this.turn = turn;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
}