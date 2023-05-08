package ru.itgirl.jdbcspringex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.jdbcspringex.model.Book;
import ru.itgirl.jdbcspringex.repository.BookRepository;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private static BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }
    @GetMapping("/book/{id}")
    public static Book getBookById(@PathVariable("id") Long id){
        return (Book) bookRepository.findBookById(id);
    }
}