package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Book;
import com.assignment.service.BookService;



@RestController
public class BookController {

   @Autowired
   private BookService bookService;

   /*---Add new book---*/
   @PostMapping("/book")
   public ResponseEntity<?> save(@RequestBody Book book) {
      long id = bookService.save(book);
      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
   }

   /*---Get a book by id---*/
   @GetMapping("/book/{id}")
   public ResponseEntity<Book> get(@PathVariable("id") Integer id) {
      Book book = bookService.get(id);
      return ResponseEntity.ok().body(book);
   }

   /*---get all books---*/
   @GetMapping("/book")
   public ResponseEntity<List<Book>> list() {
      List<Book> books = bookService.list();
      return ResponseEntity.ok().body(books);
   }

   /*---Update a book by id---*/
   @PutMapping("/book/{id}")
   public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody Book book) {
      bookService.update(id, book);
      return ResponseEntity.ok().body("Book has been updated successfully.");
   }

   /*---Delete a book by id---*/
   @DeleteMapping("/book/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
      bookService.delete(id);
      return ResponseEntity.ok().body("Book has been deleted successfully.");
   }
}
