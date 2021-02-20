import java.util.Scanner;

public class temperature {

    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);
        double F; // Fahrenheit
        double C; // Celsius
        char method;
        boolean keepGoing = true;

        do {
            System.out.print("Enter a temperature in Fahrenheit:  ");
            F = input.nextDouble();
            C = 5 * (F - 32) / 9;
            String formatted_C = String.format("%.2f", C);
            System.out.print("The temperature in Celsius is:  " + formatted_C);
            System.out.print("\nDo you want to continue? ");
            method = input.next().charAt(0);
            if (method == 'y' || method == 'Y') {
                keepGoing = true;
                System.out.println(); // for new line
            } else {
                // if index 0 doesn't equal to y,Y
                keepGoing = false;
            }
        } while (keepGoing == true);
        input.close();
    }
}