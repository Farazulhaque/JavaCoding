import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

public class Distance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed of the vehicle      : ");
        int speed = sc.nextInt();
        while (speed < 0) {
            System.out.println("Please enter positive number.");
            System.out.print("Enter speed of the vehicle      : ");
            speed = sc.nextInt();
        }
        System.out.print("Enter number of hours travelled : ");
        int hr = sc.nextInt();
        while (hr < 1) {
            System.out.println("Please enter hours travelled greter than 1.");
            System.out.print("Enter number of hours travelled : ");
            hr = sc.nextInt();
        }
        try {
            FileWriter myWriter = new FileWriter("myFile.txt");
            myWriter.write("Hour\tDistance Travelled\n");
            myWriter.write("--------------------------------\n");
            for (int i = 1; i <= hr; i++) {
                myWriter.write(i + "\t\t" + i * speed + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            // Print the exception
            System.out.print(e.getMessage());
        }

        sc.close();
    }
}
