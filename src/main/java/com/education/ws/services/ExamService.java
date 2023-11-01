package com.education.ws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.education.ws.entities.Exam;
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
	
	
}
