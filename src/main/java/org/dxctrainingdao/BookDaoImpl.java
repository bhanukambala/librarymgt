package org.dxctrainingdao;

import java.util.*;

import org.dxctrainingentities.Book;
import org.dxctrainingexceptions.*;

	public class BookDaoImpl implements IBookDao {
	
	private Map<String,Book> store=new HashMap<>();
	private int generateid;
	private String generateid() {
		generateid++;
		String idstr=String.valueOf(generateid);
		return idstr;
	}
	private String book;
	@Override
	public Book findById(String id) {
		Book book=store.get(id);
		if(book==null) {
			throw new BookNotFoundException("book not found for the id ");
		}
		return book;
	}
	
	@Override
	public List<Book> findAll() {
		Collection<Book> values=store.values();
		List<Book> list=new ArrayList<>();
		for(Book value:values) {
			list.add(value);
		}
		return list;
	}

	@Override
	public Book updateCost(String id, double cost) {
		Book book=findById(id);
		book.setCost(cost);
		return book;
	}

	@Override
	public void add(Book book) {
		String id=generateid();
		book.setId(id);
		
	}

	@Override
	public Book update(Book book) {
		String id=book.getId();
		return book;
	}

	@Override
	public void delete(Book book) {
		store.remove(book);
	}

}
