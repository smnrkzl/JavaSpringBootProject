package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.education.ws.entities.Courses;


public interface CoursesRepository extends JpaRepository<Courses,Long>  {

	
List<Courses> findByCoursesId(Long coursesId) ;
	
	List<Courses> findByGroups(String groups);
	
	List<Courses> findByManageCourses(String manageCourses);
	
}
