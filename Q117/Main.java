package Q117;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1, if you are student\nEnter 2, for others: ");
		int profession = sc.nextInt();
		System.out.print("Enter your annual income: ");
		double income = sc.nextDouble();

		if ((profession == 1 && income < 20000) || (profession == 2 && income < 40000)) {
			System.out.print("Your credit rating is good");
		} else if ((profession == 1 && income < 50000) || (profession == 2 && income < 100000)) {
			System.out.print("Your credit rating is great");
		} else {
			System.out.print("Your credit rating is excellent");
		}
		sc.close();
	}
}