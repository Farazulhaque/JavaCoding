import java.util.*;
import java.lang.Math;

class AreaTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3;
		System.out.print(
				"Enter the coordinates of the three points separated by spaces\nin the order of x1 y1 x2 y2 x3 y3: ");
		String s[] = in.nextLine().split(" ");

		double[] a = new double[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = Double.parseDouble(s[i]);
		}
		x1 = a[0];
		y1 = a[1];
		x2 = a[2];
		y2 = a[3];
		x3 = a[4];
		y3 = a[5];
		// System.out.println(x1);
		// System.out.println(y1);
		// System.out.println(x2);
		// System.out.println(y2);
		// System.out.println(x3);
		// System.out.println(y3);

		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

		// System.out.println(side1);

		double semiPerimeter = (side1 + side2 + side3) / 2;
		double area = Math
				.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

		System.out.println("The area of the triangle is " + area + "square units.");
	}
}