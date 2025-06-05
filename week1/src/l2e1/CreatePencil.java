package l2e1;

public class CreatePencil {

	public static void main(String[] args) {
		Pencil p = new Pencil();
		System.out.println(p.color);
		
		p.color = "blue";
		
		Pencil p2 = new Pencil();
		
		System.out.println("p2 " + p2.color);
		System.out.println(p.color);
		
		p2.color = "green";
		
		System.out.println("p2 " + p2.color);
		System.out.println(p.color);
		p.setPrice(50);
		System.out.println("p1 " + p.getPrice());
		
		p2.setPrice(100);
		p.setPrice(p2);
		
		System.out.println("p1 " + p.getPrice());
		
		System.out.println(Pencil.numberOfPencils);
		
//		Pencil.material = "plastic";
//		System.out.println(Pencil.material);
	}

}
