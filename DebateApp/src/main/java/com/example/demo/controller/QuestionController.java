package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/questions")
public class QuestionController {

	@GetMapping("/getExample")
	public String getExampleQuestion() {
		return "The question controller's getExampleQuestion method is working.";
	}
}
