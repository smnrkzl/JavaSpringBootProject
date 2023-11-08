package com.education.ws.responses;


import com.education.ws.entities.Students;

import lombok.Data;

@Data
public class StudentResponse {
	 long id;
	 String userName;
	 String phoneNumber;
	 
	 String mail;

	public StudentResponse(Students entity) {
		super();
		this.id = entity.getId();
		this.userName = entity.getUserName();
		this.phoneNumber = entity.getPhoneNumber();
		this.mail = entity.getMail();
	}
	
	
	
	
}
