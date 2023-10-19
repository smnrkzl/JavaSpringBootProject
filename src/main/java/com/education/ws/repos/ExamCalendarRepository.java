package com.education.ws.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.ws.entities.ExamCalendar;
import com.education.ws.entities.Users;

public interface ExamCalendarRepository extends JpaRepository<ExamCalendar,Long>{

List<ExamCalendar> findByExamCalendarId(Long examCalendarId) ;
	
	List<ExamCalendar> findByExamName(String examName);
	
	List<ExamCalendar> findByHour(String mail);
	
	ExamCalendar findByOpeningDate(Date openingdate);
	
	List<ExamCalendar> findByClosingDate(String closingDate);
	
	
	
	
}


