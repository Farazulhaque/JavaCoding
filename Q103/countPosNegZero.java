package Q103;

import java.util.Scanner;

public class countPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        int num;
        int positiveCount = 0;
        int negativeCount = 0;
        int zero = 0;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num > 0)
                positiveCount++;
            else if (num < 0)
                negativeCount++;
            else
                zero++;
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
        } while (choice != 'n');
        System.out.println("Number of positive integer is " + positiveCount);
        System.out.println("Number of negative integers is " + negativeCount);
        System.out.println("Numner of zeros is " + zero);
        sc.close();
    }
}
