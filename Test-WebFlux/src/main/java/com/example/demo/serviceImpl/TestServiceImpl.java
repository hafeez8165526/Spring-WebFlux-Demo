package com.example.demo.serviceImpl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import ch.qos.logback.classic.Logger;
import reactor.core.publisher.Flux;

@Service
public class TestServiceImpl {
	
	static Logger logger=(Logger) LoggerFactory.getLogger(TestServiceImpl.class);
	
	@Autowired
	private  WebClient client;
	
	public Flux<?> getStudentNames(){
		logger.info(Thread.currentThread().getName()+" Thread name");
 		Flux<Object> res=client.get().uri("http://localhost:9000/getNames").retrieve().bodyToFlux(Object.class);
//		logger.info("<==== "+res.getBody().toString());
 		res=res.concatWith(client.get().uri("http://localhost:9000/getHafeez").retrieve().bodyToFlux(Object.class));
		 res.subscribe();
		 return res;
		

	}
	
	
}
