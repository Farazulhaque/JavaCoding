package Q59;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        int greater;
        if (num1 > num2) {
            greater = num1;
        } else {
            greater = num2;
        }
        while (true) {
            if (greater % num1 == 0 && greater % num2 == 0) {
                break;
            }
            greater += 1;
        }
        int lcm = greater;
        System.out.print("LCM of " + num1 + " and " + num2 + " is " + lcm);

        sc.close();
    }
}

