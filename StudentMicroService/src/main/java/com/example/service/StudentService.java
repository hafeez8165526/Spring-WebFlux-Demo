package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
	List<String> getStudentNames() throws InterruptedException;

	List<String> getHafeez()  throws InterruptedException;

}
