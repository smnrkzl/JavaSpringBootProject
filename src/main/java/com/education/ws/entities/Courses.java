package com.education.ws.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="courses")
@Data
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    Groups groups;
    AllCourses allcourses;
    ManageCourses managecourses;
}
