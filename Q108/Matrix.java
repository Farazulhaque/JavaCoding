package Q108;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int rows = sc.nextInt();
        System.out.print("Enter column size: ");
        int columns = sc.nextInt();

        System.out.println("Enter array elements : ");

        int twoD[][] = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nColumn totals are: ");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += twoD[j][i];
            }
            System.out.print(sum + " ");
        }

        sc.close();
    }
}