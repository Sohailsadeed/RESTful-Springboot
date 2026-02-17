package com.practice.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.main.beans.Student;
import com.practice.main.services.StudentService;

@RestController
public class MyController {

	@Autowired
	StudentService studentService;

//	@GetMapping("/student")
//	public Student addStudent(@RequestParam("id") int id, @RequestParam("name") String name,
//			@RequestParam("gender") String gender, @RequestParam("city") String city) 
//	{
//		Student std = new Student();
//		std.setId(id);
//		std.setName(name);
//		std.setGender(gender);
//		std.setCity(city);
//		
//		Student student=studentService.addStudent(std);
//		return student;
//	}  
	
	@GetMapping("/student")
	public Student addStudent(@RequestBody Student std) {
		Student stud=new Student();
		stud=studentService.addStudent(std);
		return stud;
	}
	
	@PostMapping("/student")
	public List<Student> getAllStudents(){
		List<Student> list= studentService.findAllStudents();
		return list;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentDetails(@PathVariable("id") int id) {
		Student std=studentService.getStudentById(id);
		
		return std;
	}
	
	@PutMapping("/student")
	public Student updateStudentObject(@RequestBody Student std) {
		
		return studentService.updateStudent(std);
	}
	
	@DeleteMapping("/student/{id}")
	public boolean deletStudent(@PathVariable("id") int id) {
		return studentService.deleteStudent(id);
	}
}
