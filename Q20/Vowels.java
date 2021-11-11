// import java.util.Scanner;

// public class Vowels {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String sentence = sc.nextLine();
//         int count = countVowels(sentence);

//         // Printing the number of vowels
//         System.out.println("Number of Vowels: " + count);
//     }

//     public static int countVowels(String text) {

//         // Counting Number of vowels
//         int vowels = 0;
//         for (int i = 0; i < text.length(); i++) {
//             if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
//                     || text.charAt(i) == 'u' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I'
//                     || text.charAt(i) == 'O' || text.charAt(i) == 'U')
//                 vowels++;
//         }
//         return vowels;

//     }
// }
package Q20;

import java.util.Scanner;

public class Vowels {

    // method to check if the char is vowel or not
    static int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }

    // count the total number of vowel from 0 to n
    static int countVowels(String str, int n) {
        if (n == 1)
            return isVowel(str.charAt(n - 1));

        // calling recursively
        return countVowels(str, n - 1) + isVowel(str.charAt(n - 1));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = sc.nextLine();

        // Total numbers of Vowel
        System.out.println("Number of vowels: " + countVowels(sentence, sentence.length()));
        sc.close();
    }
}