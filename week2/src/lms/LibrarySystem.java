package lms;

import java.util.Scanner;
import java.util.Vector;

public class LibrarySystem {
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner s = new Scanner(System.in);
		
		boolean run = true; 
		System.out.println("Welcome to the LMS!");
		System.out.println("Please, write down the options");
		System.out.println("create book");
		System.out.println("display books");
		System.out.println("assign book");
		System.out.println("quit");
		
		while(run) {
			System.out.println("Enter the query: ");	
			String query = s.nextLine();
			
			if (query.equals("create book")) {
				String bookName = s.nextLine();
				Book b = new Book(bookName);
				
				lib.addBook(b);
				
				System.out.println("Book is added");
			} else if (query.equals("display books")) {
				Vector<Book> currBooks = lib.getBooks();
				for (int i = 0; i < currBooks.size(); ++i) {
					Book currBook = currBooks.elementAt(i);
					System.out.println(currBook.getName() 
							+ " " + currBook.getUser());
				}
			} else if (query.equals("assign book")) {
				System.out.println("Please, enter the username: ");
				String username = s.nextLine();
				Vector<Book> currBooks = lib.getBooks();
				
				for (int i = 0; i < currBooks.size(); ++i) {
					System.out.println(currBooks.elementAt(i));
				}
				
				System.out.println("Please, write down the book name: ");
				String bookName = s.nextLine();
				
				Book selected = null;
				for (int i = 0; i < currBooks.size(); ++i) {
					if(currBooks.elementAt(i).getName().equals(bookName)) {
						selected = currBooks.elementAt(i);
					}
				}
				
				lib.assign(selected, new User(username));
				
				System.out.println("The book is assigned!");
			}
			else if (query.equals("quit")) {
				run = false;
			}
		}
		s.close();
		System.out.println("Good bye!");
	}
}
