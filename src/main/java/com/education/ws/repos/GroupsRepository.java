package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.education.ws.entities.Groups;
import com.education.ws.entities.Manager;


public interface GroupsRepository extends JpaRepository<Groups,Long>{
	
	
List<Groups> findByGroupsId(Long userId) ;
	
	List<Groups> findByCourse(String courses);
	
	List<Groups> findByDescription(String description);
	
	Groups updateGroups(Groups groups);
}

