package Q70;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter cash amount: ");
        double cash = sc.nextDouble();
        int[] userNum = new int[5];
        String answer = "y";
        while (cash > 0 && answer.equals("y")) {
            for (int i = 0; i < userNum.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                userNum[i] = sc.nextInt();
            }

            Random rm = new Random();
            int[] winningNum = new int[5];
            for (int i = 0; i < winningNum.length; i++) {
                // generate random number and assign to array
                winningNum[i] = rm.nextInt(99 - 1 + 1) + 1;
            }

            // print winning numbers
            // for (int i = 0; i < 5; i++) {
            // System.out.println(winningNum[i]);
            // }
            boolean flag = false;
            int n = 0;
            for (int i = 0; i < winningNum.length; i++) {
                for (int j = 0; j < userNum.length; j++) {
                    if (winningNum[i] == userNum[i]) {
                        // check each item of user num with winning num
                        flag = true;
                        n = j;
                        break;
                    }
                }
            }
            // check if they won
            if (flag) {
                System.out.println("They won!!");
                cash += Math.pow(3, n);
                System.out.println("And the payout is " + Math.pow(3, n));
            } else {
                cash -= 25;
                System.out.println("You lost!!");
            }
            System.out.println("Amount left is " + cash);
            System.out.print("Do you want to play again? [y/n]: ");
            answer = sc.next();
        }
    }
}