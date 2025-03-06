package com.springland365.graphql_sample.repository;

import com.springland365.graphql_sample.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity , Long> {

}
