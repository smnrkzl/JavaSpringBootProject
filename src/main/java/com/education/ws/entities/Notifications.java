package com.education.ws.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="notifications")
@Data
public class Notifications {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date date;
	private String notificationsName;
	private String writer;
	private String subject;
	private String readinGrate;
	private String numberPeopleSaw;
	private String numberPeopleSent;
	
	
	
	
}
