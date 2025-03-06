package com.springland365.graphql_sample.controller;

import com.springland365.graphql_sample.model.BookEntity;
import com.springland365.graphql_sample.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookQueryResolver {

    private final BookRepository bookRepository;

    public BookQueryResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public Optional<BookEntity> getBookById(@Argument  Long id) {
        return bookRepository.findById(id);
    }

}
