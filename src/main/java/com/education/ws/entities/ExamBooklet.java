package com.education.ws.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="exambooklet")
@Data
public class ExamBooklet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
      private Date registrationDate;
      private String alteration;
      //alteration = değişiklik
      private String category;
      private String examname;
      private String description;
      
	
	
}
