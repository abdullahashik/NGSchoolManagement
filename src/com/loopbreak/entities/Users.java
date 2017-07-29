package com.loopbreak.entities;
// Generated Jun 11, 2017 10:04:11 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users implements java.io.Serializable {

	private Integer id;
	private String name;
	private String email;
	private Integer active;
	private String password;
	private Date createdAt;
	private Date updatedAt;

	public Users() {
	}

	public Users(String password) {
		this.password = password;
	}

	public Users(String name, String email, Integer active, String password, Date createdAt, Date updatedAt) {
		this.name = name;
		this.email = email;
		this.active = active;
		this.password = password;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	@Basic
	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Basic
	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	@Column(name="created_at")
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	@Basic
	@Column(name="updated_at")
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
