package com.ProyectoFinal.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="turnos")
public class Turn implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="turn_date")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date turnDate;
	
	@Column
	private String code;
	
	@Column
	private boolean active= Boolean.TRUE;
	
	@OneToOne(mappedBy = "turn", fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Event event;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Organization organization;

	public Turn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Turn(Long id, Date turnDate, String code, boolean active, User user, Event event,
			Organization organization) {
		super();
		this.id = id;
		this.turnDate = turnDate;
		this.code = code;
		this.active = active;
		this.user = user;
		this.event = event;
		this.organization = organization;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTurnDate() {
		return turnDate;
	}

	public void setTurnDate(Date turnDate) {
		this.turnDate = turnDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Turn [id=" + id + ", turnDate=" + turnDate + ", code=" + code + ", active=" + active + ", user=" + user
				+ ", event=" + event + ", organization=" + organization + "]";
	}
	
}