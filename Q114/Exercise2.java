package Q114;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter an integer >0 and <21:");
			int num = sc.nextInt();

			if (num > 0 && num < 21) {
				for (int i = 1; i <= num; i++) {
					if (i == 1) {
						for (int j = 1; j <= num; j++) {
							System.out.print(j + " ");
						}
					} else if (i == num) {
						for (int j = num; j >= 1; j--) {
							System.out.print(j + " ");
						}
					} else {
						System.out.print(i + " ");
						for (int j = 1; j < num - 1; j++) {
							System.out.print("  ");
						}
						System.out.print((num - i + 1) + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Wrong number range");
				sc.close();
				return;
			}
		}
	}
}
