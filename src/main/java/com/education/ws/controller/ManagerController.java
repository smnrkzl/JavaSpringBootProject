package com.education.ws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.ws.services.ManagerService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/manager")
@AllArgsConstructor
public class ManagerController {

	private ManagerService managerService;
	
}
