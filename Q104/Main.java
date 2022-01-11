package Q104;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.print("Enter your password: ");
        char[] password = console.readPassword();
        String pass = new String(password);
        System.out.println(pass);
    }
}
