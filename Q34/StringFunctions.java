package Q34;

import java.util.*;

public class StringFunctions {
    public static void main(String[] args) {
        String username, ic, storeusername, storeic;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = sc.next();
        if (username.length() <= 8) {
            storeusername = username;
            System.out.print("Enter ic: ");
            ic = sc.next();
            if (ic.length() <= 12) {
                storeic = ic;
            } else {
                System.out.println("Invalid ic");
                storeic = "Default IC";
            }
            System.out.println(storeic);
        } else {
            System.out.println("Invalid username");
            storeusername = "Default name";
        }
        sc.close();
        System.out.println(storeusername);
    }
}
