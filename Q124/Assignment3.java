package Q124;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		String name;
		System.out.println("Please enter your name: ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();

		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total number of characters in the string:  " + count);
		System.out.println("The length of the string: " + name.length());
	}
}
