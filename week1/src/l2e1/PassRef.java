package l2e1;

public class PassRef {
	
	public static void paintRed(Pencil p) {
		System.out.println(p);
		
		p.color = "RED";
		p = null;
		
		System.out.println(p);
	}

	public static void main(String[] args) {
		Pencil plainPencil = new Pencil("PLAIN");
		System.out.println("Original color " + plainPencil.color);
//		System.out.println(plainPencil);
		
		paintRed(plainPencil);
		
		System.out.println("New color " + plainPencil.color);
		
//		System.out.println(plainPencil);
	}

}
