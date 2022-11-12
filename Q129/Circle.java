package Q129;

public class Circle {
	double radius;
	static int countCircl = 0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static int getCountCircl() {
		return countCircl;
	}

	public static void setCountCircl(int countCircl) {
		Circle.countCircl = countCircl;
	}

	public Circle(double radius) {
		countCircl += 1;
		this.radius = radius;
	}

	public Circle() {
		countCircl += 1;
		this.radius = 0;
	}

	public double computeArea() {
		return 3.14 * radius * radius;
	}
}
