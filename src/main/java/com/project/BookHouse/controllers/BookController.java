package com.project.BookHouse.controllers;

import com.project.BookHouse.models.Book;
import com.project.BookHouse.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("/books")
    public List<Book> getBook(){
        return bookService.getBooks();
    }
}
