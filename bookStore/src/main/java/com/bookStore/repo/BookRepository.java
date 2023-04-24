package com.bookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookStore.entity.Book;
public interface BookRepository extends JpaRepository<Book, Long>{

}