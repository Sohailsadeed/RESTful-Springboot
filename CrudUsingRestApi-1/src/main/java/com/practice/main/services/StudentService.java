package com.practice.main.services;

import java.util.List;

import com.practice.main.beans.Student;

public interface StudentService {
	public Student addStudent(Student std);
	public List<Student> findAllStudents();
	public Student getStudentById(int id);
	public Student updateStudent(Student std);
	public boolean deleteStudent(int id);
}
