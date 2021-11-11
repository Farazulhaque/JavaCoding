package Q35;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number of elements you want to store: ");
            // reading the number of elements from the that we want to enter
            n = sc.nextInt();
        } while (n <= 0);

        // creates an array in the memory of length n
        float[] array = new float[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            array[i] = sc.nextFloat();
        }
        System.out.print("Array elements are: [");
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            if (i != n - 1)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);
        }
        // Printing array in reverse order
        System.out.print("] \nArray elements in reverse order are: [");
        for (int i = n - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);
        }
        System.out.println("]");
        sc.close();
    }
}