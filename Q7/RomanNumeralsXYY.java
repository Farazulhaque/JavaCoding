package Q7;

import java.util.Scanner;

public class RomanNumeralsXYY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 - 10: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println(num + " in Roman Numerals is: I");
                break;
            case 2:
                System.out.println(num + " in Roman Numerals is: II");
                break;
            case 3:
                System.out.println(num + " in Roman Numerals is: III");
                break;
            case 4:
                System.out.println(num + " in Roman Numerals is: IV");
                break;
            case 5:
                System.out.println(num + " in Roman Numerals is: V");
                break;
            case 6:
                System.out.println(num + " in Roman Numerals is: VI");
                break;
            case 7:
                System.out.println(num + " in Roman Numerals is: VII");
                break;
            case 8:
                System.out.println(num + " in Roman Numerals is: VIII");
                break;
            case 9:
                System.out.println(num + " in Roman Numerals is: IX");
                break;
            case 10:
                System.out.println(num + " in Roman Numerals is: X");
                break;
            default:
                System.out.println("That is not a valid number. \nPlease enter a number between 1 - 10");
                break;
        }
        sc.close();
    }
}
