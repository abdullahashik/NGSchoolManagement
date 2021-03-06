package com.loopbreak.entities;
// Generated Jun 11, 2017 10:04:11 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Books generated by hbm2java
 */
@Entity
@Table(name = "books")
public class Books implements java.io.Serializable {

	private Integer id;
	private String bookId;
	private String bookTitle;
	private String isbn;
	private String writerName;
	private Integer active;
	private Date createdAt;
	private Date updatedAt;
	private String description;

	public Books() {
	}

	public Books(String bookId, String bookTitle, String isbn, String writerName, Integer active, Date createdAt,
			Date updatedAt, String description) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.isbn = isbn;
		this.writerName = writerName;
		this.active = active;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.description = description;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Basic
	@Column(name = "book_id")
	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	@Basic
	@Column(name = "book_title")
	public String getBookTitle() {
		return this.bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Basic
	@Column(name = "isbn")
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Basic
	@Column(name = "writer_name")
	public String getWriterName() {
		return this.writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
