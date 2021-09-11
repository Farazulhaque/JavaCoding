import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // a. Create an array to hold 10 double values
        double[] ArrayA = new double[] { 10.2, 2.5, 3.8, 14.5, 25.88, 16.65, 37.15, 18.01, 9.2, 10.5 };

        // b. Assign value 5.5 to the last element in the ArrayA
        ArrayA[ArrayA.length - 1] = 5.5;

        // c. Print the SUM OF the first two elements
        System.out.println("SUM OF the first two elements = " + (ArrayA[0] + ArrayA[1]));

        // d. Write a loop that computes the SUM OF all the elements in the array then
        // print the sum
        double sum = 0;
        for (int i = 0; i < ArrayA.length; i++) {
            sum += ArrayA[i];
        }
        System.out.println("SUM OF all the elements in the array = " + sum);

        // e. Write a loop that finds the MINIMUM element in the array then print it
        double minimum = ArrayA[0];
        for (int i = 1; i < ArrayA.length; i++) {
            if (ArrayA[i] < minimum) {
                minimum = ArrayA[i];
            }
        }
        System.out.println("MINIMUM element in the array = " + minimum);

        // f. Randomly generate an index then print this index with its element
        int index = (int) (Math.random() * (ArrayA.length - 0 + 1) + 0);
        System.out.println("Array element at index " + index + " is " + ArrayA[index]);
    }
}