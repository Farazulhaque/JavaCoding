public class RectTester {
    public static void main(String [] args){
        Rectangle r1, r2, r3, r4, r5;
        r1 = new Rectangle(2, 4);
        r2 = new Rectangle(10, 8);
        r3 = new Rectangle(4, 6);
        r4 = new Rectangle(2, 3);
        r5 = new Rectangle(6, 3);
        System.out.println("r1, r2, r3, r4, r5 perimeters => " + r1.getPerimeter() + " "+ r2.getPerimeter() + " "+ r3.getPerimeter() + " "+ r4.getPerimeter() + " "+ r5.getPerimeter());
        System.out.println("r1, r2, r3, r4, r5 area => " + r1.getArea() + " " +r2.getArea() + " " +r3.getArea() + " " +r4.getArea() + " " +r5.getArea());
        System.out.println(Rectangle.getRectCount() + " Rectangle ");
    }
}
