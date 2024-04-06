package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceImpl.TestServiceImpl;

import reactor.core.publisher.Flux;

@RestController
public class TestController {
	
	@Autowired
	private TestServiceImpl serviceImpl;
	
	@GetMapping("test")
	public String test() {
		return "test";
	}
	
	@GetMapping(value="getNames",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<?> getStudentNames() {
		return serviceImpl.getStudentNames();
	}


}
