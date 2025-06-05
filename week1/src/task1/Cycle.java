package task1;

public class Cycle {
	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; ++i) {
//			if (i == 9) {
//				System.out.println(i);
//				continue;
//			}
//			System.out.print(i + " ");
//		}
		
		String s = "Hello, World";
		String s2 = new String("Hello, World");
		
		String s3 = s.substring(0, 5);
		
		System.out.println(s.equals(s2));
		System.out.println(s3);
		System.out.print(s3.charAt(3));

	}

}
