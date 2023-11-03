package com.education.ws.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.ws.repos.CoursesRepository;
import com.education.ws.repos.GroupsRepository;
import com.education.ws.repos.NotificationsRepository;

public class InstructorService {

	@Autowired
	private CoursesRepository coursesRepository;
	
	@Autowired
	private NotificationsRepository notificationsRepository;
	
	@Autowired
	private GroupsRepository groupsRepository;
	
	
	
	
	
}
