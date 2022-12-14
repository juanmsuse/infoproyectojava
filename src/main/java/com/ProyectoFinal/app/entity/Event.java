package com.ProyectoFinal.app.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity(name="events")
public class Event  implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column
		private String name;
		
		private Organization organization;
		

		@Column
		private String address;
		
		@Column
		private Date creation;
		
		@Column (name="event_celebration")
		private Date eventCelebration;
		
		
		@Column
		private boolean type= Boolean.TRUE;

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getAddress() {
			return address;
		}

		public Date getCreation() {
			return creation;
		}

		public Date getEventCelebration() {
			return eventCelebration;
		}


		public boolean isType() {
			return type;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setCreation(Date creation) {
			this.creation = creation;
		}

		public void setEventCelebration(Date eventCelebration) {
			this.eventCelebration = eventCelebration;
		}


		public void setType(boolean type) {
			this.type = type;
		}
		
		public Organization getOrganization() {
			return organization;
		}

		public void setOrganization(Organization organization) {
			this.organization = organization;
		}

		public Event(Long id, String name, String address, Date creation, Date eventCelebration,
				Organization organization, boolean type) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.creation = creation;
			this.eventCelebration = eventCelebration;
			this.type = type;
			this.organization = organization;
		}

		public Event() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

	

}
