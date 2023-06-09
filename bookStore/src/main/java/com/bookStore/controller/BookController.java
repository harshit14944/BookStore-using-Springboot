package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookStore.entity.Book;
import com.bookStore.service.BookService;

@Controller
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;

	}

	@GetMapping("/books")
	public String listBooks(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
		return "books";
	}

	@GetMapping("/books/new")
	public String createBookForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "create_book";
	}

	@PostMapping("/books")
	public String saveBook(@ModelAttribute("book") Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}
@GetMapping("/books/edit/{id}")
public String editBookForm(@PathVariable Long id, Model model) {
model.addAttribute("book", bookService.getBookbyId(id));
return "edit_book";
}
@PostMapping("/books/{id}")
public String updateBook(@PathVariable Long id,
@ModelAttribute("book") Book book, 
Model model){

Book existingBook = bookService.getBookbyId(id);
existingBook.setId(id);
existingBook.setName(book.getName());
existingBook.setAuthor(book.getAuthor());
existingBook.setPrice(book.getPrice());

bookService.updateBook(existingBook);
return "redirect:/books";
}

@GetMapping("/books/{id}")
public String deleteBook(@PathVariable Long id) {
	bookService.deleteBookById(id);
	return "redirect:/books";

}
			
}