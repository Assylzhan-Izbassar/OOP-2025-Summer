package lms;

import java.util.Vector;

public class User {
	private String name;
	Vector<Book> books;
	
	{
		this.books = new Vector<Book>();
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
}
