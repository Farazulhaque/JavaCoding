package Q119;

import java.util.Scanner;

public class PayrollCalculator {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int number = 0;
			while (number != -1) {
				System.out.print("Enter employee name: ");
				sc.nextLine();
				String empName = sc.nextLine();

				System.out.print("Enter employee shift (day/night): ");
				String empShift = sc.nextLine();

				System.out.print("Enter hours worked: ");
				int hoursWorked = Integer.parseInt(sc.nextLine());

				System.out.print("Enter hourly pay rate: ");
				int hourlyPayRate = Integer.parseInt(sc.nextLine());

				System.out.print("Enter federal withholding rate(20.0%): ");
				double federalWithholdingRate = sc.nextDouble();

				System.out.print("Enter state withholding rate (9.0%): ");
				double stateWithholdingRate = sc.nextDouble();

				double regularPay = hourlyPayRate * hoursWorked;
				double overtimePay = 0;
				if (hoursWorked > 40) {
					overtimePay = (hoursWorked - 40) * (hourlyPayRate + hourlyPayRate / 2);
					regularPay = (hourlyPayRate * 40);
				} else {
					overtimePay = 0;
				}
				double grossPay = regularPay + overtimePay;
				double federalWithholdingDeduction = grossPay * (federalWithholdingRate / 100);
				double stateWithholdingDeduction = grossPay * (stateWithholdingRate / 100);
				double totalWithholding = federalWithholdingDeduction + stateWithholdingDeduction;
				System.out.println();
				System.out.println("Employee: " + empName);
				if (empShift.equals("day")) {
					System.out.println("Friday Pay Period");
				} else {
					System.out.println("Saturday Pay Period");
				}
				System.out.println("Regular Pay: $" + Math.round(regularPay * 100.0) / 100.0);
				System.out.println("Overtime Pay: $" + Math.round(overtimePay * 100.0) / 100.0);
				System.out.println("Gross Pay: $" + Math.round(grossPay * 100.0) / 100.0);
				System.out.println("Deductions:  ");
				System.out.println(
						"\tFederal Withholding (20.0%): $" + Math.round(federalWithholdingDeduction * 100.0) / 100.0);
				System.out.println(
						"\tState Withholding (9.0%): $" + Math.round(stateWithholdingDeduction * 100.0) / 100.0);
				System.out.println("\tTotal Withholding: $" + Math.round(totalWithholding * 100.0) / 100.0);

				double netPay = grossPay - totalWithholding;
				System.out.println("Net Pay: $" + Math.round(netPay * 100.0) / 100.0);
				System.out.println();
				System.out.print("Enter any number, or -1 to stop: ");
				number = sc.nextInt();// taking input from keyboard

				System.out.println();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
