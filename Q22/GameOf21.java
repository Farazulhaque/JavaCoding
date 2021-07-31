import java.util.Scanner;
import java.util.Random;

public class GameOf21 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // initialise userTotal as 0
        int userTotal = 0;
        // generate random number for computer and user
        int comp = random.nextInt(21);
        int user = random.nextInt(11);
        // Adding random number generated for user to userTotal
        userTotal += user;
        // Printing
        System.out.println("The card is " + user);
        System.out.println("Your total is " + userTotal);
        // Loop untill user says n
        while (true) {
            // Asking user for another card
            System.out.print("Do you want another card (y/n)? ");
            String choice = sc.next();
            // If y then go inside this block
            if (choice.equalsIgnoreCase("y")) {
                // store the value returned by card(userTotal) nethod in userTotal
                userTotal = card(userTotal);
                if (userTotal > 21) {
                    System.out.println("You lost.");
                    // store the value returned by playAgain()
                    // in userTotal for fresh start of game
                    userTotal = playAgain();
                }
            }
            // If user types n then go inside this block
            else {
                System.out.println("The computer's score is " + comp);
                if (userTotal > comp) {
                    System.out.println("You win.");
                } else {
                    System.out.println("You lost.");
                }
                // store the value returned by playAgain()
                // in userTotal for fresh start of game
                userTotal = playAgain();
            }
            // if user don't want to play again then value of userTotal is 0
            // and then exit the program
            if (userTotal == 0) {
                break;
            }

        }
        sc.close();

    }

    // card() to generate the user number and add to userTotal
    public static int card(int userTotal) {
        Random random = new Random();
        int user = random.nextInt(11);
        System.out.println("The card is " + user);
        userTotal += user;
        System.out.println("Your total is " + userTotal);

        // return the value of userTotal
        return userTotal;

    }

    // playAgain() to ask user to play again or not
    public static int playAgain() {
        Scanner sc = new Scanner(System.in);
        // assign new random number to computer
        int userTotal = 0;
        System.out.print("Do you want to play again? (y/n)? ");
        String playAgain = sc.next();
        // if user don't want to play again the value of userTotal is 0
        // If user want to play again then the value of userTotal changes
        // by going inside the below if block
        if (playAgain.equalsIgnoreCase("y")) {
            // if user want to play again the store the value returned
            // by card(userTotal) into userTotal
            userTotal = card(userTotal);
        }
        sc.close();
        // return the value of userTotal
        return userTotal;
    }
}