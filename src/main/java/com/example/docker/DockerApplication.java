package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DockerApplication {


	@GetMapping("/")
	public String greetings(){
		return "Welcome to AWS first Deployment....";
	}
	public static void main(String[] args) {

		SpringApplication.run(DockerApplication.class, args);
	}

}

