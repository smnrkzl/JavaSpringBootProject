package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.ws.entities.Students;

public interface StudentRepository extends JpaRepository<Students,Long>{

List<Students> findByStudentsId(Long userId) ;
	
	List<Students> findByUserName(String name);
	
	List<Students> findByMail(String mail);
	
	Students findByPhoneNumber(String courses);
	
	List<Students> findByCourse(String course);
	
	List<Students> findByExam (String exam);
	
	List<Students> findByGroup (String group);
	
	
}
