package l2e1;

public class Pencil {
	public String color = "red";
	public int length;
	public double diameter;
	private double price;
	protected static final String material = "wood"; 
	
	public static int numberOfPencils = 0;
	
	public Pencil() {
		numberOfPencils += 1;
	}
	
	public Pencil(String newColor) {
		color = newColor;
	}
	
	public final void setPrice(double newPrice) {
		price = newPrice;
	}
	
//	public final void setPrice(double newPrice, double otherPrice) {
//		price = otherPrice;
//	}
	
	public final void setPrice(Pencil p) {
		price = p.getPrice();
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return diameter + "";
	}
}
