package clonable;

public class ProductTest {
	public static void main(String[] args) {
		Product mouse = new Product("Mouse for gaming", 30000);
		Product keyboard = new Product("Keyboard for cool playing on CS 2.0", 100000);
		Product chair = new Product("Chair for working on computer", 70000);
		
		chair.addRelatedProduct(mouse);
		chair.addRelatedProduct(keyboard);
		// We have the copy functionally from some base product;
		
		System.out.println(chair);
		chair.displayRelatedProducts();
		
//		Object o;
		
		Product newChair = (Product) chair.clone();
		newChair.setPrice(69000);
		
		newChair.relatedProducts.get(0).setPrice(50000);
	
		System.out.println("------------");
		
		System.out.println(newChair);
		chair.displayRelatedProducts();
		
		System.out.println("------------");
		
		System.out.println(chair);
		chair.displayRelatedProducts();
	}
}
