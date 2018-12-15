package com.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assignment.dao.BookDao;
import com.assignment.model.Book;

@Service
@Transactional(readOnly = true)
public class BookServiceImp implements BookService {

   @Autowired
   private BookDao bookDao;

   @Transactional
   @Override
   public long save(Book book) {
      return bookDao.save(book);
   }

   @Override
   public Book get(Integer id) {
      return bookDao.get(id);
   }

   @Override
   public List<Book> list() {
      return bookDao.list();
   }

   @Transactional
   @Override
   public void update(Integer id, Book book) {
      bookDao.update(id, book);
   }

   @Transactional
   @Override
   public void delete(Integer id) {
      bookDao.delete(id);
   }
}