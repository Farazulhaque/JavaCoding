package Q107;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tGrocery Menu");
        System.out.println("1. Produce Item");
        System.out.println("2. Meat Item");
        System.out.println("3. Bakery Item");
        String again = "y";
        double produce = 0, meat = 0, bakery = 0;
        int produce_count = 0, meat_count = 0, bakery_count = 0;
        do {
            System.out.print("Please Enter Your Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                produce_count += 1;
                System.out.print("Please enter produce cost: ");
                produce += sc.nextDouble();
            } else if (choice == 2) {
                meat_count += 1;
                System.out.print("Please enter your meat cost: ");
                meat += sc.nextDouble();
            } else if (choice == 3) {
                bakery_count += 1;
                System.out.print("Please enter your bakery cost: ");
                bakery += sc.nextDouble();
            } else {
                System.out.print("Invalid Choice");
            }
            System.out.print("Again (Y/N)? ");
            again = sc.next();
        } while (again.equalsIgnoreCase("y"));

        double produce_total = produce;
        double meat_total = meat;
        double bakery_total = bakery;

        double produce_avg = produce_total / produce_count;
        double meat_avg = meat_total / meat_count;
        double bakery_avg = bakery_total / bakery_count;

        double food_cost = produce_total + meat_total + bakery_total;
        double sales_tax = food_cost * 0.05;
        double total_cost = food_cost + sales_tax;
        int item_count = produce_count + meat_count + bakery_count;
        double avg_cost = food_cost / item_count;
        System.out.println("Here is your order: ");
        System.out.printf("   %20s%20s%20s", "Produce", "Meat", "Bakery");
        System.out.printf("\nCounts: %13s%20s%20s", produce_count, meat_count, bakery_count);
        System.out.printf("\nTotals:\t\t $%-20s$%-20s$%-20s", String.format("%.2f", produce_total),
                String.format("%.2f", meat_total), String.format("%.2f", bakery_total));
        System.out.printf("\nAverages:\t $%-20s$%-20s$%-20s", String.format("%.2f", produce_avg),
                String.format("%.2f", meat_avg), String.format("%.2f", bakery_avg));
        System.out.printf("\n%-20s: $%5s", "Food Cost", String.format("%.2f", food_cost));
        System.out.printf("\n%-20s: $%5s", "Tax", String.format("%.2f", sales_tax));
        System.out.printf("\n%-20s: $%5s", "Total Cost", String.format("%.2f", total_cost));
        System.out.printf("\n%-20s: $%5s", "Item Count", item_count);
        System.out.printf("\n%-20s: $%5s", "Average Item Cost", String.format("%.2f", avg_cost));
        sc.close();
    }
}
