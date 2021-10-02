import java.util.Scanner;

public class vaccinationReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Vaccination Center");
        // get user inputs name
        System.out.print("Enter First name: ");
        String fname = sc.next();
        System.out.print("Enter Last Name: ");
        String lname = sc.next();
        System.out.print("Enter Day of Birth: ");
        int day = sc.nextInt();
        // input validation
        while (day > 31 || day < 1) {
            System.out.print("Enter Day of Birth: ");
            day = sc.nextInt();
        }

        System.out.print("Enter Month of Birth: ");
        int month = sc.nextInt();
        while (month > 12 || month < 1) {
            System.out.print("Enter Month of Birth: ");
            month = sc.nextInt();
        }

        System.out.print("Enter Year of Birth: ");
        int year = sc.nextInt();
        while (year > 2006 || year < 1920) {
            System.out.print("Enter Year of Birth: ");
            year = sc.nextInt();
        }

        System.out.print("Enter Day of Vaccination: ");
        int vday = sc.nextInt();
        while (vday > 31 || vday < 1) {
            System.out.print("Enter Day of Vaccination: ");
            vday = sc.nextInt();
        }

        System.out.print("Enter Month of Vaccination: ");
        int vmonth = sc.nextInt();
        while (vmonth > 12 || vmonth < 1) {
            System.out.print("Enter Month of Vaccination: ");
            vmonth = sc.nextInt();
        }

        System.out.print("Enter Year of Vaccination: ");
        int vyear = sc.nextInt();
        while (vyear > 2021 || vyear < 2020) {
            System.out.print("Enter Year of Vaccination: ");
            vyear = sc.nextInt();
        }

        System.out.print("Enter name of Vaccination: ");
        String vname = sc.next();

        System.out.print("Enter center of the Vaccination: ");
        String centerOfVaccination = sc.next();
        System.out.print("Enter lot of Vaccination: ");
        String lotOfVaccination = sc.next();

        // ----------------------------------------------------------------------------
        // Generating Report

        System.out.println();
        System.out.printf("%-30s: %s %s", ("Name"), fname, lname);
        System.out.printf("\n%-30s: %d/%d/%d", ("Date Of Birth"), day, month, year);
        System.out.printf("\n%-30s: %d/%d/%d", ("Date Of Vaccination"), vday, vmonth, vyear);
        System.out.printf("\n%-30s: %s", ("Name Of Vaccination"), vname);
        System.out.printf("\n%-30s: %s", ("Center Of Vaccination"), centerOfVaccination);
        System.out.printf("\n%-30s: %s", ("Lot Of Vaccination"), lotOfVaccination);
        System.out.print("\n-----------------------------------------------");
        System.out.print("\nThank you for choosing our services.");
        System.out.print("\nReport generated successfully.");

        sc.close();
    }
}