package Q116;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total_owed = 0;
		// System.out.print("Enter number of peoples under 4: ");
		// int peoples_under_4 = sc.nextInt();

		System.out.print("Enter number of peoples between 4 and 12: ");
		int peoples_between_4_12 = sc.nextInt();
		if (peoples_between_4_12 > 0) {
			total_owed += (peoples_between_4_12 * 12);
		}
		System.out.print("Enter number of peoples between 13 and 20: ");
		int peoples_between_13_20 = sc.nextInt();
		if (peoples_between_13_20 > 0) {
			total_owed += (peoples_between_13_20 * 14);
		}

		System.out.print("Enter number of peoples between 21 and 60: ");
		int peoples_between_21_60 = sc.nextInt();
		if (peoples_between_21_60 > 0) {
			total_owed += (peoples_between_21_60 * 16);
		}

		System.out.print("Enter number of peoples greater than 60: ");
		int peoples_greater_60 = sc.nextInt();
		if (peoples_greater_60 > 0) {
			total_owed += (peoples_greater_60 * 7);
		}

		System.out.println("The total owed by movie theatre are: " + total_owed);
		sc.close();
	}
}