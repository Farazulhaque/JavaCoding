package Q98;

import java.util.Arrays;
import java.util.Scanner;

public class PokerHands {
    public static void main(String[] args) {
        String studentName = "Your Name";
        int[] deck = new int[52];
        String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
        String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] pokerHands = {
                "Royal Flush", // 0
                "Straight flush", // 1
                "Four of a kind", // 2
                "Full House", // 3
                "Flush", // 4
                "Straight", // 5
                "Three of a kind", // 6
                "Two pair", // 7
                "Pair", // 8
                "High Card", // 9
                "next none yet"
        };

        System.out.println("Submitted by : " + studentName);
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your 52 number: ");
        // 10 36 23 49 6 1 16 2 3 4 28 15 11 24 12 9 21 34 8 5 7 20 33 14 27 40 0 17 29
        // 41 44 43 45 46 47 37 25 22 35 19 26 30 32 31 38 50 51 39 42 48 13 18

        // initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(deck) + "\n\n");

        for (int i = 0; i < 52; i++) {

            String rank = ranks[(deck[i] % 13)];
            // System.out.println((int)Math.ceil(deck[i] / 13));
            String suit = suits[deck[i] / 14];
            System.out.print("Card number " + deck[i] + " : " + rank + " of " + suit);
        }
        System.out.println(pokerHands[0]);
    }
}
