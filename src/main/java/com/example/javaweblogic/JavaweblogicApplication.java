package com.example.javaweblogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaweblogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaweblogicApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String welcome() {
		return "This application is deployed on weblogic server 12c";
	}

}
