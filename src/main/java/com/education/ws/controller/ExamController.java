package com.education.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.ws.entities.Exam;
import com.education.ws.services.ExamService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/exam")
@AllArgsConstructor
public class ExamController {

	private ExamService examService;
	
	/*@GetMapping("/{userId}")
	public UserResponse getOneUser(@PathVariable Long userId) {
		Exam exam = examService.getById(userId);
		if(exam == null) {
			throw new UserNotFoundException();
		}
		return new UserResponse(user);
	}*/
}
