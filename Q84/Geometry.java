package Q84;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geometry Calculator");
        while (true) {
            System.out.println();
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4):");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\n");
                System.out.print("Enter radius of a circle: ");
                double r = sc.nextDouble();
                while (r <= 0) {
                    System.out.println("Invalid input. The radius should not be 0 or -ve");
                    System.out.print("Enter radius of a circle: ");
                    r = sc.nextDouble();
                }
                System.out.println("The area of the circle is: " + areaOfCircle(r));
            } else if (choice == 2) {
                System.out.println("\n");
                System.out.print("Enter length of a rectangle: ");
                double l = sc.nextDouble();
                while (l <= 0) {
                    System.out.println("Invalid input. The length should not be 0 or -ve");
                    System.out.print("Enter length of a rectangle: ");
                    l = sc.nextDouble();
                }
                System.out.print("Enter width of a rectangle: ");
                double w = sc.nextDouble();
                while (w <= 0) {
                    System.out.println("Invalid input. The width should not be 0 or -ve");
                    System.out.print("Enter width of a rectangle: ");
                    w = sc.nextDouble();
                }
                System.out.println("The area of the rectangle is: " + areaOfRectangle(l, w));
            } else if (choice == 3) {
                System.out.println("\n");
                System.out.print("Enter base of a triangle: ");
                double b = sc.nextDouble();
                while (b <= 0) {
                    System.out.println("Invalid input. The base should not be 0 or -ve");
                    System.out.print("Enter base of a triangle: ");
                    b = sc.nextDouble();
                }
                System.out.print("Enter height of a triangle: ");
                double h = sc.nextDouble();
                while (h <= 0) {
                    System.out.println("Invalid input. The height should not be 0 or -ve");
                    System.out.print("Enter height of a triangle: ");
                    h = sc.nextDouble();
                }
                System.out.println("The area of the triangle is: " + areaOfTriangle(b, h));
            } else if (choice == 4) {
                System.out.println("\n");
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter again.");

            }
        }
        sc.close();
    }

    public static double areaOfCircle(double r) {
        return Math.PI * r * r;

    }

    public static double areaOfRectangle(double l, double w) {
        return l * w;

    }

    public static double areaOfTriangle(double b, double h) {
        return b * h * 0.5;
    }
}
