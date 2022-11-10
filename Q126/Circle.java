package Q126;

import java.util.ArrayList;
import java.util.List;

public class Circle {
	private static final double PI = 3.141519;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return PI * radius * radius;
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(15);
		List<Circle> circle = new ArrayList<>();
		circle.add(c1);
		circle.add(c2);
		circle.add(c3);
		for (Circle circ : circle) {
			System.out.println(circ.computeArea());
		}
	}
}
