package com.education.ws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.ws.services.InstructorService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/instructor")
@AllArgsConstructor
public class InstructorController {

	private InstructorService ınstructorService;
	
}
