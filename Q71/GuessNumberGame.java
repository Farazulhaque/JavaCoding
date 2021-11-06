package Q71;

import java.util.*;

public class GuessNumberGame {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // it is used for user input
        Random rand = new Random(); // it is used for random nuber generation
        int largestNum = 100;
        int computerChoice = rand.nextInt(largestNum); // generate random number from 0 to largest number

        int tries = 0; // to count number of tries
        String playAgain = "Y";
        while (playAgain.equals("Y")) {
            System.out.println("Enter a guess (1-100): ");
            int humanGuess = sc.nextInt();
            if (humanGuess == computerChoice) {
                System.out.println("Congo");
                System.out.println("Number of Tries " + tries);
                System.out.println("Would you like to play again? Enter Y or N: ");
                playAgain = sc.next();
                computerChoice = rand.nextInt(largestNum); // generate random number from 0 to largest number

            } else if (humanGuess < computerChoice) {
                System.out.println("too low");
                tries += 1;
            } else {
                System.out.println("too high");
                tries += 1;
            }
        }
        sc.close();
    }
}
