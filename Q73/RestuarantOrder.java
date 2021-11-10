package Q73;

import java.util.Scanner;

public class RestuarantOrder {
    public static void main(String[] args) {
        System.out.println("Welcome to CS111 Reataurant!!!");
        System.out.println("Please choose from the folloing menu:");
        System.out.println("1- Orange Juice (5 SR)");
        System.out.println("2- Apple Juice (3 SR)");
        System.out.println("3- Sandwich (10 SR)");
        System.out.println("4- Pizza (15 SR)");
        System.out.println("5- Pasta (20 SR)");
        System.out.println("6- Exit");
        int choice;
        float totalPrice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                totalPrice += 5;
                break;
            case 2:
                totalPrice += 3;
                break;
            case 3:
                totalPrice += 10;
                break;
            case 4:
                totalPrice += 15;
                break;
            case 5:
                totalPrice += 20;
                break;
            case 6:
                System.out.println("The total price of your order  = " + totalPrice);
                break;
            default:
                System.out.println("Error ... Please enter a valid choice!");
            }
        } while (choice != 6);
    }
}
