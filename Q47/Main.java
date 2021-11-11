package Q47;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please give two numbers");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        sc.close();
        if (a < 3 || a > 21 || b < 3 || b > 21)
            System.out.println("Incorrect Input!");
        if (a < 3)
            System.out.println("Number a is smaller than 3");
        if (b < 3)
            System.out.println("Number b is smaller than 3");
        if (a > 21)
            System.out.println("Number a is larger than 21");
        if (b > 21)
            System.out.println("Number b is larger than 21");

        if (a >= 3 && a <= 21 && b >= 3 && b <= 21) {
            int y;
            System.out.println();
            for (int x = 1; x <= 10; x++) {
                y = b * x + 2 * a;
                System.out.println("y = " + y);
            }
        }
    }
}
