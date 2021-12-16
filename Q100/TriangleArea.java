package Q100;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double[][] cornerPoints = new double[3][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the corner points as x1 y1 x2 y2 x3 y3: ");
        for (int i = 0; i < cornerPoints.length; i++) {
            for (int j = 0; j < cornerPoints[i].length; j++) {
                cornerPoints[i][j] = input.nextDouble();
            }
        }
        input.close();

        for (int i = 1; i <= cornerPoints.length; i++) {
            double[] point = cornerPoints[i - 1];

            System.out.print("x and y coordinates for corner points " + i + ": ");
            System.out.println(Arrays.toString(point));
        }
        double[] sides = computeSideLengths(cornerPoints);

        System.out.println("Computed side lengths: " + Arrays.toString(sides));

        double area = computeArea(sides);
        System.out.println("The area of triangle is " + area + ".");
    }

    public static double distance(double[] point1, double[] point2) {

        double dist;
        double x1 = point1[0];
        double x2 = point1[1];
        double y1 = point2[0];
        double y2 = point2[1];

        dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;

    }

    public static double[] computeSideLengths(double[][] cornerPoints) {
        double[] sides = new double[3];
        sides[0] = distance(cornerPoints[0], cornerPoints[1]);
        sides[1] = distance(cornerPoints[1], cornerPoints[2]);
        sides[2] = distance(cornerPoints[2], cornerPoints[0]);

        return sides;
    }

    public static double computeArea(double[] sides) {

        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

}
