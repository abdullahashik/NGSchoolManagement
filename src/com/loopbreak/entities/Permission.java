package com.loopbreak.entities;
// Generated Jun 11, 2017 10:04:11 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Permission generated by hbm2java
 */
@Entity
@Table(name="permission")
public class Permission implements java.io.Serializable {

	private Integer id;
	private String name;
	private String displayName;
	private Integer active;

	public Permission() {
	}

	public Permission(String name, String displayName, Integer active) {
		this.name = name;
		this.displayName = displayName;
		this.active = active;
	}
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="display_name")
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

}