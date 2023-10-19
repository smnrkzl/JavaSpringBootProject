package com.education.ws.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="notifications")
public class Notifications {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date date;
	private String writer;
	private String subject;
	private String readingrate;
	private String numberpeoplesaw;
	private String numberpeoplesent;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getReadingrate() {
		return readingrate;
	}
	public void setReadingrate(String readingrate) {
		this.readingrate = readingrate;
	}
	public String getNumberpeoplesaw() {
		return numberpeoplesaw;
	}
	public void setNumberpeoplesaw(String numberpeoplesaw) {
		this.numberpeoplesaw = numberpeoplesaw;
	}
	public String getNumberpeoplesent() {
		return numberpeoplesent;
	}
	public void setNumberpeoplesent(String numberpeoplesent) {
		this.numberpeoplesent = numberpeoplesent;
	}
	
	
}
