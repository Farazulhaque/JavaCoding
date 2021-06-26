import java.util.Scanner; // Import the Scanner class

public class dateValidation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.print("Month: ");
        String m = myObj.nextLine();
        System.out.print("Day: ");
        String d = myObj.nextLine();
        System.out.print("Year: ");
        String y = myObj.nextLine();
        int month = Integer.parseInt(m);
        int day = Integer.parseInt(d);
        int year = Integer.parseInt(y);
        if (year > 0 && month > 0 && month <= 12 && day > 0 && day <= 31) {
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        } else {
            System.out.println(month + "/" + day + "/" + year + " is an invalid date.");
        }

    }
}