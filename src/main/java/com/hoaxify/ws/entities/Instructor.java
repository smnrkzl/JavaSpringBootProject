package com.hoaxify.ws.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String Name;
	private String Mail;
	
	@OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Courses courses;
	
	@OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Notifications notifications;
	
	@OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Exam exam;
	
	
	@ManyToOne
	private InsGroup ınsgroup;
	
	private String Password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public InsGroup getInsGroup() {
		return ınsgroup;
	}
	public void setInsGroup(InsGroup ınsgroup) {
		this.ınsgroup = ınsgroup;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public Notifications getNotifications() {
		return notifications;
	}
	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	

}
