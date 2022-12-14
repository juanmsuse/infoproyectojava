package com.ProyectoFinal.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turn implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name="turn_date")
	private Date turnDate;
	
	@Column
	private String code;
	
	@Column
	private boolean active= Boolean.TRUE;

	public Long getId() {
		return id;
	}

	public Date getTurnDate() {
		return turnDate;
	}

	public String getCode() {
		return code;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTurnDate(Date turnDate) {
		this.turnDate = turnDate;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Turn(Long id, Date turnDate, String code, boolean active) {
		super();
		this.id = id;
		this.turnDate = turnDate;
		this.code = code;
		this.active = active;
	}

	public Turn() {
		super();
		// TODO Auto-generated constructor stub
	}

}
