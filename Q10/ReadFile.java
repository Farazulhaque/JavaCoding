import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
            int digits[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            int total = 0;
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (int i = 0; i < data.length() - 1; i++) {
                    // in ASCII code of character number 1 represents by 48 and so on
                    if (data.charAt(i) == 48) {
                        digits[0] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 49) {
                        digits[1] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 50) {
                        digits[2] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 51) {
                        digits[3] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 52) {
                        digits[4] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 53) {
                        digits[5] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 54) {
                        digits[6] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 55) {
                        digits[7] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 56) {
                        digits[8] += 1;
                        total += 1;
                    } else if (data.charAt(i) == 57) {
                        digits[9] += 1;
                        total += 1;
                    }
                }
                System.out.println("Total digits: "+ total + "\n");
                for (int i = 0; i < digits.length; i++) {
                    System.out.println("Count " + i + ": " + digits[i]);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}