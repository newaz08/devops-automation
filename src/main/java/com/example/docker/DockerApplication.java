package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DockerApplication {


	//@GetMapping("/hello")
	public String greetings(){
		return "Hello";
	}
	public static void main(String[] args) {

		SpringApplication.run(DockerApplication.class, args);
	}

}

