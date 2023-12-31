package com.education.ws.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.ws.entities.ExamBooklet;
import com.education.ws.entities.ExamCalendar;


public interface ExamCalendarRepository extends JpaRepository<ExamCalendar,Long>{

List<ExamCalendar> findByExamCalendarId(Long examCalendarId) ;
	
	List<ExamCalendar> findByExamName(String examName);
	
	List<ExamCalendar> findByHour(String mail);
	
	ExamCalendar findByOpeningDate(Date openingdate);
	
	List<ExamCalendar> findByClosingDate(String closingDate);
	
	ExamCalendar updateExamCalendar(ExamCalendar examCalendar);
	
	
}


