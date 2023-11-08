package com.education.ws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.ws.services.ExamService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/exam")
@AllArgsConstructor
public class ExamController {

	private ExamService examService;
	
}
