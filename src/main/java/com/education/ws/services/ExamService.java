package com.education.ws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.education.ws.entities.Exam;
import com.education.ws.entities.ExamBooklet;
import com.education.ws.entities.ExamCalendar;
import com.education.ws.repos.ExamBookletRepository;
import com.education.ws.repos.ExamCalendarRepository;
import com.education.ws.repos.ExamRepository;

@Service
public class ExamService {

	@Autowired
	private ExamBookletRepository examBookletRepository;
	
	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private ExamCalendarRepository examCalendarRepository;
	
	public Exam getById(Long id) {
		return examRepository.findById(id).get(); 
	}
	
	public List<Exam> getByExamName(String name) {
		return examRepository.findByExamName(name);
	}
	
	public void ExamBookletDelete(ExamBooklet examBooklet) {
		examBookletRepository.delete(examBooklet); 
	}
	
	public void ExamCalendarDelete(ExamCalendar examCalendar) {
		examCalendarRepository.delete(examCalendar); 
	}
	
	public Exam deleteNameHourDate(String name, String hour, String date) {
	   return examRepository.deleteByDateNameHour(name, hour,date);
	  }
	
	public ExamBooklet save(ExamBooklet examBooklet) {
		return examBookletRepository.save(examBooklet);
	}
	
	public ExamCalendar save(ExamCalendar examCalendar) {
		return examCalendarRepository.save(examCalendar);
	}
	
	public Exam updateNameHourDate(String name, String hour, String date) {
		   return examRepository.update(name,hour,date);
		  }
	
	
	
	
}
