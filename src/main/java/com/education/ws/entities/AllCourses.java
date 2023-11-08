package com.education.ws.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="allcourses")
@Data
public class AllCourses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String record;
	private String sources;
	private String coursesName;
	
	
	
}
