package com.education.ws.entities;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="students")
@Data
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String userName;
	private String phoneNumber;
	private String password;
	private String mail;
	
	@ManyToOne
	private StudGroup studGroup;
	
	@ManyToOne
	private StudNotif studNotif;
	
	@ManyToOne
	private StudExam studExam;
	
	@ManyToOne
	private StudCours studCours;
	
	
	
	
}
