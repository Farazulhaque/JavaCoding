package Q121;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers one by one (Press enter after each number)");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is largest");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is largest");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " is largest");
		} else {
			System.out.println("All are equal");
		}
	}
}
