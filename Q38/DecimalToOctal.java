package Q38;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int octal = 0, i = 1, remainder;

        // Input the decimal number
        System.out.print("Enter a Decimal Number: ");
        int decimal = in.nextInt();
        in.close();
        // loop until the decimal number is not 0
        while (decimal > 0) {
            remainder = decimal % 8; // compute remainder
            octal += i * remainder; // concatenate remainders to the octal
            decimal = decimal / 8; // update decimal with quotient
            i = i * 10; // multiply 10 to i
        }

        // output the octal number
        System.out.println("Octal Number: " + octal);
    }
}