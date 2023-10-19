package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.education.ws.entities.Students;
import com.education.ws.entities.UserPanel;


public interface UserPanelRepository extends JpaRepository<UserPanel,Long> {

List<UserPanel> findByUserPanelId(Long userPanelId) ;
	
	List<UserPanel> findByUserUsers(String users);
	
	List<UserPanel> findByCourses (String courses);
	
	Students findByExam(String exam);
	
	List<UserPanel> findByNotifications(String notifications);
	
	
	
}

