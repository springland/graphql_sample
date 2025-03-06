package com.springland365.graphql_sample.controller;

import com.springland365.graphql_sample.model.BookEntity;
import com.springland365.graphql_sample.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookMutationResolver {

    private final BookRepository bookRepository;

    public BookMutationResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @MutationMapping
    public BookEntity addBook(@Argument String title, @Argument String author) {
        BookEntity book = new BookEntity(title, author);
        return bookRepository.save(book);
    }
}
