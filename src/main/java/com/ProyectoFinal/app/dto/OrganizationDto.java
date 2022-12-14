package com.ProyectoFinal.app.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrganizationDto {
	private String name;
	
	private Integer cuit;
	
	private String address;
	
	private Integer tel;
	
	private String email;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date subscription;
	
	private String password;

	public OrganizationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrganizationDto(String name, Integer cuit, String address, Integer tel, String email, Date subscription,
			String password) {
		super();
		this.name = name;
		this.cuit = cuit;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.subscription = subscription;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public Integer getCuit() {
		return cuit;
	}

	public String getAddress() {
		return address;
	}

	public Integer getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public Date getSubscription() {
		return subscription;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSubscription(Date subscription) {
		this.subscription = subscription;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
