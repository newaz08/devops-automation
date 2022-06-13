package com.example.docker;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DockerApplication {

	public static Logger logger = LoggerFactory.getLogger(DockerApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started...");
	}
	//@GetMapping("/hello")
	public String greetings(){
		return "Hello";
	}
	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(DockerApplication.class, args);
	}

}

