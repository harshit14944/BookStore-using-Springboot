package com.bookStore.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repo.BookRepository;
import com.bookStore.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book); }

	@Override
	public Book getBookbyId(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Long id) {
	bookRepository.deleteById(id);
		
	}
	

}
