package Q106;

import java.util.Scanner;

public class ValueChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 0;
        System.out.println("Enter a number: ");
        value = in.nextInt();
        if (value == 7) {
            System.out.println("That's Lucky!");
        } else if (value == 13) {
            System.out.println("That's unlucky");
        } else {
            System.out.println("That is neither lucky nor unlucky");
        }
    }
}
