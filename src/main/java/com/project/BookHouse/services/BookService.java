package com.project.BookHouse.services;

import com.project.BookHouse.models.Book;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {

   public List<Book> getBooks(){
      Book book = new Book();
      book.setAuthor("Armstrong");
      book.setGenre("Sci-fi");
      book.setTitle("Lost in space");
      return Collections.singletonList(book);
   }
}
