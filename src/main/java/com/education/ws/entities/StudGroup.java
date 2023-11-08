package com.education.ws.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="studgroup")
@Data
public class StudGroup {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	private Groups groups;

	
	
	
	
}
