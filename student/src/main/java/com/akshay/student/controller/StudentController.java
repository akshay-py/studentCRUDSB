package com.akshay.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
