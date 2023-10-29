package com.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {

	@GetMapping("/showDate")
	public String showDate(Model model) {
		model.addAttribute("datetoday", LocalDate.now().toString());
		return "showDate";
	}
	
	@GetMapping("/showDateNull")
	public String showDateNull(Model model) {
		model.addAttribute("datetoday", LocalDate.now().toString());
		String lname = null;
		System.out.println(lname.length());
		return "showDate";
	}
	
}
