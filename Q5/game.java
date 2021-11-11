package Q5;

import java.util.*;
import java.util.Random;

public class game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // it is used for user input
        Random rand = new Random(); // it is used for random nuber generation
        int round = 0;
        System.out.print("Enter the largest number the computer will be allowed to choose: ");
        int largestNum = sc.nextInt();
        int computerChoice = rand.nextInt(largestNum); // generate random number from 0 to largest number user has given
        System.out.print("Enter the total number of guesses allotted to the human player: ");
        int totalGuess = sc.nextInt();
        System.out.println("=================================================================");
        System.out.println("Game Started");
        int count = 0; // to count number of guesses
        while (round <= 10 && totalGuess > 0) {
            System.out.print("Guess the number: ");
            int humanGuess = sc.nextInt();
            if (humanGuess == computerChoice) {
                System.out.println("Congrats you guessed the number computer has choosen.");
                System.out.println("Moving to next round");
                System.out.println("=========================================================");
                computerChoice = rand.nextInt(largestNum);
                totalGuess -= 1; // number of guesses - 1
                round += 1; // to get total number of rounds played
                count += 1; // to get total number of guesses user guessed
            } else if (humanGuess < computerChoice) {
                System.out.println("Your guess is too low");
                totalGuess -= 1;
                count += 1;
            } else {
                System.out.println("Your guess is too high");
                totalGuess -= 1;
                count += 1;
            }
        }
        sc.close();
        System.out.println("=================================================================");
        System.out.println("The number of rounds played by the user: " + round);
        System.out.println("The number of guesses used by the player: " + count);
        System.out.println("The largest number computer was allowed to pick: " + largestNum);
    }
}
