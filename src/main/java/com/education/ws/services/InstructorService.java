package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.ws.entities.Exam;
import com.education.ws.entities.Instructor;
import com.education.ws.entities.Students;
import com.education.ws.repos.CoursesRepository;
import com.education.ws.repos.GroupsRepository;
import com.education.ws.repos.InstructorRepository;
import com.education.ws.repos.NotificationsRepository;

public class InstructorService {

	@Autowired
	private CoursesRepository coursesRepository;
	
	@Autowired
	private NotificationsRepository notificationsRepository;
	
	@Autowired
	private GroupsRepository groupsRepository;
	
	@Autowired
	private InstructorRepository ınstructorRepository;
	
	public Instructor getById(Long id) {
		return ınstructorRepository.findById(id).get(); 
	}
	
	public Instructor saveNameMail(String name, String mail) {
		   return ınstructorRepository.save(name,mail,mail);
		  }
	
	public Instructor deleteNameMail(String name, String mail) {
		   return ınstructorRepository.delete(name,mail,mail);
		  }
	
}
