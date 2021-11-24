package Q82;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        String[] name = new String[25];
        int[] marks = new int[25];
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 25; i++) {
        // System.out.print("Enter Name: ");
        // name[i] = sc.next();
        // System.out.print("Enter mark: ");
        // marks[i] = sc.nextInt();
        // }

        int i = 0;
        int j = 0;
        while (true) {
            System.out.print("Enter Name or enter @@ to exit: ");
            String n = sc.next();
            if (n.equals("@@"))
                break;
            else
                name[i] = n;

            System.out.print("Enter mark or enter -111 to exit: ");
            int m = sc.nextInt();
            if (m == -111)
                break;
            else
                marks[i] = m;
            i++;
            j++;
        }
        sc.close();

        for (int k = 0; k < i; k++) {
            System.out.println(name[k] + " " + marks[k]);
        }
    }
}
