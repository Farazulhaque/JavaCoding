package Q99;

public class Test {
    public static void main(String[] args) {
        System.out.println(mymethod(3, 6));
    }

    public static long mymethod(int a, int b) {
        if (a == b)
            return b;
        else if (a > b)
            return mymethod(a - 1, b) + 1;
        else
            return mymethod(a, b - 1) - 1;

    }
}
/*
 * a = 3
 * b = 6
 * since b > a else part will execute
 * mymethod(3, 6 - 1) - 1
 * mymethod(3, 5) - 1
 * 
 * a = 3
 * b = 5
 * since b > a else part will execute
 * mymethod(3, 5 - 1) - 1 - 1
 * mymethod(3, 4) - 1 - 1
 * 
 * a = 3
 * b = 4
 * since b > a else part will execute
 * mymethod(3, 4 - 1) - 1 - 1 - 1
 * mymethod(3, 3) - 1 - 1 - 1
 * 
 * a = 3
 * b = 3
 * since a=b if part will execute i.e return b
 * 3-1-1-1
 * =0
 * 
 */