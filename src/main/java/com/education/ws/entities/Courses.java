package com.education.ws.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    Groups groups;
    AllCourses allcourses;
    ManageCourses managecourses;
}
