package Q85;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Password: ");
        String password = sc.next();
        checkPassword(password);
        sc.close();
    }

    private static void checkPassword(String password) {
        boolean sixCharacterLongLength = password.length() > 7 ? true : false;
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                containsUpperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                containsLowerCase = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                containsDigit = true;
            }

        }
        if (sixCharacterLongLength && containsUpperCase && containsLowerCase && containsDigit) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }
}
