package Q15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        // Counting Number of words
        int countWords = 0;
        char ch[] = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            ch[i] = sentence.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                countWords++;
        }

        // Counting Number of letters
        int countLetters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i)))
                countLetters++;
        }

        // Counting Number of characters
        int countChar = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ')
                countChar++;
        }

        // Printing the values
        System.out.println("Number of words = " + countWords);
        System.out.println("Number of letters = " + countLetters);
        System.out.println("Number of characters = " + countChar);

    }
}
