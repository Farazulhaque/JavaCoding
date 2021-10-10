import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgageLoanCalculator {

    public static void main(String[] args) {
        float startInterest, endInterest, firstYear, secondYear, loanAmount, yearIncrement = 5;
        double incrementPercent = 0.250;

        Scanner scan = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("Welcome to Mortgage Loan Calculator Program!");
        System.out.println("********************************************");
        boolean again = true;
        while (again == true) {

            System.out.println("Loan amount? (1000 to 9999999, or enter 0 to quit): ");
            loanAmount = scan.nextFloat();
            System.out.println("Starting annual interest rate (n.nnn) (1.00 to 8.00): ");
            startInterest = scan.nextFloat();
            System.out.println("Ending annual interest rate (n.nnn) (Starting IR to 8.00): ");
            endInterest = scan.nextFloat();
            System.out.println("First term in years for calculating payments (1 to 45): ");
            firstYear = scan.nextFloat();
            System.out.println("Last term in years for calculating payments (first to 45): ");
            secondYear = scan.nextFloat();

            int numOfInterest = (int) ((endInterest - startInterest) / incrementPercent) + 1;
            int numOfYear = (int) ((secondYear - firstYear) / yearIncrement) + 1;
            DecimalFormat df = new DecimalFormat("0.0000");
            System.out.printf("%5s %10s%10s%10s%10s", "Rate", "| 15 Years |", "20 Years |", "25 Years |", "30 Years |");
            System.out.println();

            for (int i = 0; i < numOfInterest; i++) {
                float mir = (startInterest / (12 * 100));
                System.out.printf("%5s", df.format(startInterest));
                float Year = firstYear;

                for (int j = 0; j < numOfInterest; j++) {
                    float mtp = Year * 12;
                    float Numerator = (float) (mir * Math.pow((1 + mir), mtp));
                    float Denominator = (float) ((((Math.pow((1 + mir), mtp))) - 1));
                    float AnnuityFactor = Numerator / Denominator;
                    double Payment = (double) loanAmount * AnnuityFactor;
                    Payment = Math.round(Payment * 100) / 100;
                    System.out.printf("%10s", Payment);
                    Year += yearIncrement;
                }

                startInterest += incrementPercent;
                System.out.println();
            }
            System.out.println("Do you want to calculate again? [Y/n]: ");
            String choice = scan.next();

            if (choice.equalsIgnoreCase("n")) {
                again = false;
            }
        }
    }
}
