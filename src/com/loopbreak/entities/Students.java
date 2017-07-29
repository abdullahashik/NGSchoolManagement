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
@Table(name = "students")
public class Students implements java.io.Serializable {

	private Integer id;
	private String fname;
	private String mname;
	private String lname;
	private String studentId;
	private String accessCode;
	private Integer parentId;
	private Integer PStatus;
	private Date createdAt;
	private Date updatedAt;

	public Students() {

	}

	public Students(String fname, String mname, String lname, String studentId, String accessCode, Integer parentId,
			Integer PStatus, Date createdAt, Date updatedAt) {
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.studentId = studentId;
		this.accessCode = accessCode;
		this.parentId = parentId;
		this.PStatus = PStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Students(String fname, String mname, String lname, String studentId, String accessCode, Integer parentId,
			Integer PStatus) {
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.studentId = studentId;
		this.accessCode = accessCode;
		this.parentId = parentId;
		this.PStatus = PStatus;
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

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Basic
	@Column(name = "student_id")
	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Basic
	@Column(name = "access_code")
	public String getAccessCode() {
		return this.accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	@Basic
	@Column(name = "parent_id")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Basic
	@Column(name = "p_status")
	public Integer getPStatus() {
		return this.PStatus;
	}

	public void setPStatus(Integer PStatus) {
		this.PStatus = PStatus;
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
