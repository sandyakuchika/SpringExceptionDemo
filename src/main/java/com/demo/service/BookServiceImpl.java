package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.exception.BookNotFoundCustomException;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Double findBookPrice(int bookId) {
		if (bookId == 101) {
			return 8.0;
		} else {
			throw new BookNotFoundCustomException("Book Not Found exception");
		}
	}
}
