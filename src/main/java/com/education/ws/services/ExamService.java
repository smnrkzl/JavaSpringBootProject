package com.education.ws.services;

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
	
	/*public Exam getById(Long id) {
		return 
	}*/
	
	
}
