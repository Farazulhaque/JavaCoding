package Q6;

import java.util.*;

public class Course {
    public static void main(String[] args) {
        String id;
        float n;
        float avg;
        float total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        id = sc.next();
        n = 10;
        // creates an array in the memory of length 10
        float[] array = new float[10];
        System.out.println("Enter marks in courses: ");
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            array[i] = sc.nextFloat();
            total += array[i];
        }
        avg = total / 10;
        sc.close();
        System.out.println("Student ID: " + id);
        System.out.println("Total marks: " + total);
        System.out.println("Average Marks: " + avg);

        if (avg >= 60) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
