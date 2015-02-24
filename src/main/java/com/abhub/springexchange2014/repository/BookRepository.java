package com.abhub.springexchange2014.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhub.springexchange2014.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	public Book findByName(String name);
}
