package lms;

import java.util.Scanner;

public class LibrarySystem {
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner s = new Scanner(System.in);
		
		boolean run = true; 
		System.out.println("Welcome to the LMS!");
		System.out.println("Please, write down the options");
		System.out.println("create user");
		System.out.println("create book");
		System.out.println("quit");
		
		while(run) {
			System.out.println("Enter the query: ");	
			String query = s.nextLine();
			
			if (query.equals("create user")) {
				// user
			} else if (query.equals("create book")) {
				String bookName = s.nextLine();
				Book b = new Book(bookName);
				
				lib.addBook(b);
				
				System.out.println("Book is added");
			} else if (query.equals("assign book")) {
				String username = s.nextLine();
				// show books
				// enter ID of book / name
				
//				lib.assign(b, new User(username));
			}
			else if (query.equals("quit")) {
				run = false;
			}
		}
		s.close();
		System.out.println("Good bye!");
	}
}
