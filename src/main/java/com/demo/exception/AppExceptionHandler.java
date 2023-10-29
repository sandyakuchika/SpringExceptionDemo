package com.demo.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=NullPointerException.class)
	public String handleException(Model model) {
		model.addAttribute("errorMsg","Some Problem has occured");
		return "errorNull";
	}
	
	@ExceptionHandler(value=BookNotFoundCustomException.class)
	public String handlebookNotFoundException(Model model) {
		model.addAttribute("errorMsg","bookNotFound");
		return "errorNull";
	}
}
