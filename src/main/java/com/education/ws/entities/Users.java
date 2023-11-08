 package com.education.ws.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="users")
@Data
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date registrationDate;
	private String update;
	private String role;
	private String nameSurname;
	private String phoneNumber;
	private String mail;
	//veri tiplerini yazdığın kağitta 'gruplar' adından bir veri var bunun nereye bağlı olduğuna bak sistemd
	

}
