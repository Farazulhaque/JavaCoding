package Q113;

import java.util.Random;

public class Squares {

	public static void main(String[] args) {
		Squares thisLab = new Squares();
		int counter = 97;
		Random myrand = new Random();

		int rows = myrand.nextInt(5) + 1;
		char[][] myArray = new char[rows][];
		for (int i = 0; i < rows; i++) {
			int cols = myrand.nextInt(6);
			myArray[i] = new char[cols];
			for (int j = 0; j < cols; j++) {
				myArray[i][j] = (char) counter++;
			}
		}
		thisLab.printSquare(myArray);
	}

	private void printSquare(char[][] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i].length != 0) {
				for (int j = 0; j < myArray[i].length; j++) {
					System.out.print("+-----");
				}
				System.out.print("+");
				System.out.println();
				for (int j = 0; j < myArray[i].length; j++) {
					System.out.print("|     ");
				}
				System.out.println("|");
				for (int j = 0; j < myArray[i].length; j++) {
					System.out.print("|  " + myArray[i][j] + "  ");
				}
				System.out.println("|");
				for (int j = 0; j < myArray[i].length; j++) {
					System.out.print("|     ");
				}
				System.out.println("|");
				for (int j = 0; j < myArray[i].length; j++) {
					System.out.print("+-----");
				}
				System.out.print("+");
				System.out.println();
			}
		}
	}
}
