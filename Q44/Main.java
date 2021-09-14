import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PV, FV, r;
        int n;
        System.out.println("1. Calculate Future Value from Present Value");
        System.out.println("1. Calculate Present Value from Future Value");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Present Value: ");
            PV = sc.nextDouble();
            System.out.print("Enter Rate of return: ");
            r = sc.nextDouble();
            System.out.print("Enter Number of years: ");
            n = sc.nextInt();
            FV = PV * Math.pow((1 + r), n);
            System.out.println("The Future Value is " + String.format("%.2f", FV));
        } else if (choice == 2) {
            System.out.print("Enter Future Value: ");
            FV = sc.nextDouble();
            System.out.print("Enter Rate of return: ");
            r = sc.nextDouble();
            System.out.print("Enter Number of years: ");
            n = sc.nextInt();
            PV = FV / Math.pow((1 + r), n);
            System.out.println("The Present Value is " + String.format("%.2f", PV));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
