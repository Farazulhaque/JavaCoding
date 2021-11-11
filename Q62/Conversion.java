package Q62;

import java.util.*;

public class Conversion {

    public static void main(String[] args) {
        RomanNumeral myRoman = new RomanNumeral();
        myRoman.value = 0;
        Scanner scnr = new Scanner(System.in);
        Prompt(myRoman, scnr);
        // ConvertRoman(myRoman);

    }

    /*
     * This method prompts the user for a Roman Number and calls ProperRoman to
     * validate the input until a valid Roman Number is entered or the user types
     * EXIT to end the program.
     * 
     * When the Roman Number is valid, the method updates the RomanNumeral object
     * with the string entered by the user and returns true.
     * 
     * When EXIT is entered, the method returns false.
     */
    public static boolean Prompt(RomanNumeral myRoman, Scanner scnr) {
        do {
            System.out.print("Please enter a value in Roman Numerals or EXIT to quit: ");
            myRoman.numeral = scnr.nextLine();
            String romanNumeral = myRoman.numeral;
            if (myRoman.numeral.equals("EXIT")) {
                System.out.println("Thank you for using the Roman Numeral to Decimal calculator.");
                System.out.println("Goodbye!");
                break;
            }
            if (ProperRoman(romanNumeral)) {
                ConvertRoman(myRoman);
                PrintRoman(myRoman);
            }
        } while (true);
        return true;
    }

    /*
     * This method takes a String validates that only legal digits have been
     * entered.
     * 
     * The method returns true when a valid Roman Numeral is entered, otherwise it
     * returns false.
     */
    public static boolean ProperRoman(String romanNumeral) {
        if (romanNumeral.length() > 21) {
            System.out.println("Error! Too many characters!! Roman Number must be less than 21 characters long.");
            return false;
        }
        boolean valid = false;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if ((romanNumeral.charAt(i) == 'M') || (romanNumeral.charAt(i) == 'D') || (romanNumeral.charAt(i) == 'C')
                    || (romanNumeral.charAt(i) == 'L') || (romanNumeral.charAt(i) == 'X')
                    || (romanNumeral.charAt(i) == 'V') || (romanNumeral.charAt(i) == 'I')) {
                valid = true;
            } else {
                System.out.println("Illegal Characters.");
                valid = false;
                break;
            }
        }
        return valid;
    }

    /*
     * This method takes a valid RomanNumeral object, calculates the integer
     * equivalent, and returns the object updated with the decimal equivalent of the
     * roman number.
     */
    public static RomanNumeral ConvertRoman(RomanNumeral romanNumeralToConvert) {
        char ch1, ch2;
        int digits1 = 0;
        int digits2 = 0;

        romanNumeralToConvert.value = 0;
        for (int i = 0; i < romanNumeralToConvert.numeral.length(); i++) {
            // System.out.println(romanNumeralToConvert.numeral[i]);
            ch1 = romanNumeralToConvert.numeral.charAt(i);
            if (i == romanNumeralToConvert.numeral.length() - 1) {
                ch2 = '0';
            } else {
                ch2 = romanNumeralToConvert.numeral.charAt(i + 1);
            }
            if (ch1 == 'I') {
                digits1 = 1;
            } else if (ch1 == 'V') {
                digits1 = 5;
            } else if (ch1 == 'X') {
                digits1 = 10;
            } else if (ch1 == 'L') {
                digits1 = 50;
            } else if (ch1 == 'C') {
                digits1 = 100;
            } else if (ch1 == 'D') {
                digits1 = 500;
            } else if (ch1 == 'M') {
                digits1 = 1000;
            }

            if (ch2 == 'I') {
                digits2 = 1;
            } else if (ch2 == 'V') {
                digits2 = 5;
            } else if (ch2 == 'X') {
                digits2 = 10;
            } else if (ch2 == 'L') {
                digits2 = 50;
            } else if (ch2 == 'C') {
                digits2 = 100;
            } else if (ch2 == 'D') {
                digits2 = 500;
            } else if (ch2 == 'M') {
                digits2 = 1000;
            } else {
                digits2 = 0;
            }
            if (digits2 > digits1) {
                romanNumeralToConvert.value += (digits2 - digits1);
                i++;
            } else {
                romanNumeralToConvert.value += digits1;
            }

        }
        return romanNumeralToConvert;

    }

    /*
     * This method takes a valid RomanNumeral object and prints out the roman number
     * and integer value nicely formatted as: XX = 20
     */

    public static void PrintRoman(RomanNumeral romanNumeralToConvert) {
        System.out.println(romanNumeralToConvert.numeral + " = " + romanNumeralToConvert.value);
    }

}
