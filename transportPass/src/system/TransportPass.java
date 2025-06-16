package system;
import models.User;
import models.BusTicket;
import models.MetroTicket;

import java.util.Scanner;

public class TransportPass {
	
	{
		User u1 = new User("assyl", "1234567a");
		User.addUser(u1);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		TransportPass t = new TransportPass();
		
		System.out.println("Welcome to Transport Pass!");
		System.out.println("Please, login to the system!");
		
		boolean isLogged = false;
		User currentUser = null;
		
		while (!isLogged) {
			System.out.println("Please, enter the login:");
			String username = s.nextLine();
			System.out.println("Please, enter the password:");
			String password = s.nextLine();
			
			currentUser = User.login(username, password);
			
			if (currentUser != null) {
				isLogged = true;
			} else {
				System.err.println("Please, enter the correct credentials!");
			}
		}
		
		// We have current user!
		System.out.println("Welcome, " + currentUser + "!");
		
		boolean quit = false;
		
		while (!quit) {
			System.out.println("Please, choose some option (Enter just number!):");
			System.out.println("1. Buy ticket!");
			System.out.println("2. Purchase history!");
			System.out.println("3. Quit!");
			
			String option = s.nextLine();
			
			if (option.equals("1")) {
				boolean isAllBought = false;
				
				while(!isAllBought) {
					System.out.println("Please, choose the ticket type:");
					System.out.println("1. Bus ticket");
					System.out.println("2. Metro ticket");
					
					String ticketType = s.nextLine();
					
					switch (ticketType) {
						case "1":
							System.out.println("Please, enter the bus number:");
							String busNumber = s.nextLine();
							currentUser.buyTicket(new BusTicket(Integer. parseInt(busNumber)));
							break;
						case "2":
							currentUser.buyTicket(new MetroTicket());
							break;
						default:
							System.err.println("Please, enter the valid number");
					}
					
					System.out.println("Do you finished buying the tickets?");
					System.out.println("1. Yes!");
					System.out.println("2. No!");
					
					String isFinished = s.nextLine();
					
					switch (isFinished) {
					case "1":
						isAllBought = true;
						break;
					default:
						break;
					}
				}
			} else if (option.equals("2")) {
				currentUser.showPurchaseHistory();
			} else if (option.equals("3")) {
				quit = true;
			} else {
				System.err.println("Please, enter the valid number!");
			}
			
//			switch(option) {
//			case "1":
//				break;
//			case "2":
//				currentUser.showPurchaseHistory();
//				break;
//			case "3":
//				quit = true;
//				break;
//			default:
//				System.err.println("Please, enter the valid number!");
//				break;
//			}
		}
		
		System.err.println("Good bye, " + currentUser + "!");
		
		s.close();
	}

}
