package com.hoaxify.ws.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="examcalendar")
public class ExamCalendar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date openingdate;
	private Date closingdate;
	private String examname;
	private String hour;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOpeningdate() {
		return openingdate;
	}
	public void setOpeningdate(Date openingdate) {
		this.openingdate = openingdate;
	}
	public Date getClosingdate() {
		return closingdate;
	}
	public void setClosingdate(Date closingdate) {
		this.closingdate = closingdate;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	
	
	
}
