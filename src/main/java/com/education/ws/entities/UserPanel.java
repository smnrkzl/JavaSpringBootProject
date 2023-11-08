package com.education.ws.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="userpanel")
@Data
public class UserPanel {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	Users users;
	Courses courses;
	Exam exam;
	Notifications notifications;
}
