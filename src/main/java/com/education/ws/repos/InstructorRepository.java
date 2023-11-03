package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.ws.entities.Instructor;






public interface InstructorRepository extends JpaRepository<Instructor,Long> {
	
List<Instructor> findByInstructorId(Long userId) ;
	
	List<Instructor> findByName(String name);
	
	List<Instructor> findByMail(String mail);
	
	Instructor findByCourses(String courses);
	
	List<Instructor> findByNotifications(String notifications);
	
	List<Instructor> findByInsGroup (String group);
	
	List<Instructor> findByPassword (String password);

	Instructor save(String name, String mail, String mail2);

	Instructor delete(String name, String mail, String mail2);
	
	
}



