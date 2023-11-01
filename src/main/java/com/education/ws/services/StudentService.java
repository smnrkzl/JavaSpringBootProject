package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.ws.repos.CoursesRepository;
import com.education.ws.repos.ExamRepository;
import com.education.ws.repos.GroupsRepository;
import com.education.ws.repos.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Autowired
	private GroupsRepository groupsRepository;
	
	@Autowired
	private CoursesRepository coursesRepository;
	
	
}
