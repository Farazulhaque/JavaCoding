package Q121;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number");
		int a = sc.nextInt();
		System.out.print("Enter second number");
		int b = sc.nextInt();
		double area;
		if (a % 5 == 0 || b % 5 == 0) {
			area = 0.5 * a * b;
			System.out.println("Area of triangle is " + area);
		} else {
			area = a * b;
			System.out.println("Area of rectangle is " + area);
		}

	}
}
