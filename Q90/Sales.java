package Q90;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        String[] brand = new String[5];
        int[][] quarter_sales = new int[5][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of Brand" + (i + 1) + ": ");
            brand[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Brand" + (i + 1) + " Quarter" + (j + 1) + " sales:");
                quarter_sales[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.printf("%-15s %-15s %-15s %-15s %-10s %-10s", "BRAND", "QUARTER 1", "QUARTER 2", "QUARTER 3",
                "TOTAL", "SALES");
        System.out.println("\n----------------------------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s", brand[i]);
            int total_sales = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-15s", quarter_sales[i][j]);
                total_sales += quarter_sales[i][j];
            }
            System.out.printf("%-10s", total_sales);
            if (total_sales > 300) {
                System.out.printf("%-10s", "Gold");
            } else {
                System.out.printf("%-10s", "Silver");
            }
            System.out.println();
        }
        sc.close();
    }
}
