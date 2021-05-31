import java.util.Scanner;

public class vaccine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Please select the number of vaccine type:");
        System.out.println("1. Pfizer");
        System.out.println("2. Astrazeneca");
        System.out.println("3. Moderna");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("The vaccines available in these locations: ");
            System.out.println("King Abdullah Medical City Specialist Hospital (KAMC)");
            System.out.println("King Abdulaziz Airport Covid Vaccine Centre (KAA)");
            String centre = sc.next();
            if (centre.equals("King Abdullah Medical City Specialist Hospital") == true
                    || centre.equals("KAMC") == true) {
                System.out.println("Book now !!");
            } else if (centre.equals("King Abdulaziz Airport Covid Vaccine Centre") == true
                    || centre.equals("KAA") == true) {
                System.out.println("Waiting list for two weeks");
            } else {
                System.out.println("Invalid user input");
                System.exit(0);
            }
        } else if (choice == 2) {
            System.out.println("The vaccines available in these locations: ");
            System.out.println("Alawali Healthcare Centre (Alawali)");
            System.out.println("Book now!!\nYou will need 2 doses within 3 months");
        } else if (choice == 3) {
            System.out.println("Sorry not availabe now ! When you got it you need only one doe only !");
        } else {
            System.out.println("Invalid user input");
            System.exit(0);
        }

    }
}