package Q111;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"This program receives an integer vector and checks if it has any element divisible by N and M.");
		System.out.println(
				"Note that you should only enter numbers (do nt use any letter or space) otherwise the execution will be terminated.");

		System.out.print("Enter an integer value for N: ");
		int n = sc.nextInt();

		System.out.print("Enter an integer value for M: ");
		int m = sc.nextInt();

		System.out.println("Please enter your vector elements (comma separated) below: ");
		String str = sc.next();
		String nums[] = str.split(",");

		long start_time = System.currentTimeMillis();
		for (int i = 0; i < nums.length; i++) {
			if (Integer.parseInt(nums[i]) % n == 0 && Integer.parseInt(nums[i]) % m == 0) {
				System.out.println(
						"Element " + (i + 1) + " of the entered vector is divisible by both " + n + " and " + m + ".");
				long end_time = System.currentTimeMillis();
				long total_time = end_time - start_time;
				System.out.println("The entered vector was processed in " + total_time + " milliseconds.");
			}
		}
		sc.close();
	}
}