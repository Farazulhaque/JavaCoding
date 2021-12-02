package Q92;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Q92\\myFile.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(";");
            System.out.println("Name: " + data[0] + ", Marks: " + data[1]);
        }
        sc.close();
    }

}