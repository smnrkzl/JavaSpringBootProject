package com.education.ws.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.education.ws.entities.Users;

public interface UserRepository extends JpaRepository<Users,Long>{

List<Users> findByUserId(Long userId) ;
	
	List<Users> findByUserNameSurname(String nameSurname);
	
	List<Users> findByMail(String mail);
	
	Users findByPhoneNumber(String phoneNumber);
	
	List<Users> findByRegistrationDate(String registrationdate);
	
	List<Users> findByRole (String role);
	
	List<Users> findByUpdate (String update);
	
	
}
