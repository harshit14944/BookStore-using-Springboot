package com.bookStore.service;

import java.util.List;

import com.bookStore.entity.Book;

public interface BookService {
	
	public List<Book> getAllBooks();

	 Book saveBook(Book book);
	 Book getBookbyId( Long id);
	 Book updateBook(Book book);
	 
	 void deleteBookById(Long id);
}
