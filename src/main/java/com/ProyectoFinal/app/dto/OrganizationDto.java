package com.ProyectoFinal.app.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.ProyectoFinal.app.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;

public class OrganizationDto {
	//@NotBlank(message = "El campo nombre no puede estar vacio")
	private String name;
	//@NotNull(message="El campo cuit no puede ser nulo")
	private Integer cuit;
	//@NotBlank(message = "El campo direccion no puede estar vacio")
	private String address;
	//@NotNull(message="El campo telelofo no puede ser nulo")
	private Integer tel;
	//@NotBlank(message = "El campo email no puede estar vacio")
	private String email;
	
	private Date subscription;
	
	//@NotNull(message="El campo contraseña no puede ser nulo")
	//@NotBlank(message = "El campo contraseña no puede estar vacio")
	//@Size(min = 4,  max= 20, message = "La clave debe tener al menos 20 caracteres y no superar los 40.")
	private String password;
	private User user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCuit() {
		return cuit;
	}
	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getSubscription() {
		return subscription;
	}
	public void setSubscription(Date subscription) {
		this.subscription = subscription;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}

	