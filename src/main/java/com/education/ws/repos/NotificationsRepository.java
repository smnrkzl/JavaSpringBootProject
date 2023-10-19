package com.education.ws.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.education.ws.entities.Notifications;


public interface NotificationsRepository extends JpaRepository<Notifications,Long>{

List<Notifications> findByNotificationsId(Long id) ;
	
	List<Notifications> findByDate(Date date);
	
	List<Notifications> findByWriter(String writer);
	
	Notifications findBySubject(String subject);
	
	List<Notifications> findByReadingGrate(String readingGrate);
	
	List<Notifications> findByNumberPeopleSaw(String numberPeopleSaw);
	
	List<Notifications> findByNumberPeoplePresent (String numberPeoplePresent);
	
	
	
}


