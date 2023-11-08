package com.education.ws.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="exam")
@Data
public class Exam {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date date;
	private String name;
	
	private String hour;
	
	ExamBooklet examBooklet;
	ExamCalendar examCalendar;
	
	
}
