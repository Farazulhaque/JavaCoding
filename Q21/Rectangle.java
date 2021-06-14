public class Rectangle {
    private int height;
    private int width;
    private static int rectCount = 0;

    public Rectangle(int height, int width) {
        rectCount++;
        this.height = height;
        this.width = width;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public static int getRectCount() {
        return rectCount;
    }
}