import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.print("What is the customer’s name: ");
        String name = myObj.nextLine();
        System.out.print("What is the length of the room in feet: ");
        String length = myObj.nextLine();
        System.out.print("What is the width of the room in feet: ");
        String width = myObj.nextLine();
        System.out.print("What is the height of the ceiling in feet: ");
        String height = myObj.nextLine();
        System.out.print("Do you want a different color for the trim? ");
        String trim = myObj.nextLine();
        System.out.print("Do you want a faux finish? ");
        String faux = myObj.nextLine();
        if ((faux.toLowerCase()).equals("yes") == true) {
            System.out.print("How many colors do you want in your faux finish? ");
            String colors = myObj.nextLine();
        }
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int h = Integer.parseInt(height);
        int surfaceArea = 2 * (l * h + w * h) - 3 * 2;
        System.out.println("Thank You. Here is your bill.");
        System.out.println("Custom Paintings\n123, main St\nPhoenix, AZ 85701");
        System.out.println("Customer name: " + name);
        System.out.println("The surface to be painted is " + surfaceArea + " sq ft");
        myObj.close();
    }
}