package task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		/*
		 * Примитивные параметры
		 * int, char, boolean, float, double
		 * Ссылочные параметры
		 * Object, String, ...
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Вводите первое число:");
		a = scan.nextInt();
		System.out.println("Вводите второе число:");
		b = scan.nextInt();
		
		a = 5;
		final int C = a;
//		c = 10;
		
		scan.close();
		
		System.out.println(a + " " + b + " " + C);
		int result  = a + b;
		System.out.println("Сумма = " + result);
		
		
		byte t = 100;
		long myLong = t * 3 + 4;
		double d = myLong / 10;
		
		if (t == 100) {
			System.out.println("Okay!");
		}
 		
		int i = (int) d;
		
		int k = (i > 50) ? i : -1;
		
		System.out.print(t + " " + myLong + " " + d + " " + i + " " + k);
		 
	}
}
