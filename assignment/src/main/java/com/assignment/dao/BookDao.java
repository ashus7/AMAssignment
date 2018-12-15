package com.assignment.dao;

import java.util.List;

import com.assignment.model.Book;

public interface BookDao {

	   long save(Book book);
	   Book get(Integer id);
	   List<Book> list();
	   void update(long id, Book book);
	   void delete(long id);

}
