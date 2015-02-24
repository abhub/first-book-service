package com.abhub.springexchange2014.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhub.springexchange2014.model.Book;
import com.abhub.springexchange2014.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@RequestMapping("/")
	public String root() {
		return "hello book 2";
	}

	@RequestMapping("/coucou")
	public String root2() {
		return "coucou 2";
	}
	@RequestMapping("/reload")
	public String reload() {
		return "reload	";
	}

	//create a book
	@RequestMapping(value = "/book/{name}", method = RequestMethod.POST)
	public Book create(@PathVariable String name) {
		Book book = new Book();
		book.setName(name);
		book.setAuthor("Abdou");
		book.setCategory("Informatique");
		return bookRepository.save(book);
	}

	//list all book
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> list() {
		return bookRepository.findAll();
	}

	//get a book by name
	@RequestMapping(value = "/book/{name}", method = RequestMethod.GET)
	public Book find(@PathVariable String name) {
		return bookRepository.findByName(name);
	}

	//delete a book
	@RequestMapping(value = "/book/{name}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable String name) {
		Boolean deleted = false;
		Book book = this.find(name);
		Assert.notNull(book);
		bookRepository.delete(book);
		deleted = true;
		return deleted;

	}
}
