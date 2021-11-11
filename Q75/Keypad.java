package Q75;

import java.util.Scanner;

public class Keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int digit = sc.nextInt();
        switch (digit) {
        case 2:
            System.out.println("ABC");
            break;
        case 3:
            System.out.println("DEF");
            break;
        case 4:
            System.out.println("GHI");
            break;
        case 5:
            System.out.println("JKL");
            break;
        case 6:
            System.out.println("MNO");
            break;
        case 7:
            System.out.println("PQRS");
            break;
        case 8:
            System.out.println("TUV");
            break;
        case 9:
            System.out.println("WXYZ");
            break;
        default:
            System.out.println("Invalid digit.");
            break;
        }
    }
}
