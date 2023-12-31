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
	
	public void getDeleteId(Long id) {
		  examRepository.deleteById(id);; 
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
	
	public ExamBooklet saveExamBooklet(ExamBooklet examBooklet) {
		return examBookletRepository.save(examBooklet);
	}
	
	public ExamCalendar saveExamCalendar(ExamCalendar examCalendar) {
		return examCalendarRepository.save(examCalendar);
	}
	
	public Exam updateNameHourDate(String name, String hour, String date) {
		   return examRepository.update(name,hour,date);
		  }
	
	public Exam saveNameHourDate(String name, String hour, String date) {
		   return examRepository.save(name,hour,date);
		  }
	
	public ExamBooklet examBookletUpdate(ExamBooklet examBooklet) {
		   return examBookletRepository.examBookletUpdate(examBooklet);
		  }
	
	public ExamCalendar ExamCalendarUpdate(ExamCalendar examCalendar) {
		return examCalendarRepository.updateExamCalendar(examCalendar); 
	}
	
}
