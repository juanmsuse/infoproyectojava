package com.ProyectoFinal.app.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity(name="users")
@SQLDelete(sql="UPDATE users SET inactivity_app = true WHERE id=?")
@Where(clause = "inactivity_app=false")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String lastname;
	
	@Column(unique=true)
	private Integer dni;
	
	@Column
	private String code;
	

	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Turn turn;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Organization organization;
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Event event;
	
	
	// este parametro hace referecia a inactivo en la api
	@Column(name="inactivity_app")
	private boolean inactivityApp = Boolean.valueOf(false);


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long id, String name, String lastname, Integer dni, String code, Turn turn, Organization organization,
			Event event, boolean inactivityApp) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
		this.code = code;
		this.turn = turn;
		this.organization = organization;
		this.event = event;
		this.inactivityApp = inactivityApp;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public Organization getOrganization() {
		return organization;
	}


	public void setOrganization(Organization organization) {
		this.organization = organization;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}


	public boolean isInactivityApp() {
		return inactivityApp;
	}


	public void setInactivityApp(boolean inactivityApp) {
		this.inactivityApp = inactivityApp;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastname=" + lastname + ", dni=" + dni + ", code=" + code
				+ ", turn=" + turn + ", organization=" + organization + ", event=" + event + ", inactivityApp="
				+ inactivityApp + "]";
	}


		}