package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.ws.entities.Courses;
import com.education.ws.entities.Exam;
import com.education.ws.entities.Groups;
import com.education.ws.entities.Students;

public interface StudentRepository extends JpaRepository<Students,Long>{

List<Students> findByStudentsId(Long userId) ;
	
	List<Students> findByUserName(String name);
	
	List<Students> findByMail(String mail);
	
	Students findByPhoneNumber(String courses);
	
	List<Students> findByCourse(String course);
	
	List<Students> findByExam (String exam);
	
	List<Students> findByGroup (String group);

	Students update(String name, String mail, String phoneNumber);

	Students delete(String name, String mail, String phoneNumber);

	Students save(String name, String mail, String phoneNumber);

	Courses coursesUpdate(Courses courses);

	Exam examUpdate(Exam exam);
	Groups groupsUpdate(Groups groups);
	
	
}
