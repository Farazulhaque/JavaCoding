package Q129;

public class Main {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 6);
		System.out.println(
				"Rectangle with sides " + rec1.getLength() + " and " + rec1.getWidth() + " has area "
						+ rec1.computeArea());

		Rectangle rec2 = new Rectangle();
		rec2.setLength(5.2);
		rec2.setWidth(8.7);
		System.out.println(
				"Rectangle with sides " + rec2.getLength() + " and " + rec2.getWidth() + " has area "
						+ rec2.computeArea());

		Circle cir1 = new Circle(4);
		System.out.println("Circle with radius " + cir1.getRadius() + " has area " + cir1.computeArea());

		Circle cir2 = new Circle();
		cir2.setRadius(3.2);
		System.out.println("Circle with radius " + cir2.getRadius() + " has area " + cir2.computeArea());

		System.out.println(
				"You created " + Rectangle.getCountRect() + " rectangles and " + Circle.getCountCircl() + " circles.");

		System.out.println("That is " + (Rectangle.getCountRect() + Circle.getCountCircl()) + " shapes in total.");
	}

}
