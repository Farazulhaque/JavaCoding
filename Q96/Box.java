package Q96;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size of the box (row - column): ");
        String[] size = sc.nextLine().split(" ");
        sc.close();
        int row = Integer.parseInt(size[0]);
        int column = Integer.parseInt(size[1]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}