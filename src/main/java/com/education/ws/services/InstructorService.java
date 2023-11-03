package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.ws.entities.Courses;
import com.education.ws.entities.Exam;
import com.education.ws.entities.Groups;
import com.education.ws.entities.Instructor;
import com.education.ws.entities.Notifications;
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
		   return ınstructorRepository.save(name,mail);
		  }
	
	public Instructor deleteNameMail(String name, String mail) {
		   return ınstructorRepository.delete(name,mail);
		  }
	public Instructor updateNameMail(String name, String mail) {
		   return ınstructorRepository.update(name,mail);
		  }
	
	public void CoursesDelete(Courses courses) {
		coursesRepository.delete(courses); 
	}
	public void CoursesSave(Courses courses) {
		coursesRepository.save(courses); 
	}
	
	public void CoursesUpdate(Courses courses) {
		coursesRepository.updateCourses(courses); 
	}
	public void NotificationsUpdate(Notifications notifications) {
		notificationsRepository.updateNotifications(notifications); 
	}
	
	public void NotificationsDelete(Notifications notifications) {
		notificationsRepository.deleteNotifications(notifications); 
	}
	
	public void NotificationsSave(Notifications notifications) {
		notificationsRepository.saveNotifications(notifications); 
	}
	public void GroupsSave(Groups groups) {
		groupsRepository.save(groups); 
	}
	
	public void GroupsDelete(Groups groups) {
		groupsRepository.delete(groups); 
	}
}
