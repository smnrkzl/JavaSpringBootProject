package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.education.ws.entities.Security;
import com.education.ws.entities.Students;

public interface SecurityRepository extends JpaRepository<Security,Long> {

List<Security> findBySecurityId(Long userId) ;
	
	List<Security> findByMove(String move);
	
	List<Security> findByUser(String user);

	void updateSecurity(Security security);
	
	
}

