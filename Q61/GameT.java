package Q61;

import java.util.*;
import java.io.*;

public class GameT {

    public static void main(String[] args) throws FileNotFoundException { // main method
        // open class Game //
        Scanner console = new Scanner(System.in); // creates Scanner object and calls it console
        char[] moves = new char[25];//
        // int[] array = new int[25];
        int j = 0;
        int won = 0; // keep track of human wins
        int tie = 0; // keep track of ties
        int loss = 0;
        // computer wins
        System.out.print("Please enter your name: ");
        String name = console.next();
        // create a file name
        String fileName = name + ".txt"; // create a File object associate with file name just created
        File f = new File(fileName);
        // check if file exists and if not create a file
        if (!(f.exists())) {
            // check file existence
            PrintStream output = new PrintStream(f);
            System.out.println("Welcome, " + name + " to the game of rock, paper, scissors.");
            System.out.println();
            output.close();
        }
        // creates file by name entered
        else {
            // file exist so read the data
            Scanner input = new Scanner(f); // create input channel for reading file
            System.out.println("Welcome back, " + name + " to the game of rock, paper, scissors.");
            System.out.println("Your record will include all games played. ");
            won = won + input.nextInt();
            loss = loss + input.nextInt();
            tie = tie + input.nextInt();
            System.out.println("Your previous record: ");
            System.out.println("\t won " + won);
            System.out.println("\t loss " + loss);
            System.out.println("\t tied " + tie);
            System.out.println();
            System.out.println("Here is a reminder of how the game is played.");
            input.close();
        } //

        System.out.println("Welcome, " + name + " to the game of rock, paper, scissors.");
        explain(); // calls method to explain the game
        char choice = 'a';// declare storage for user move
        System.out.println();
        while (choice != 'q') { // create loop to play multiple times
            System.out.print("Select rock 'r' paper 'p' or sissors 's' ");
            System.out.print(" or 'q' to quit: ");
            choice = console.next().charAt(0);
            if (choice < 'a')
                choice = (char) ((int) choice + 32);
            while (choice != 'r' && choice != 'p' && choice != 's' && choice != 'q') {
                // loop to check input
                System.out.println(" Invalid input.");
                System.out.print(" please enter 'r', 'p' or 's' :");
                choice = console.next().charAt(0);
                if (choice < 'a')
                    choice = (char) ((int) choice + 32);
            } // end of check
            if (choice != 'q') {
                char comChoice;
                comChoice = computer(); // computer selects
                System.out.println();
                System.out.println("\t computer chose: " + comChoice);
                System.out.println("\t user chose " + choice);
                int winner = declareWinner(choice, comChoice); // modify // keep track of number of wins by human
                if (winner == 1)
                    won++;
                else if (winner == 0)
                    tie++;
                else
                    loss++;
                moves[j++] = choice;
                moves[j++] = comChoice;
                System.out.println();
            }
        } // Games played
        PrintStream output = new PrintStream(f);
        output.println(won);
        output.println(loss);
        output.println(tie);
        System.out.println("You have stopped playing.");
        System.out.println();
        System.out.println(" Here is a record of your play: ");
        System.out.println("\t You won " + won + " games");
        System.out.println("\t You lost " + loss + " games");
        System.out.println("\t Games tied " + tie);
        System.out.println("\t Here is a record of the moves: "); //
        for (int i = 0; i < j * 2; i++) //
            System.out.print(" " + moves[i]); //
        System.out.println();
        output.close();
        console.close();
    }

    // write data to the file // store variable won // store space then variable
    // tied // store space then variable loss // store space // write a loop that
    // stores the characters in the array. // loop for(int i = 0;i<j;i++) // write
    // the characters moves[i] to the file // file will look like 3 6 3
    // rppssprrpp // close main
    public static void explain() { // prompt with explanation of the game // method with no parameters and no
                                   // return value //
        System.out.println("Welcome to the game.");
        System.out.println("This game is played by two players. Each player selects one of ");
        System.out.println("three objects--a rock, paper or scissors. The winner is determined ");
        System.out.println(" Scissors defeat paper");
        System.out.println(" rock defeats scissors");
        System.out.println(" paper defeats rock ");
        System.out.println(" Enter 'q' to quit the game."); // Add an explanation of how the game is played
        System.out.println("You are playing against the computer."); //
        System.out.print("Select rock 'r' paper 'p' or sissors 's': ");
    } // closes method explain

    public static char computer() { // computer selects the move. A method that returns a value
        Random move = new Random();// using Random class
        int move1 = move.nextInt(3) + 1;// so actual values with 1,2,or3 /*
        int[] record = new int[4]; // declare an array of integer
        for (int i = 0; i < 3000; i++) { //
            System.out.println("the number is " + move1);
            record[move1]++;
            move1 = move.nextInt(3) + 1;
        }
        for (int i = 1; i <= 3; i++) // used to test the random generator //
            System.out.print(" there are " + record[i] + " hits on " + i);
        System.out.println(" there are " + record[1] + " hits on r ");
        System.out.println(" there are " + record[2] + " hits on p");
        System.out.println(" there are " + record[3] + " hits on s");
        if (move1 == 1)
            return 'r'; // return value char
        else if (move1 == 2)
            return 'p';
        else
            return 's';
    } // closes method computer }

    public static int declareWinner(char user, char machine) {// returns a value, uses two parameters
        if ((user == 'r' && machine == 's') || (user == 'p' && machine == 'r') || (user == 's' && machine == 'p')) {
            System.out.println("\t The human player won.");
            return 1;
        } else if (user == machine) {// can use == because comparing char
            System.out.println("\t Tied");
            return 0;
        } else {
            System.out.println("\t The machine won.");
            return 2;
        }
    }
}

// close method }// close class Game /*The moves are evaluated to determine the
// winner The winner is determined: rock defeats sissors sissors defeats paper
// paper defeats rock tie */
