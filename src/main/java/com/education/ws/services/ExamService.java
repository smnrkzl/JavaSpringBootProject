package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.ws.repos.ExamBookletRepository;
import com.education.ws.repos.ExamCalendarRepository;

@Service
public class ExamService {

	@Autowired
	private ExamBookletRepository examBookletRepository;
	
	
	@Autowired
	private ExamCalendarRepository examCalendarRepository;
	
	
	
	
}
