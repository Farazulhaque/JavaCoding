package Q76;

import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String args[]) {
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream("Employee.txt");
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
                String[] names = sc.nextLine().split("#"); // split sentence by # and store each value in names array
                System.out.println(names[0] + " " + names[1]); // print the first name and last name
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}