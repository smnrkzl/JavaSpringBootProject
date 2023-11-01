package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.ws.repos.ExamRepository;
import com.education.ws.repos.SecurityRepository;

@Service
public class ManagerService {

	@Autowired
	private ExamRepository examRepository;
	
	
	@Autowired
	private SecurityRepository securityRepository;
	
	
}
