package Q80;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Marks {
    static String[] Names = new String[20];
    static int[] TAB = new int[20];

    public static void main(String[] args) throws IOException {
        int n = ReadData();
        int lowest = GetLowest(TAB, n);
        int highest = GetHighest(TAB, n);
        int average = GetAverage(TAB, n);
        Display(TAB, Names, n, lowest, highest, average);
    }

    public static int ReadData() throws FileNotFoundException {
        // pass the path to the file as a parameter
        File file = new File("Q80\\IP_Students.txt");
        Scanner sc = new Scanner(file);
        int n = 0;
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(" ");
            if (n == 0) {
                Names[n] = data[0];
                TAB[n] = Integer.parseInt(data[1]);
                n++;
            } else {
                boolean unique = true;
                for (int i = 0; i < n; i++) {
                    if (data[0].equals(Names[i])) {
                        unique = false;
                    }
                }
                if (unique == true) {
                    Names[n] = data[0];
                    TAB[n] = Integer.parseInt(data[1]);
                    n++;
                }
            }
        }
        sc.close();
        return n;
    }

    public static int GetLowest(int[] TAB, int n) {
        int lowest = TAB[0];
        for (int i = 0; i < n; i++) {
            if (lowest > TAB[i]) {
                lowest = TAB[i];
            }
        }
        // System.out.println("Lowest: " + lowest);
        return lowest;
    }

    private static int GetHighest(int[] TAB, int n) {
        int highest = TAB[0];
        for (int i = 0; i < n; i++) {
            if (highest < TAB[i]) {
                highest = TAB[i];
            }
        }
        // System.out.println("Highest: " + highest);
        return highest;
    }

    private static int GetAverage(int[] TAB, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += TAB[i];
        }
        int average = total / n;
        // System.out.println("Average: " + average);
        return average;
    }

    private static void Display(int[] TAB, String[] Names, int n, int lowest, int highest, int average)
            throws IOException {

        FileWriter myWriter = new FileWriter("Q80\\IP_results.dat");

        myWriter.write("\nThe list of students name and mark: ");
        for (int i = 0; i < n; i++) {
            myWriter.write("\n" + Names[i] + " " + TAB[i]);
        }
        myWriter.write("\n\nThe following Student(s) got the lowest mark: " + lowest);
        for (int i = 0; i < n; i++) {
            if (TAB[i] == lowest) {
                myWriter.write("\n" + Names[i]);
            }
        }

        myWriter.write("\n\nThe following Student(s) got the highest mark: " + highest);
        for (int i = 0; i < n; i++) {
            if (TAB[i] == highest) {
                myWriter.write("\n" + Names[i]);
            }
        }

        myWriter.write("\n\nThe following Student(s) gota mark greater than average class mark: " + average);
        for (int i = 0; i < n; i++) {
            if (TAB[i] >= average) {
                myWriter.write("\n" + Names[i]);
            }
        }

        myWriter.close();
        // myWriter.write("\nSuccessfully wrote to the file.");

    }

}