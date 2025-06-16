package models;

public class BusTicket extends Ticket {
	private int routeNo;
	
	public BusTicket(int routeNo) {
		this.routeNo = routeNo;
	}
	
	public int getRouteNo() {
		return this.routeNo;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Bus number: " + this.getRouteNo());
	}
	
	@Override
	public double getPrice() {
		return 120.0;
	}
}
