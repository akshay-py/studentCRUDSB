package com.akshay.student.service;

import java.util.List;

import com.akshay.student.beans.Student;

public interface StudentService {
	public List<Student> getStudentList();

	public void addStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(int studentId);
}
