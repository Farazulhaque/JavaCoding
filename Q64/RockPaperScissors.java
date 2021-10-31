import java.util.*;

public class RockPaperScissors {

    // Rules
    // Rock win with scissor and lose with paper
    // paper win with rock and lose with scissor
    // scissor win with paper and lose with rock

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissor";

    public static void main(String args[]) {
        System.out.print("scissor (0), rock (1), paper (2): ");

        String playerMove = getPlayerMove();
        String computerMove = getComputerMove();
        if (playerMove.equals(computerMove)) {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + " too. It is a draw");
        } else if (playerMove.equals("rock") && computerMove.equals("scissor")) {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You won");
        } else if (playerMove.equals("paper") && computerMove.equals("rock")) {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You won");
        } else if (playerMove.equals("scissor") && computerMove.equals("paper")) {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You won");
        } else {
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". Computer won");
        }
    }

    /*
     * Get Computer's move using Random class nextInt() method
     */
    public static String getComputerMove() {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3);

        if (input == 0)
            computermove = RockPaperScissors.SCISSORS;
        else if (input == 1)
            computermove = RockPaperScissors.ROCK;
        else
            computermove = RockPaperScissors.PAPER;

        return computermove;
    }

    /*
     * Get Player's move using Scanner class
     */
    public static String getPlayerMove() {
        String playermove;
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();
        if (input == 0)
            playermove = RockPaperScissors.SCISSORS;
        else if (input == 1)
            playermove = RockPaperScissors.ROCK;
        else
            playermove = RockPaperScissors.PAPER;

        return playermove;
    }
}
