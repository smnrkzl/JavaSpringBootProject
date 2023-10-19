package com.education.ws.entities;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String phonenumber;
	private String password;
	private String mail;
	
	@ManyToOne
	private StudGroup studgroup;
	
	@ManyToOne
	private StudNotif studnotif;
	
	@ManyToOne
	private StudExam studexam;
	
	@ManyToOne
	private StudCours studcours;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public StudGroup getStudGroups() {
		return studgroup;
	}
	public void setGroups(StudGroup studgroup) {
		this.studgroup = studgroup;
	}
	public StudNotif getStudNotifications() {
		return studnotif;
	}
	public void setNotifications(StudNotif studnotif) {
		this.studnotif = studnotif;
	}
	public StudExam getExam() {
		return studexam;
	}
	public void setExam(StudExam studexam) {
		this.studexam = studexam;
	}
	public StudCours getStudCourses() {
		return studcours;
	}
	public void setCourses(StudCours studcours) {
		this.studcours = studcours;
	}
	
	
	
	
}
