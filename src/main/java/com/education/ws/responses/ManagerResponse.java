package com.education.ws.responses;


import com.education.ws.entities.Manager;

import lombok.Data;

@Data
public class ManagerResponse {

	 long id;
	 String mail;
	 String name;	
	 String phoneNumber;	 
     String users;				
     String courses;				
     String notifications;				
	 String exam;				
	 String security;
	public ManagerResponse(Manager entity) {
		super();
		this.id = entity.getId();
		this.mail = entity.getMail();
		this.name = entity.getName();
		this.phoneNumber = entity.getPhoneNumber();
		this.users = entity.getUsers().getNameSurname();
		this.courses = entity.getCourses().getCourseName();
		this.notifications = entity.getNotifications().getNotificationsName();
		this.exam = entity.getExam().getName();
		this.security = entity.getSecurity().getMove();
	}
	 
	 
}
