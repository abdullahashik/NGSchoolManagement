package com.loopbreak.entities;
// Generated Jun 11, 2017 10:04:11 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ExamSummaryResult generated by hbm2java
 */
@Entity
@Table(name = "exam_summary_result")
public class ExamSummaryResult implements java.io.Serializable {

	private Integer id;
	private Integer examId;
	private Integer studentId;
	private Integer totalMarks;
	private Integer obtainedTotal;
	private Integer position;
	private Integer active;

	public ExamSummaryResult() {
	}

	public ExamSummaryResult(Integer examId, Integer studentId, Integer totalMarks, Integer obtainedTotal,
			Integer position, Integer active) {
		this.examId = examId;
		this.studentId = studentId;
		this.totalMarks = totalMarks;
		this.obtainedTotal = obtainedTotal;
		this.position = position;
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

	@Basic
	@Column(name = "exam_id")
	public Integer getExamId() {
		return this.examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	@Basic
	@Column(name = "student_id")
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Basic
	@Column(name = "total_marks")
	public Integer getTotalMarks() {
		return this.totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Basic
	@Column(name = "obtained_total")
	public Integer getObtainedTotal() {
		return this.obtainedTotal;
	}

	public void setObtainedTotal(Integer obtainedTotal) {
		this.obtainedTotal = obtainedTotal;
	}

	@Basic
	@Column(name = "position")
	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Basic
	@Column(name = "active")
	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

}