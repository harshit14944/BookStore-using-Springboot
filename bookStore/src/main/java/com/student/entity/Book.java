package com.student.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "name" , nullable = false)
private String name;

@Column(name = "author")
private String author;

@Column(name = "price")
private String price;


public long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Book(long id, String name, String author, String price) {
	super();
	this.name = name;
	this.author = author;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}

}
