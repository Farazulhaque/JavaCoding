package Q118;

import java.util.*;

public class ListCreator {
	public static Scanner sc = new Scanner(System.in);

	public static List<Integer> generateIntArrayList() {
		List<Integer> tempList = new ArrayList<>();
		int maxSize = 5;
		int count = 1;
		System.out.println("Enter 5 integers (press enter after every integer: ");
		while (sc.hasNextInt() && count <= maxSize) {
			tempList.add(sc.nextInt());
			count++;

			if (count == 6) {
				break;
			}
		}
		return tempList;
	}

	public static int Maximum(int[] numbers) {
		int max = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
