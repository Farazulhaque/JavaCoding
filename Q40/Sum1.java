import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        boolean lessThan10 = false;
        // loop to check sum is less than 10
        while (lessThan10 == false) {
            while (number > 0) {
                // finds the last digit of the given number
                digit = number % 10;
                // adds last digit to the variable sum
                sum = sum + digit;
                // removes the last digit from the number
                number = number / 10;
            }
            // if less tan 10 then break the loop by assigning lessThan10 to true
            if (sum < 10) {
                lessThan10 = true;
            } else {
                number = sum;
                sum = 0;
            }
        }

        // prints the result
        System.out.println("Sum of Digits: " + sum);

    }
}
