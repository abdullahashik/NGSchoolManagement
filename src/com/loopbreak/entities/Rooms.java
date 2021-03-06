package com.loopbreak.entities;
// Generated Jun 11, 2017 10:04:11 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rooms generated by hbm2java
 */
@Entity
@Table(name = "rooms")
public class Rooms implements java.io.Serializable {

	private Integer idrooms;
	private String name;
	private String roomCode;
	private Integer active;
	private String description;

	public Rooms() {
	}

	public Rooms(String name, String roomCode, Integer active, String description) {
		this.name = name;
		this.roomCode = roomCode;
		this.active = active;
		this.description = description;
	}

	@Column(name = "idrooms")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public Integer getIdrooms() {
		return this.idrooms;
	}

	public void setIdrooms(Integer idrooms) {
		this.idrooms = idrooms;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="room_code")
	public String getRoomCode() {
		return this.roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
