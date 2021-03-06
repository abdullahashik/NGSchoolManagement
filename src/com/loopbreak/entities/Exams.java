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
 * Exams generated by hbm2java
 */
@Entity
@Table(name = "exams")
public class Exams implements java.io.Serializable {

	private Integer id;
	private Integer examCategoryId;
	private Integer classId;
	private String examStart;
	private String examEnd;
	private Integer examRoutineId;
	private Integer active;
	private Date createdAt;
	private Date updatedAt;

	public Exams() {
	}

	public Exams(Integer examCategoryId, Integer classId, String examStart, String examEnd, Integer examRoutineId,
			Integer active, Date createdAt, Date updatedAt) {
		this.examCategoryId = examCategoryId;
		this.classId = classId;
		this.examStart = examStart;
		this.examEnd = examEnd;
		this.examRoutineId = examRoutineId;
		this.active = active;
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
	@Column(name = "exam_category_id")
	public Integer getExamCategoryId() {
		return this.examCategoryId;
	}

	public void setExamCategoryId(Integer examCategoryId) {
		this.examCategoryId = examCategoryId;
	}

	@Basic
	@Column(name = "class_id")
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Basic
	@Column(name = "exam_start")

	public String getExamStart() {
		return this.examStart;
	}

	public void setExamStart(String examStart) {
		this.examStart = examStart;
	}

	@Basic
	@Column(name = "exam_end")
	public String getExamEnd() {
		return this.examEnd;
	}

	public void setExamEnd(String examEnd) {
		this.examEnd = examEnd;
	}

	@Basic
	@Column(name = "exam_routine_id")
	public Integer getExamRoutineId() {
		return this.examRoutineId;
	}

	public void setExamRoutineId(Integer examRoutineId) {
		this.examRoutineId = examRoutineId;
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
	@Column(name = "created_at")
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
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
