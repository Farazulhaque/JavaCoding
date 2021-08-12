import java.util.Scanner;

public class DrawZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number > 2: ");
        int n = sc.nextInt();
        if (n < 2 || n % 2 == 0)
            System.out.println("Invalid number. Bye bye.");
        else {
            for (int row = 0; row < n; row++) {
                for (int column = 0; column < n; column++) {
                    if (row == 0 || row == n - 1 || column == n - 1 - row) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
