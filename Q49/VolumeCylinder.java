package Q49;

import java.util.Scanner;

public class VolumeCylinder {
    static final double PI = 3.1415926536;

    public static void main(String[] args) {
        double radius;
        double height;
        double volume;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        height = sc.nextDouble();
        sc.close();
        volume = PI * radius * radius * height;

        System.out.println("\nRadius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume);
    }
}
