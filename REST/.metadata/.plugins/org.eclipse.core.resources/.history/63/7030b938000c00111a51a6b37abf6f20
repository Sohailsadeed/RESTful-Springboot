package com.practice.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.main.beans.Student;

@RestController
public class MyController {
	
	@GetMapping("/printStudent")
	public Student printDetails() {
		Student std=new Student();
		std.setRollno(1);
		std.setName("Wizard");
		std.setEmail("wizard@gmail.com");
		
		return std;
	}
}
