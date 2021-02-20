import java.util.*;

public class Game {

    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.println();
        System.out.println("Hello " + name + ". Welcome to the game");
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");

        String playerMove = getPlayerMove();
        String computerMove = getComputerMove();

        // Rules of the Game Applied Below:
        /*
         * if both playerMove and computerMove produces the same formation, then Game is
         * a tie
         */
        if (playerMove.equals(computerMove))
            System.out.println("Game is Tie !!");
        // if playerMove is ROCK
        else if (playerMove.equals(Game.ROCK))
            System.out.println(computerMove.equals(Game.PAPER) ? "Computer Wins" : "Player wins");
        // if playerMove is PAPER
        else if (playerMove.equals(Game.PAPER))
            System.out.println(computerMove.equals(Game.SCISSORS) ? "Computer Wins" : "Player wins");
        // if playerMove is SCISSORS
        else
            System.out.println(computerMove.equals(Game.ROCK) ? "Computer Wins" : "Player wins");
    }

    /*
     * Get Computer's move using Random class nextInt() method
     */
    public static String getComputerMove() {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3) + 1;
        if (input == 1)
            computermove = Game.ROCK;
        else if (input == 2)
            computermove = Game.PAPER;
        else
            computermove = Game.SCISSORS;

        System.out.println("Computer chose " + computermove + ".");
        System.out.println();
        return computermove;
    }

    /*
     * Get Player's move using Scanner class
     */
    public static String getPlayerMove() {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println();
        String playermove = "Null";
        if (input == 0)
            playermove = "ROCK";
        else if (input == 1)
            playermove = "PAPER";
        else if (input == 2)
            playermove = "SCISSORS";
        else
            System.out.println("Please enter 0, 1 and 2 only.");

        System.out.println("You chose " + playermove + ".");
        return playermove;
    }
}
