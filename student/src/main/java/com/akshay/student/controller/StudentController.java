package com.akshay.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akshay.student.beans.Student;
import com.akshay.student.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping("/studentList")
	public String showStudentList(ModelMap modelMap) {
		List<Student> studentList = studentService.getStudentList();
		modelMap.addAttribute("studentList", studentList);

		return "studentList";
	}

	@RequestMapping("/addStudentForm")
	public String showAddStudent() {
		return "addStudent";
	}

	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student student, ModelMap modelMap) {
		studentService.addStudent(student);

		List<Student> studentList = studentService.getStudentList();
		modelMap.addAttribute("studentList", studentList);

		return "studentList";
	}

	@RequestMapping("/updateStudentForm")
	public String showUpdateStudent() {
		return "editStudent";
	}

	@RequestMapping("/updateStudent")
	public String updateStudent(@ModelAttribute("student") Student student, ModelMap modelMap) {
		studentService.updateStudent(student);

		List<Student> studentList = studentService.getStudentList();
		modelMap.addAttribute("studentList", studentList);

		return "studentList";
	}

	public String deleteStudent(@RequestParam("studentId") Integer studentId, ModelMap modelMap) {
		studentService.deleteStudent(studentId);

		List<Student> studentList = studentService.getStudentList();
		modelMap.addAttribute("studentList", studentList);

		return "studentList";
	}
}
