// Name
// Course

import java.util.Scanner;
import java.util.Random;

public class programmingTestOne {
    static final double PI = 3.1415926536;

    public static void main(String[] args) {
        int choice = 0;
        int randomNumberOne = 0;
        int randomNumberTwo = 0;
        int getNumber = 0;
        double radius = 0;
        double area = 0;
        boolean testing = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("****************************** Menu ************************");
        System.out.println("1. Generate and compare random numbers");
        System.out.println("2. Get a whole number and check to see if the number is even or odd");
        System.out.println("3. Get real number and use it to calculate the area of a circle. ");
        System.out.println("***********************************************************");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                randomNumberOne = 1 + (int) (Math.random() * ((15 - 1) + 1));
                randomNumberTwo = 1 + (int) (Math.random() * ((15 - 1) + 1));
                if (randomNumberOne == randomNumberTwo) {
                    System.out.println("Both are equal");
                } else if (randomNumberOne > randomNumberTwo) {
                    System.out.println("randomNumberOne " + randomNumberOne + " is greater than randomNumberTwo "
                            + randomNumberTwo);
                } else if (randomNumberOne < randomNumberTwo) {
                    System.out.println("randomNumberOne " + randomNumberOne + " is smaller than randomNumberTwo "
                            + randomNumberTwo);
                }
                break;
            case 2:
                System.out.print("Enter a whole number: ");
                getNumber = sc.nextInt();
                if (getNumber % 2 == 0) {
                    testing = true;
                } else {
                    testing = false;
                }
                System.out.println("Testing: " + testing);
                break;
            case 3:
                System.out.print("Enter a number: ");
                radius = sc.nextInt();
                area = radius * radius * PI;
                System.out.println("Area = " + area);
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }
    }
}