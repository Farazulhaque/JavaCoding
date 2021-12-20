package Q102;

public class Recursive {
    static int count = 0;

    public static void main(String[] args) {
        int numberToTest = 25;
        int res = countToDivide(numberToTest);
        System.out.println(res);

    }

    private static int countToDivide(int numberToTest) {
        if (numberToTest == 1)
            return count;
        else {
            numberToTest = numberToTest / 2;
            count += 1;
            countToDivide(numberToTest);
        }
        return count;
    }
}