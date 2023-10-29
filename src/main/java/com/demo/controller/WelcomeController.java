package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public String showWelcome(Model model) {
		model.addAttribute("name", "sandya");
		return "welcome";
	}
	
	@GetMapping("/welcomenull")
	public String showWelcomeNull(Model model) {
		model.addAttribute("name", "sandya");
		  String lname=null; 
		System.out.println(lname.length());
		return "welcome";
	}
	
	}
