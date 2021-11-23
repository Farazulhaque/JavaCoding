package Q79;

public class Main {
    public static void main(String[] args) {
        System.out.println(Test(5));

    }

    public static int Test(int n) {
        if (n <= 0) {
            return 1;
        } else {
            System.out.println(n);
            return n + Test(n - 1) + Test(n - 2);
        }
    }
}
