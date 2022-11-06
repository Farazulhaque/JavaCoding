package Q125;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Student st = new Student();
		Scanner sc = new Scanner(System.in);
		List<Student> ics234 = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Student st = new Student();
			System.out.print("Enter Name: ");
			st.setName(sc.next());
			int[] test = new int[2];
			System.out.print("Enter First Test Score: ");
			test[0] = sc.nextInt();
			System.out.print("Enter Second Test Score: ");
			test[1] = sc.nextInt();
			st.setTest(test);
			if ((st.getTest()[0] + st.getTest()[1]) / 2 >= 93) {
				st.setGrade('A');
			}
			ics234.add(st);
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("\nStudent: " + (i + 1));
			System.out.println("Name: " + ics234.get(i).getName());
			System.out.println("First Test Score: " + ics234.get(i).getTest()[0]);
			System.out.println("Second Test Score: " + ics234.get(i).getTest()[1]);
			System.out.println("Grade: " + ics234.get(i).getGrade());
		}
	}
}
