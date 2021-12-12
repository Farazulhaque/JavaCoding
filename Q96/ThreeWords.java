package Q96;

import java.util.Scanner;

public class ThreeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three words separated by space: ");
        String[] data = sc.nextLine().split(" ");
        sc.close();
        String word1 = data[0];
        String word2 = data[1];
        String word3 = data[2];
        if (word1.length() >= word2.length() && word1.length() >= word3.length()) {
            System.out.println("Longest word is: " + word1);
        } else if (word2.length() >= word1.length() && word2.length() >= word3.length()) {
            System.out.println("Longest word is: " + word2);
        } else if (word3.length() >= word1.length() && word3.length() >= word2.length()) {
            System.out.println("Longest word is: " + word3);
        } else {
            System.out.println("All words is of same length");
        }
    }
}
