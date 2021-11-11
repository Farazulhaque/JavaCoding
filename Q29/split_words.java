package Q29;

import java.util.Scanner;

public class split_words {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String str = scnr.nextLine();
		while (str.charAt(0) != 'q') {
			int flag = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ',') {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				String[] name = str.split(",");
				System.out.println("First word: " + name[0]);
				System.out.println("Second word: " + name[1]);
			} else {
				System.out.println("ERROR: No comma in a string");
			}
			System.out.println("\nEnter input string: ");
			str = scnr.nextLine();
		}
		scnr.close();
	}
}
