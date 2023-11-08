package com.education.ws.responses;

import java.util.Date;

import com.education.ws.entities.Exam;

import lombok.Data;

@Data
public class ExamResponse {

	 Long id;
	 Date date;
	 String name;
	 String hour;
	 String examBookletName;
	 String examCalendarName;
	public ExamResponse(Exam entity) {
		super();
		this.id = entity.getId();
		this.date = entity.getDate();
		this.name = entity.getName();
		this.hour = entity.getHour();
		this.examBookletName = entity.getExambooklet().getExamname();
		this.examCalendarName = entity.getExamcalendar().getExamName();
	}
	 
	 
	 
	 
}
