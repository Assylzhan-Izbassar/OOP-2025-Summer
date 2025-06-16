package models;

import java.util.Objects;
import java.util.Vector;

public class User {
	private final int userId;
	private String username;
	private String password;
	public static int numberOfUsers = 0;
	
	private Vector<Ticket> tickets = new Vector<Ticket>();
	
	private static Vector<User> db = new Vector<User>();
	
	{
		this.userId = User.numberOfUsers;
		User.numberOfUsers++;
	}
	
	public User(String username, String password) {
		this.username = username;

		if (this.setPassword(password)) {
			System.out.println("Password is set!");
		} else {
			System.err.println("Password lenght!");
		}
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public static Vector<User> getDb() {
		return User.db;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public boolean setPassword(String password) {
		if (password.length() > 7) {
			this.password = "TransportUser" + Objects.hash(password);
			return true;
		}
		return false;
	}
	
	public static User login(String username, String password) {
		password = "TransportUser" + Objects.hash(password);
		for (User u: User.getDb()) {
			if (u.getUsername().equals(username) 
					&& u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}
	
	public static void addUser(User newUser) {
		User.db.add(newUser);
	}
	
	public void buyTicket(Ticket ticket) { // polymorphism
		this.tickets.add(ticket);
	}
	
	public void showPurchaseHistory() {
		if (this.tickets.size() > 0) {
			for (Ticket t: this.tickets) {
				t.print();
			}
		} else {
			System.err.println("Purchase is empty!");
		}
	}
	
	@Override
	public String toString() {
		return this.getUsername();
	}
}
