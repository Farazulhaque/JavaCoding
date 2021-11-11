package Q19;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        int longest;
        String longestStr = "";
        ArrayList<String> listOfLines = new ArrayList<>();
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream("cars.txt");
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
                // Store each line into an array list
                // Every line contains only one word
                listOfLines.add(sc.nextLine());
                // System.out.println(sc.nextLine()); // returns the line that was skipped
            }
            // System.out.println("Content of ArrayLiList:");
            // System.out.println(listOfLines);
            sc.close(); // closes the scanner
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Loop over an arraylist to get the longest string
        for (int i = 1; i < listOfLines.size(); i++) {
            // get length of string at index 0
            longest = listOfLines.get(0).length();
            // get string at index 0
            longestStr = listOfLines.get(0);
            // Check for length
            // if true then change the value of longestStr to that index
            if (longest < listOfLines.get(i).length()) {
                longestStr = listOfLines.get(i);
            }
        }
        // Printing longest string
        System.out.println("The longest string are: " + longestStr);

    }
}
