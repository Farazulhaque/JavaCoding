package Q81;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double costOfItem = 0;
        // int rate = 0;
        int totalCompensation = 0;
        double commission;
        int itemSoldAbove500 = 0;

        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter the price of items or enter 0 when done: ");
            int itemPrice = in.nextInt();
            in.close();
            if (itemPrice == 0) {
                keepGoing = false;
            } else {
                if (itemPrice < 100) {
                    commission = 0;
                } else if (itemPrice >= 100 && itemPrice <= 500) {
                    commission = 5;
                } else {
                    commission = 10;
                    itemSoldAbove500++;
                }
                costOfItem = itemPrice + (itemPrice * commission / 100);
            }
            if (itemSoldAbove500 > 5) {
                costOfItem += 500;
            }
            totalCompensation += costOfItem;
        }
        System.out.println("The total compensation is " + totalCompensation);
    }
}
