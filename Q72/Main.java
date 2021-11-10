package Q72;

public class Main {
    public static void main(String[] args) {
        for (int i = -100; i <= 100; i++)
            // if(nextDiv7(i)%7 != 0)
            System.out.println(i + ": " + nextDiv7(i) + " " + (nextDiv7(i) % 7 == 0));
        // System.out.println(nextDiv7(8));
        // System.out.println(nextDiv7(9));
        // System.out.println(nextDiv7(-8));
        // System.out.println(nextDiv7(100));
        // System.out.println(nextDiv7(120));
        // System.out.println(nextDiv7(34));
        // System.out.println(nextDiv7(-35));
    }

    public static int nextDiv7(int num) {
        int nextFirstNumber;
        if (num < 0) {
            int rem = num % 7;
            if (rem == 0) {
                rem -= 7;
            }
            nextFirstNumber = num - rem;
        } else {
            int rem = num % 7;
            nextFirstNumber = num + (7 - rem);
        }

        return nextFirstNumber;
    }
}