package Q123;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yes: ");
		String yesOrNo = sc.nextLine();
		while (!yesOrNo.equals("yes")) {
			System.out.print("Enter yes: ");
			yesOrNo = sc.nextLine();
		}
		sc.close();
	}
}
