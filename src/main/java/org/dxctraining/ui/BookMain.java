package org.dxctraining.ui;

import java.util.*;

import org.dxctrainingexceptions.*;
import org.dxctrainingentities.*;
import org.dxctrainingservice.*;


public class BookMain {
	private IBookService service=new BookServiceImpl();
	public static void main(String[] args) {
		BookMain demo = new BookMain();
		demo.runApp();
	}
	public void runApp() {
		try {
			Author a1= new Author("h1","stephen king");
			Author a2= new Author("h2","toni");
			Book b1=new Book(73);
			Book b2=new Book(724);
			ItBook book1=new ItBook("bk1 ","misery ",a1,1500,b1, "english",1.0);
			service.add(book1);
			String id1=book1.getId();
			FictionBook book2=new FictionBook("bk2 ","Beloved ",a2,2000,b2, "bhanu");
			service.add(book1);
			String id2=book2.getId();
			service.delete(book1.getBook());
			service.updateCost(book2.getId(),2500);

			Book fetched = service.findById(id1);
			display(fetched);
			System.out.println("display all the books");
			displayAll();
			}
		 catch (InvalidArgumentException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

			catch (BookNotFoundException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

			catch (Exception e) {
				e.printStackTrace();
				System.out.println("some thing went wrong");
			}

			
		}
		private void displayAll() {
			List<Book> list=service.findAll();
			for(Book book:list) {
				display(book);
			}
			
		}
		public void display(Book book) {
			System.out.println(book.getId()+""+book.getName()+""+book.getAuthor()+""+book.getBook());
			if(book instanceof FictionBook) {
				FictionBook fiction=(FictionBook) book;
				System.out.println("character name is "+fiction.getCharactername());
			}
			if(book instanceof ItBook) {
				ItBook it=(ItBook) book;
				System.out.println("language is "+it.getLanguage()+" and version is "+it.getVersion());
			}
		}
	}
		