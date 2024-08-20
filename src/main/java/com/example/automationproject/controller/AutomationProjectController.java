package com.example.automationproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationProjectController {
	@GetMapping(value="/getmap")
public String getmap() {
		return " i am govind ";
	}
}
