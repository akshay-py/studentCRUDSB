package com.akshay.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.student.beans.Student;
import com.akshay.student.repos.StudentRepository;
import com.akshay.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository repo;

	@Override
	public List<Student> getStudentList() {
		List<Student> studentList = repo.findAll();

		return studentList;
	}

	@Override
	public void addStudent(Student student) {
		repo.save(student);
	}

	@Override
	public void updateStudent(Student student) {
		repo.save(student);
	}

	@Override
	public void deleteStudent(int studentId) {
		repo.deleteById(studentId);
	}

}
