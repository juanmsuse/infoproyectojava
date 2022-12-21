package com.ProyectoFinal.app.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;

@Entity(name="events")
public class Event  implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column
		private String name;
		@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
		@ManyToOne(fetch = FetchType.LAZY)
		private Organization organization;
		

		@Column
		private String address;
		
		@Column
		private Date creation;
		
		@Column (name="event_celebration")
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date eventCelebration;
		
		
		@Column
		private String type;
		
		@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
		@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
		private List<Turn> turn;
		
		private String password;
		
		@OneToOne(fetch = FetchType.EAGER)
		@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
		private User user;
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
		public Organization getOrganization() {
			return organization;
		}
		public void setOrganization(Organization organization) {
			this.organization = organization;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Date getCreation() {
			return creation;
		}
		public void setCreation(Date creation) {
			this.creation = creation;
		}
		public Date getEventCelebration() {
			return eventCelebration;
		}
		public void setEventCelebration(Date eventCelebration) {
			this.eventCelebration = eventCelebration;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public List<Turn> getTurn() {
			return turn;
		}
		public void setTurn(List<Turn> turn) {
			this.turn = turn;
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
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Event() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Event(Long id, String name, Organization organization, String address, Date creation,
				Date eventCelebration, String type, List<Turn> turn, String password, User user) {
			super();
			this.id = id;
			this.name = name;
			this.organization = organization;
			this.address = address;
			this.creation = creation;
			this.eventCelebration = eventCelebration;
			this.type = type;
			this.turn = turn;
			this.password = password;
			this.user = user;
		}
		@Override
		public String toString() {
			return "Event [id=" + id + ", name=" + name + ", organization=" + organization + ", address=" + address
					+ ", creation=" + creation + ", eventCelebration=" + eventCelebration + ", type=" + type + ", turn="
					+ turn + ", password=" + password + ", user=" + user + "]";
		}

}