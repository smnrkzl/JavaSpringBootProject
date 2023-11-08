package com.education.ws.responses;

import java.util.Date;

import com.education.ws.entities.Exam;

import lombok.Data;

@Data
public class ExamResponses {

	 Long id;
	 Date date;
	 String name;
	 String hour;
	public ExamResponses(Exam entity) {
		super();
		this.id = entity.getId();
		this.date = entity.getDate();
		this.name = entity.getName();
		this.hour = entity.getHour();
	}
	 
	 
	 
	 
}
