package com.loopbreak.entities;
// Generated Jun 11, 2017 10:04:11 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StudentGurdialRels generated by hbm2java
 */
@Entity
@Table(name = "student_gurdial_rels")
public class StudentGurdialRels implements java.io.Serializable {

	private Integer id;
	private Integer studentsId;
	private Integer gurdiansId;
	private Integer active;
	private Date createdAt;

	public StudentGurdialRels() {
	}

	public StudentGurdialRels(Integer studentsId, Integer gurdiansId, Integer active, Date createdAt) {
		this.studentsId = studentsId;
		this.gurdiansId = gurdiansId;
		this.active = active;
		this.createdAt = createdAt;
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

	@Column(name = "students_id")
	public Integer getStudentsId() {
		return this.studentsId;
	}

	public void setStudentsId(Integer studentsId) {
		this.studentsId = studentsId;
	}

	@Column(name = "gurdians_id")
	public Integer getGurdiansId() {
		return this.gurdiansId;
	}

	public void setGurdiansId(Integer gurdiansId) {
		this.gurdiansId = gurdiansId;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "created_at")
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
