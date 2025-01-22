package org.example.openlibrarybook.controller;

import jakarta.persistence.Id;
import org.example.openlibrarybook.input.BookDto;
import org.example.openlibrarybook.output.Book;
import org.example.openlibrarybook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable String id) {
        return bookService.getBooks(id);
    }
}
