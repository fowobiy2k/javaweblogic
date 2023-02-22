package com.example.javaweblogic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class CoreController {
	
	@GetMapping("/java")
	public String read() {
		return "Hello from new class";
	}

}
