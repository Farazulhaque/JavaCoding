package Q121;

import java.util.Scanner;

public class Sum10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 1;
		int sum = 0;
		while (n <= 10) {
			System.out.print("Enter number " + n + " : ");
			sum += sc.nextInt();
			n++;
		}
		System.out.println("Sum of 10 numbers are: " + sum);
	}
}
