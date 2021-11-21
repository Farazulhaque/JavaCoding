package Q78;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        // creates an array of size n
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // get user input array elements
            arr[i] = sc.nextInt();
        }
        sc.close();

        // sort elements in ascending order
        bubbleSort(arr);
        System.out.println("\nSecond largest value in an array: " + arr[arr.length - 2]);
        System.out.println("Second smallest value in an array: " + arr[1]);

    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

}