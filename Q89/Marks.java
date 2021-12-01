package Q89;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] animals = new String[10];
        String[] codes = new String[10];
        String[] names = new String[10];
        int[] credits = new int[10];
        int[] marks_recieved = new int[10];
        int marks_credit = 0;
        int total_credits = 0;
        double weighted_average_marks = 0;
        System.out.print("Enter today's date (Format: DD/MMM/YYYY): ");
        String d = sc.nextLine();
        System.out.println();
        int i = 0;

        while (i < animals.length) {
            System.out.print("Enter Animal #" + (i + 1) + ": ");
            String animal = sc.nextLine();
            if (animal.equalsIgnoreCase("end")) {
                break;
            } else {
                animals[i] = animal;
            }
            i++;
        }
        for (int k = 0; k < i; k++) {
            String[] data = animals[k].split("-");
            codes[k] = data[0];
            names[k] = data[1];
        }
        System.out.println();
        int j = 0;
        while (j < i) {
            System.out.print("What are the Credit Points for \"" + animals[j] + "\": ");
            credits[j] = sc.nextInt();
            j++;
        }
        System.out.println();
        j = 0;
        while (j < i) {
            System.out.print("What is the results for \"" + animals[j] + "\": ");
            marks_recieved[j] = sc.nextInt();
            j++;
        }

        // --------------------------------------------
        System.out.println(d + " - Weighted Average Marks Calculation");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-15s %-30s %-15s %-5s", "Code", "Name", "CP", "Mark");
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println();
        for (int k = 0; k < i; k++) {
            System.out.printf("%-15s %-30s %-15s %-5s", codes[k], names[k], credits[k], marks_recieved[k]);
            System.out.println();
            marks_credit += marks_recieved[k] * credits[k];
            total_credits += credits[k];
        }
        System.out.println("----------------------------------------------------------------------");
        weighted_average_marks = marks_credit / total_credits;
        System.out.printf("%-65s", "Weighted Average Marks as at " + d + ": ");
        System.out.print(weighted_average_marks);
        sc.close();
    }
}
