public class Main {
    static int sumPositiveEvenNumbers(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 2 != 0) {
            return sumPositiveEvenNumbers(num - 1);
        } else {
            return num + sumPositiveEvenNumbers(num - 1);
        }
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println("if num = " + num + " then sum = " + sumPositiveEvenNumbers(num));
        num = 7;
        System.out.println("if num = " + num + " then sum = " + sumPositiveEvenNumbers(num));
        num = 0;
        System.out.println("if num = " + num + " then sum = " + sumPositiveEvenNumbers(num));
    }
}

