package Q37;

// import Scanner class to get user input
import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        // initialise totalChars to 0
        int totalChars = 0;
        // To get user input
        Scanner input = new Scanner(System.in);
        // create text varisble to store user input string
        String text = input.nextLine();
        input.close();
        // print user input
        System.out.println("Text = " + text);
        // loop to count number of alphabets in the text
        for (int i = 0; i < text.length(); i++) {
            // if it is alphabets i.e A-Z or a-z, then increment the totalChars to 1
            if ((text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') || (text.charAt(i) >= 'a' && text.charAt(i) <= 'z')) {
                totalChars += 1;
            }
        }
        // print total number of chars
        System.out.print("Total number of alphabet characters in the string are " + totalChars);
    }
}
