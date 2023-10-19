package com.education.ws.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserPanel {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	Users users;
	Courses courses;
	Exam exam;
	Notifications notifications;
}
