package com.hoaxify.ws.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoaxify.ws.entities.ExamBooklet;


public interface ExamBookletRepository extends JpaRepository<ExamBookletRepository,Long> {

List<ExamBooklet> findByExamBookletId(Long Id) ;
	
	List<ExamBooklet> findByCategory(String category);
	
	List<ExamBooklet> findByExamName(String examName);
	
	ExamBooklet findByDescription(String description);
	
	List<ExamBooklet> findByAlteration(String alteration);
	
	List<ExamBooklet> findByRegistrationDate(String registrationdate);
	
	
}


