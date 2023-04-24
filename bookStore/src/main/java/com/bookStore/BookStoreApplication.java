package com.bookStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookStore.entity.Book;
import com.bookStore.repo.BookRepository;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String...args) throws Exception {
		
	/*
	*Book book1 = new Book(0, "Train to Pakistan", "Kushwant Singh","100");
	*bookRepository.save(book1);
	*
	*Book book2 = new Book(0, "White Tiger", "Aravind Adiga","300");
	*bookRepository.save(book2);	
	*
	*Book book3 = new Book(0, "The Inheritance", "Kiran Desai","700");
	*bookRepository.save(book3);	
	*/
	
	}
}
