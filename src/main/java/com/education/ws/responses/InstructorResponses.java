package com.education.ws.responses;

import com.education.ws.entities.Courses;
import com.education.ws.entities.Exam;
import com.education.ws.entities.Instructor;
import com.education.ws.entities.Notifications;


import lombok.Data;

@Data
public class InstructorResponses {
 
	 long id;
	 String name;
	 String mail;	
	 String courses;	
	 String notifications;	
	 String exam;
	 
	 
	public InstructorResponses(Instructor entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.mail = entity.getMail();
		this.courses = entity.getCourses().getCourseName();
		this.notifications = entity.getNotifications().getNotificationsName();
		this.exam = entity.getExam().getName();
	}
	 
	 
	
}
