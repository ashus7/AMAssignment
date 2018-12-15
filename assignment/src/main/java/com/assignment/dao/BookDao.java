package com.assignment.dao;

import java.util.List;

import com.assignment.model.Book;

public interface BookDao {

	   long save(Book book);
	   Book get(Integer id);
	   List<Book> list();
	   void update(Integer id, Book book);
	   void delete(Integer id);

}
