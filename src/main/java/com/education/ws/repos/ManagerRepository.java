package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.ws.entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Long> {

List<Manager> findByUserId(Long userId) ;
	
	List<Manager> findByUserName(String name);
	
	List<Manager> findByMail(String mail);
	
	List<Manager> findByCourses(String courses);
	
	List<Manager> findByNotifications(String notifications);
	
	List<Manager> findByExam (String exam);
	
	List<Manager> findBySecurity (String security);
}
