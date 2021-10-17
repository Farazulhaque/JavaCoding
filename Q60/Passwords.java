import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        String[] names = { "Aman", "Aftab", "Faraz", "Rohan", "Rohit" };
        String[] passwords = { "aman", "aftab", "faraz", "rohan", "rohit" };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        boolean correct = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name) && passwords[i].equals(password)) {
                System.out.println("Access Granted!");
                correct = true;
                break;
            }
        }

        if (correct == false) {
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("Enter password: ");
            password = sc.next();
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(name) && passwords[i].equals(password)) {
                    System.out.println("Access Granted!");
                    correct = true;
                    break;
                }
            }
            if (correct == false)
                System.out.println("Sorry, Your username/passord does not match our database.");
        }
        sc.close();
    }
}