package com.assignment.service;

import java.util.List;

import com.assignment.model.Book;

public interface BookService {

	long save(Book book);
	   Book get(Integer id);
	   List<Book> list();
	   void update(long id, Book book);
	   void delete(long id);
}
