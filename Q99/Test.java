package Q99;

public class Test {
    public static void main(String[] args) {
        System.out.println(mymethod(4));
    }

    public static long mymethod(int n) {
        if (n == 0)
            return 1;
        return (n + 1) * mymethod(n - 1);
    }
}

