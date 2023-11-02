package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.ws.entities.Courses;
import com.education.ws.entities.Exam;
import com.education.ws.entities.ExamBooklet;
import com.education.ws.entities.Groups;
import com.education.ws.entities.Students;
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
	
	public Students getById(Long id) {
		return studentRepository.findById(id).get(); 
	}
	
	
	public Courses save(Courses courses) {
		return coursesRepository.save(courses);
	}
	
	public Exam save(Exam exam) {
		return examRepository.save(exam);
		
	}
	
	
	public Groups save(Groups groups) {
		return groupsRepository.save(groups);
	}
	
	public void CoursesDelete(Courses courses) {
		coursesRepository.delete(courses); 
	}
	
	public void GroupsDelete(Groups groups) {
		groupsRepository.delete(groups); 
	}
	
	
	public void ExamDelete(Exam exam) {
		examRepository.delete(exam); 
	}
	
	
	public Students updateNameMailPhoneNumber(String name, String mail, String phoneNumber) {
		   return studentRepository.update(name,mail,phoneNumber);
		  }
	
	public Students deleteNameMailPhoneNumber(String name, String mail, String phoneNumber) {
		   return studentRepository.delete(name,mail,phoneNumber);
		  }
	
	public Students saveNameMailPhoneNumber(String name, String mail, String phoneNumber) {
		   return studentRepository.save(name,mail,phoneNumber);
		  }
	
	public Courses coursesUpdate(Courses courses) {
		   return studentRepository.coursesUpdate(courses);
		  }
	
}
