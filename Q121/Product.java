package Q121;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.print("Product of first " + n + " numbers are: ");
		int product = 1;
		while (n > 0) {
			product = product * n;
			n--;
		}
		System.out.println(product);
	}
}
