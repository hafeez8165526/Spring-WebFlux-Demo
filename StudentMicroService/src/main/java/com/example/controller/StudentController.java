package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StudentService;

@RestController
//@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getNames")
	public List<String> getStudentNames() throws InterruptedException{
		return studentService.getStudentNames();
	}
	

	@GetMapping("/getHafeez")
	public List<String> getHafeez() throws InterruptedException{
		return studentService.getHafeez();
	}
}
