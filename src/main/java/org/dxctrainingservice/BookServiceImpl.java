package org.dxctrainingservice;

import java.util.List;

import org.dxctrainingdao.*;
import org.dxctrainingentities.Book;
import org.dxctrainingexceptions.*;


public class BookServiceImpl implements IBookService {
	

	private IBookDao dao =new BookDaoImpl();

	@Override
	public Book findById(String id) {
		checkId(id);
		Book book = dao.findById(id);
		return book;
	}

	private void checkId(String id) {
		if(id==null) {
			throw new InvalidArgumentException("id can't be null");
		
				}
			}
			public void checkCost(double cost) {
				if (cost<1) {
					throw new InvalidArgumentException("cost can't be negative");
				}
			}
			
			public void checkBook(Book book) {
				if(book==null) {
					throw new InvalidArgumentException("customer cant be null or empty");
						
				}
			}		
	
@Override
		 public List<Book> findAll() {
		 List<Book>list=dao.findAll();
		 return list;

	}

	@Override
	public Book updateCost(String id, double cost) {
		checkId(id);
		checkCost(cost);
		Book book=dao.updateCost(id, cost);
		return book;
	}

	@Override
	public void add(Book book) {
		checkBook(book);
		dao.add(book);
	}

	@Override
	public Book update(Book book) {
		checkBook(book);
		book =dao.update(book);
	    return book;
	}

	@Override
	public void delete(Book book) {
		checkBook(book);
		dao.delete(book);
	}

}
