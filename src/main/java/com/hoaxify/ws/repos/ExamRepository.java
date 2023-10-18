package com.hoaxify.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoaxify.ws.entities.Exam;

public interface ExamRepository extends JpaRepository<Exam,Long>{

	List<Exam> findByExamId(Long id) ;
	
	List<Exam> findByExamName(String name);
	
	Exam findByExamBooklet(String examBooklet);
	
	Exam findByExamCalendar (String examCalendar);
	
	Exam findByHour(String hour);
	
	Exam findByDate(String date);
}
