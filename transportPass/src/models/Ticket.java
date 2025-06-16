package models;

public abstract class Ticket {
	private final int id;
	public static int numOfTickets = 0;
	
	{
		this.id = Ticket.numOfTickets;
		Ticket.numOfTickets++;
	}
	
	public int getId() {
		return this.id;
	}
	
	public abstract double getPrice();
	
	public void print() {
		System.out.println("=== " + this.getClass().getSimpleName() + " ===");
		System.out.println("ID: " + this.getId());
		System.out.println("Price: " + this.getPrice());
	}
	
}
