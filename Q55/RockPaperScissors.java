import java.util.*;

import javax.script.ScriptContext;

public class RockPaperScissors {
    static final int ROCK = 111, PAPER = 211, SCISSORS = 311, YOU_WIN = 400, COMP_WIN = 500, DRAW = 600;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("ROCK PAPER SCISSORS GAME");
        System.out.println("========================");
        System.out.println("\nHello! Let's get started!");
        String gameLoop = "y";
        int yourScore = 0, compScore = 0;
        do {
            System.out.println("========================");
            System.out.print("Rock, Paper, or Scissors? (R, P, S): ");
            String user = sc.nextLine();
            int winner = getOneGameResult(user);
            if (winner == YOU_WIN) {
                yourScore += 1;
            } else if (winner == COMP_WIN) {
                compScore += 1;
            }
            printCurrentScore(yourScore, compScore);
            System.out.print("Do you want to play again? (y or n): ");
            gameLoop = sc.nextLine();
        } while (gameLoop.equals("y"));
        System.out.println("========GAME OVER========");
        System.out.println("       FINAL SCORE:");
        printCurrentScore(yourScore, compScore);

    }

    public static void printCurrentScore(int yourScore, int compScore) {
        System.out.println("\t You : Comp");
        System.out.println("SCORE:  -----------");
        System.out.println("\t| " + yourScore + "  :  " + compScore + " |");
        System.out.println("        -----------");
    }

    public static int getOneGameResult(String userInput) {
        int compChoice;
        int yourChoice;
        Random random = new Random();
        int input = random.nextInt(3) + 1;

        if (input == 1)
            compChoice = ROCK;
        else if (input == 2)
            compChoice = PAPER;
        else
            compChoice = SCISSORS;

        if (userInput.equals('R'))
            yourChoice = ROCK;
        else if (input == 2)
            yourChoice = PAPER;
        else
            yourChoice = SCISSORS;

        int winner = decideWinner(compChoice, yourChoice);
        return winner;

    }

    public static int decideWinner(int compChoice, int yourChoice) {
        if (yourChoice == ROCK && compChoice == SCISSORS) {
            System.out.println("You chose Rock!");
            System.out.println("Computer chose Scissors!");
            System.out.println("Rock blunts Scissors! You WIN!");
            return YOU_WIN;
        } else if (yourChoice == ROCK && compChoice == PAPER) {
            System.out.println("You chose Rock!");
            System.out.println("Computer chose Paper!");
            System.out.println("Paper covers Rock! Computer WIN!");
            return COMP_WIN;
        } else if (yourChoice == PAPER && compChoice == ROCK) {
            System.out.println("You chose Paper!");
            System.out.println("Computer chose Rock!");
            System.out.println("Paper covers Rock! You WIN!");
            return YOU_WIN;
        } else if (yourChoice == PAPER && compChoice == SCISSORS) {
            System.out.println("You chose Paper!");
            System.out.println("Computer chose Scissors!");
            System.out.println("Scissors cut Paper! Computer WIN!");
            return COMP_WIN;
        } else if (yourChoice == SCISSORS && compChoice == PAPER) {
            System.out.println("You chose Scissors!");
            System.out.println("Computer chose Paper!");
            System.out.println("Scissors cut Paper! You WIN!");
            return YOU_WIN;
        } else if (yourChoice == SCISSORS && compChoice == ROCK) {
            System.out.println("You chose Scissors!");
            System.out.println("Computer chose Rock!");
            System.out.println("Rock blunts Scissors! Computer WIN!");
            return COMP_WIN;
        } else {
            System.out.println("It's a draw!");
            return DRAW;
        }
    }
}