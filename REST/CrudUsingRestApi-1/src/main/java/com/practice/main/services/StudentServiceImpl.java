package com.practice.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.main.beans.Student;
import com.practice.main.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	@Override
	public Student addStudent(Student std) {
		Student stud=studentDao.save(std);
		
		return stud;
	}
	@Override
	public List<Student> findAllStudents() {
		List<Student> stdList = studentDao.findAll();
		
		return stdList;
	}
	@Override
	public Student getStudentById(int id) {
		Optional<Student> opt=studentDao.findById(id);
		
		return opt.get();
	}
	@Override
	public Student updateStudent(Student std) {
		return studentDao.save(std);
	}
	@Override
	public boolean deleteStudent(int id) {
		boolean status=false;
		try {
			studentDao.deleteById(id);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
