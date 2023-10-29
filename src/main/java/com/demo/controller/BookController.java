package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/findBookPrice")
	public String findBookPrice(Model model, @RequestParam("bookId") int bookId) {

		Double price = bookService.findBookPrice(bookId);

		model.addAttribute("price", "Book Price" + price);

		return "bookPrice";
	}
	
	@GetMapping("/findPrice")
	public String findPrice(Model model) {

		Double price = bookService.findBookPrice(101);

		model.addAttribute("price", "Book Price" + price);

		return "bookPrice";
	}
}
