package Q18;

import java.util.*;

class userWeight {
    public static void main(String[] args) {
        float sum = 0;
        float avg;
        int count = 0;
        Scanner sc = new Scanner(System.in);// System.in is a standard input stream
        System.out.print("Enter your Weight: ");
        int userWeight = sc.nextInt(); // reads Int
        System.out.print("Enter the size of the array of weights: ");
        int sizeOfArray = sc.nextInt();
        if (sizeOfArray > 0) {
            int[] wightsInArray = new int[sizeOfArray];
            System.out.print("Enter an array of size " + sizeOfArray + ": ");
            for (int i = 0; i < sizeOfArray; i++) {
                wightsInArray[i] = sc.nextInt();
            }
            System.out.print("\nThe given array is ");
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.print(wightsInArray[i] + " ");
                sum += wightsInArray[i];
            }
            avg = sum / sizeOfArray;
            System.out.println("\nThe average weight is " + avg);
            for (int i = 0; i < sizeOfArray; i++) {
                if (wightsInArray[i] < userWeight) {
                    count++;
                }
            }
            System.out.println("The number of subjects that are lighter than the user is " + count);
            if (userWeight > avg) {
                System.out.println("The user is above average");
            } else {
                System.out.println("The user is below average");
            }
        } else {
            System.out.println("Error: The size of the array cannot be negative!!");
        }
        sc.close();

    }
}