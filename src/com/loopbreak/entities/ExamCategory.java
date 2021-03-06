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

/**
 * ExamCategory generated by hbm2java
 */
@Entity
@Table(name = "eam_category")
public class ExamCategory implements java.io.Serializable {

	private Integer id;
	private Integer name;
	private String displayName;
	private Integer active;
	private Integer time;
	private Integer marks;
	private Integer createdAt;
	private Date updatedAt;

	public ExamCategory() {
	}

	public ExamCategory(Integer name, String displayName, Integer active, Integer time, Integer marks,
			Integer createdAt, Date updatedAt) {
		this.name = name;
		this.displayName = displayName;
		this.active = active;
		this.time = time;
		this.marks = marks;
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

	@Basic
	@Column(name = "name")
	public Integer getName() {
		return this.name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	@Basic
	@Column(name = "display_name")
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Basic
	@Column(name = "active")
	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Basic
	@Column(name = "time")
	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	@Basic
	@Column(name = "marks")
	public Integer getMarks() {
		return this.marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Basic
	@Column(name = "created_at")
	public Integer getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}

	@Basic
	@Column(name = "updated_at")
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
