package org.dxctrainingservice;

import java.util.List;

import org.dxctrainingentities.Book;

public interface IBookService {

	List<Book> findAll();
	void add(Book book);
	Book update(Book book);
	void delete(Book book);
	Book updateCost(String id, double cost);
	Book findById(String id);

}
