package com.java8.lamda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(363, "Hibernate", 180));
		books.add(new Book(275, "Spring", 200));
		books.add(new Book(893, "WebService", 300));
		return books;
	}
}
