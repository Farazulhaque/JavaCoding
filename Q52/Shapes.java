import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which shape (L-line, T-triangle, R-rectangle): ");
        char shape = sc.next().charAt(0);
        if (shape == 'L') {
            System.out.print("Enter an integer length between 1 and 25: ");
            int length = sc.nextInt();
            printLine(length);
        } else if (shape == 'T') {
            System.out.print("Enter an integer base length between 3 and 25: ");
            int baseWidth = sc.nextInt();
            printTriangle(baseWidth);
        } else if (shape == 'R') {
            System.out.print("Enter an integer width and height between 2 and 25: ");
            String[] str = sc.next().split(" ");
            int width = Integer.parseInt(str[0]);
            int height = Integer.parseInt(str[1]);
            printRectangle(width, height);
        } else {
            System.out.print("Unknown Shape!");
        }
    }

    public static void printLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int baseWidth) {
        for (int i = 0; i < baseWidth; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}