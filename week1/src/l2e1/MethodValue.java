package l2e1;

public class MethodValue {
	
//	public void method1(int a) {
//		a = 6;
//	}
//	
//	public void method2() {
//		int b = 3;
//		method1(b);
//		System.out.println(b);
//	}
	
//	public void method1(String a) {
//		a = "6";
//	}
//	
//	public void method2() {
//		String b = "3";
//		method1(b);
//		System.out.println(b);
//	}
	
	public void method1(Pencil a) {
		a.setPrice(49);
	}
	
	public void method2() {
		Pencil b = new Pencil();
		b.setPrice(100);
		method1(b);
		System.out.println(b.getPrice());
	}

	public static void main(String[] args) {
		MethodValue m = new MethodValue();
		m.method2();
	}
}
