package com.example.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public List<String> getStudentNames() throws InterruptedException {
		Thread.sleep(6000);
		return Arrays.asList("check","sfwef","sefwgef","wfe","check","sfwef","sefwgef","wfe");
	}
	
	@Override
	public List<String> getHafeez() throws InterruptedException  {
		Thread.sleep(6000);
		return Arrays.asList("hafeez","hafeez");
	}

}
