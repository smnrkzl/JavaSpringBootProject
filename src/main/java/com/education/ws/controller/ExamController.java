package com.education.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.ws.entities.Exam;
import com.education.ws.exceptions.ExamNotFoundException;
import com.education.ws.responses.ExamResponse;
import com.education.ws.services.ExamService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/exam")
@AllArgsConstructor
public class ExamController {

	private ExamService examService;
	
	@GetMapping("/{examId}")
	public ExamResponse getOneUser(@PathVariable Long ıd) {
		Exam exam = examService.getById(ıd);
		if(exam == null) {
			throw new ExamNotFoundException();
		}
		return new ExamResponse(exam);
	}
	
	
	
}
