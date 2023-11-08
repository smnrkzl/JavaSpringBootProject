package com.education.ws.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="examcalendar")
@Data
public class ExamCalendar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date openingDate;
	private Date closingDate;
	private String examName;
	private String hour;
	
	
	
	
}
