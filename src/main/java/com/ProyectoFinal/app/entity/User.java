package com.ProyectoFinal.app.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GenerationType;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;


import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;


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
	
	@Column
	private Integer dni;
	
	@Column
	private String code;
	

	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "users_id_turns_id", 
        joinColumns = { @JoinColumn(name = "user_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "turn_id")} , 
        uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","turn_id"})}
       )
	private List<Turn> turn;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "users_id_events_id", 
        joinColumns = { @JoinColumn(name = "user_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "event_id")} , 
        uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","event_id"})}
    )
	private List<Event> events;
	
	
	private Organization organization;
	// este parametro hace referecia a inactivo en la api
	@Column(name="inactivity_app")
	private boolean inactivityApp = Boolean.valueOf(false);

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String name, String lastname, Integer dni, String code, List<Turn> turn, List<Event> events,
			Organization organization, boolean inactivityApp) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
		this.code = code;
		this.turn = turn;
		this.events = events;
		this.organization = organization;
		this.inactivityApp = inactivityApp;
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

	public String getLastname() {
		return lastname;
	}

	public Integer getDni() {
		return dni;
	}

	public String getCode() {
		return code;
	}

	public List<Turn> getTurn() {
		return turn;
	}

	public List<Event> getEvents() {
		return events;
	}

	public Organization getOrganization() {
		return organization;
	}

	public boolean isInactivityApp() {
		return inactivityApp;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setTurn(List<Turn> turn) {
		this.turn = turn;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void setInactivityApp(boolean inactivityApp) {
		this.inactivityApp = inactivityApp;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastname=" + lastname + ", dni=" + dni + ", code=" + code
				+ ", turn=" + turn + ", events=" + events + ", organization=" + organization + ", inactivityApp="
				+ inactivityApp + "]";
	}
	
}

	
	
	
	


