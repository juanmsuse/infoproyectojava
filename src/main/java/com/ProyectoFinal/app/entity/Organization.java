package com.ProyectoFinal.app.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

@Entity(name="organizations")
@SQLDelete(sql="UPDATE organizations SET inactivity = true WHERE id=?")
@Where(clause = "inactivity=false")
public class Organization implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer cuit;
	
	@Column
	private String password;
	
	@Column
	private String address;
	
	@Column
	private String email;
	
	@Column
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date subscription;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Event> events;
	
	@Column
	private Integer tel;

	// este parametro hace referecia a inactivo en la api
	@Column(name="inactivity")
	private boolean inactivity = Boolean.valueOf(false);

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organization(Long id, String name, Integer cuit, String password, String address, String email,
			Date subscription, List<Event> events, Integer tel, boolean inactivity) {
		super();
		this.id = id;
		this.name = name;
		this.cuit = cuit;
		this.password = password;
		this.address = address;
		this.email = email;
		this.subscription = subscription;
		this.events = events;
		this.tel = tel;
		this.inactivity = inactivity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getCuit() {
		return cuit;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public Date getSubscription() {
		return subscription;
	}

	public List<Event> getEvents() {
		return events;
	}

	public Integer getTel() {
		return tel;
	}

	public boolean isInactivity() {
		return inactivity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSubscription(Date subscription) {
		this.subscription = subscription;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public void setInactivity(boolean inactivity) {
		this.inactivity = inactivity;
	}

}