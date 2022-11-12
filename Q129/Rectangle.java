package Q129;

public class Rectangle {
	double length;
	double width;
	static int countRect = 0;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public static int getCountRect() {
		return countRect;
	}

	public static void setCountRect(int countRect) {
		Rectangle.countRect = countRect;
	}

	public Rectangle(double length, double width) {
		countRect += 1;
		this.length = length;
		this.width = width;
	}

	public Rectangle() {
		countRect += 1;
		this.length = 0;
		this.width = 0;
	}

	public double computeArea() {
		return length * width;
	}

}
