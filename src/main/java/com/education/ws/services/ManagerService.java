package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.ws.entities.Courses;
import com.education.ws.entities.Exam;

import com.education.ws.entities.Manager;
import com.education.ws.entities.Notifications;
import com.education.ws.entities.Security;
import com.education.ws.repos.CoursesRepository;
import com.education.ws.repos.ExamRepository;
import com.education.ws.repos.ManagerRepository;
import com.education.ws.repos.NotificationsRepository;
import com.education.ws.repos.SecurityRepository;

@Service
public class ManagerService {

	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private ManagerRepository managerRepository;
	
	
	@Autowired
	private SecurityRepository securityRepository;
	
	@Autowired
	private NotificationsRepository notificationsRepository;
	
	@Autowired
	private CoursesRepository coursesRepository;
	
	public Manager getById(Long id) {
		return managerRepository.findById(id).get(); 
	}
	
	public Manager saveNameMail(String name,  String mail) {
		   return managerRepository.save(name,mail);
		  }
	
	public Manager deleteNameMail(String name,  String mail) {
		   return managerRepository.delete(name,mail);
		  }
	
	public Manager updateNameMail(String name,  String mail) {
		   return managerRepository.update(name,mail);
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
	
	public void ExamDelete(Exam exam) {
		examRepository.delete(exam); 
	}
	public void ExamSave(Exam exam) {
		examRepository.save(exam); 
	}
	public void ExamUpdate(Exam exam) {
		examRepository.updateExam(exam); 
	}
	
	public void SecurityDelete(Security security) {
		securityRepository.delete(security); 
	}
	public void SecuritySave(Security security) {
		securityRepository.save(security); 
	}
	public void SecurityUpdate(Security security) {
		securityRepository.updateSecurity(security); 
	}
}
