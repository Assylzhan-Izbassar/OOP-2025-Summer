package clonable;

import java.util.Vector;

public class Product implements Cloneable {
	private String name;
	private String sku;
	private double price;
	
	public Vector<Product> relatedProducts;
	
	public static int numOfProduct = 0;
	
	{
		this.sku = "ULo" + Product.numOfProduct;
		this.relatedProducts = new Vector<Product>();
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSku() { // read-only
		return sku;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public Object clone() {
		try {
			Product productClone = (Product) super.clone();
			
			
//			Vector<Product> newRelatedProducts = new Vector<Product>();
			
			productClone.relatedProducts = (Vector<Product>) this.relatedProducts.clone();
			
			System.out.println("Clonning " + this.relatedProducts + " " + productClone.relatedProducts);
//			
//			for (int i = 0; i < this.relatedProducts.size(); ++i) {
//				productClone.relatedProducts.set(i, (Product) this.relatedProducts.get(i).clone());
//			}
			
			for (int i = 0; i < this.relatedProducts.size(); i++) {
				Product clonnedProd = (Product) productClone.relatedProducts.get(i).clone();
				System.out.println("Clonned related product: " + clonnedProd);
				
				productClone.relatedProducts.set(i, clonnedProd);
				productClone.relatedProducts.remove(i);
				productClone.relatedProducts.add(clonnedProd);
			}
			
//			for (Product p: this.relatedProducts) {
//				Product newProduct = (Product) p.clone();
//				newRelatedProducts.add(newProduct);
//			}
			
//			productClone.relatedProducts = newRelatedProducts;

			return productClone;
		} catch (CloneNotSupportedException e) {
			System.err.println("Error when cloning");
			e.printStackTrace();
		}
		return null;
	}
	
//	public String toString() {
//		return "Product is '" + this.name + "' with price " + this.price;
//	}

	public Vector<Product> getRelatedProducts() {
		return relatedProducts;
	}

	public void addRelatedProduct(Product relatedProduct) {
		this.relatedProducts.add(relatedProduct);
	}
	
	public void displayRelatedProducts() {
		System.out.println(this);
		for (Product p: this.relatedProducts) {
			System.out.println("------" + p);
		}
	}

}
