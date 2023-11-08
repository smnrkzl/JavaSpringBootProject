package com.education.ws.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="allcourses")

public class AllCourses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String record;
	private String sources;
	private String coursesname;
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getSources() {
		return sources;
	}
	public void setSources(String sources) {
		this.sources = sources;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCoursesname() {
		return coursesname;
	}
	public void setCoursesname(String coursesname) {
		this.coursesname = coursesname;
	}
	
}
