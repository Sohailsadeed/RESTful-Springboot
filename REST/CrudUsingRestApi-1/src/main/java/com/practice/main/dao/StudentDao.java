package com.practice.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.main.beans.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{
	
}
