import java.util.*;

public class Budgeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out
                .println("This program asks for monthly income and expenses, then tells you your net monthly income.");
        System.out.println();
        System.out.print("How many categories of income? ");
        int income_categories = console.nextInt();
        float[] income = new float[income_categories];
        float total_income = 0;
        float total_expense = 0;
        for (int i = 0; i < income_categories; i++) {
            System.out.print("    Next income amount? ");
            income[i] = console.nextFloat();
            total_income += income[i];
        }
        System.out.println();
        System.out.print("Enter 1) monthly or 2) daily expenses? ");
        int monthly_or_daily = console.nextInt();
        if (monthly_or_daily == 1) {
            System.out.print("How many categories of expense? ");
            int expense_categories = console.nextInt();
            float[] expense = new float[expense_categories];
            for (int i = 0; i < expense_categories; i++) {
                System.out.print("    Next expense amount? ");
                expense[i] = console.nextFloat();
                total_expense += expense[i];
            }

        } else {
            System.out.print("How many categories of expense? ");
            // int expense_categories = console.nextInt();
            System.out.print("    Next expense amount? ");
            float expense = console.nextFloat();
            total_expense = expense * 31;

        }
        System.out.println();
        System.out.println("Total income = $" + String.format("%.2f", total_income) + " ($"
                + String.format("%.2f", total_income / 31) + "/day)");
        System.out.println("Total expenses = $" + String.format("%.2f", total_expense) + " ($"
                + String.format("%.2f", total_expense / 31) + "/day)");

        System.out.println();
        if (total_income - total_expense > 250) {
            System.out.println("You earned $" + String.format("%.2f", total_income - total_expense)
                    + " more than you spent this month");
            System.out.println("You're a big saver.");
        } else if (total_income - total_expense > 0 && total_income - total_expense < 250) {
            System.out.println("You earned $" + String.format("%.2f", total_income - total_expense)
                    + " more than you spent this month");
            System.out.println("You're a saver.");
        } else if (total_income - total_expense > -250 && total_income - total_expense < 0) {
            System.out.println("You spent $" + String.format("%.2f", total_income - total_expense)
                    + " more than you earned this month");
            System.out.println("You're a spender.");
        } else if (total_income - total_expense <= -250) {
            System.out.println("You spent $" + String.format("%.2f", total_income - total_expense)
                    + " more than you earned this month");
            System.out.println("You're a big spender.");
        }
        console.close();
    }
}
