package Q9;

import java.util.Scanner;
// import java.util.ArrayList;

public class DataVisualizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Type your code here. */
        // 1
        System.out.println("Enter a title for the data:");
        String title = sc.nextLine();
        System.out.println("You entered: " + title);

        // 2
        String[] header = new String[2];
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter the column " + i + " header: ");
            header[i - 1] = sc.nextLine();
            System.out.println("You entered: " + header[i - 1]);
        }

        // 3
        String[] datastr = new String[5];
        String[] dataint = new String[5];
        boolean loop = true;
        int index = 0;
        do {
            System.out.println("Enter a data point (-1 to stop input):");
            String data = sc.nextLine();
            String[] newdata = data.split(",");
            datastr[index] = newdata[0];
            if (newdata.length == 1) {
                System.out.println("Error: No comma in string.");
            } else if (newdata.length > 2) {
                System.out.println("Error: Too many commas in input.");
            } else if (newdata.length > 1 && newdata.length < 3) {
                dataint[index] = newdata[1];
                System.out.println("Data string: " + datastr[index]);
                System.out.println("Data integer: " + dataint[index]);
                index++;
            } else if (Integer.parseInt(data) == -1) {
                loop = false;
            }
        } while (loop);
        sc.close();
    }
}