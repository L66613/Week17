package ru.itgirl.jdbcspringex.repository;

import ru.itgirl.jdbcspringex.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book findBookById(Long id);
}
