package lms;

import java.util.Vector;

public class Library {
	private Vector<Book> books;
	
	{
		books = new Vector<Book>();
	}
	
	public Vector<Book> getBooks() {
		return this.books;
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
	
	public void assign(Book b, User user) { 
		 b.setUser(user);
		 user.books.add(b);
	}
}
