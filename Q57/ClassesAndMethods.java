import java.util.Scanner;
import java.util.Random;

public class ClassesAndMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a whole number: ");
        int userNum = sc.nextInt();
        System.out.println("You just entered " + userNum);
        System.out.println("Press enter to continue...");
        sc.nextLine();
        sc.nextLine();

        Random rand = new Random();
        int minRange = 20, maxRange = 40;
        int randomNum = rand.nextInt(maxRange - minRange) + minRange;

        System.out.println("The computer just generated a random number between 20 and 40, and it is " + randomNum);
        System.out.println("We are about to determine the difference and the smaller number.");
        System.out.println("Press enter to continue...");
        sc.nextLine();

        int smallest, difference;
        if (userNum < randomNum) {
            smallest = userNum;
        } else {
            smallest = randomNum;
        }
        difference = userNum - randomNum;

        System.out.println("The smallest number is " + smallest);
        System.out.println("The difference of the two numbers is " + difference);

        System.out.println("\nPlease enter a sentence that includes the word \"like\".");
        String sentence = sc.nextLine();
        System.out.println("We have replaced \"like\" with \"dislike\" and turn the whole sentence to uppercases.");
        System.out.println("The resulting sentence is: " + sentence.replace("like", "dislike").toUpperCase());
    }
}
