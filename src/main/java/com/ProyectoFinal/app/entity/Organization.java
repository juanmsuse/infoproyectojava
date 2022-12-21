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
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Turn> turn;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private User user;
	
	@Column
	private Integer tel;

	// este parametro hace referecia a inactivo en la api
	@Column(name="inactivity")
	private boolean inactivity = Boolean.valueOf(false);

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

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Turn> getTurn() {
		return turn;
	}

	public void setTurn(List<Turn> turn) {
		this.turn = turn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public boolean isInactivity() {
		return inactivity;
	}

	public void setInactivity(boolean inactivity) {
		this.inactivity = inactivity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Organization(Long id, String name, Integer cuit, String password, String address, String email,
			Date subscription, List<Event> events, List<Turn> turn, User user, Integer tel, boolean inactivity) {
		super();
		this.id = id;
		this.name = name;
		this.cuit = cuit;
		this.password = password;
		this.address = address;
		this.email = email;
		this.subscription = subscription;
		this.events = events;
		this.turn = turn;
		this.user = user;
		this.tel = tel;
		this.inactivity = inactivity;
	}

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", cuit=" + cuit + ", password=" + password + ", address="
				+ address + ", email=" + email + ", subscription=" + subscription + ", events=" + events + ", turn="
				+ turn + ", user=" + user + ", tel=" + tel + ", inactivity=" + inactivity + "]";
	}

	}