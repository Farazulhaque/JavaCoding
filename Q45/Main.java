package Q45;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 10, 3, 8, 1, 5 };
        int res1 = differentFar(arr1);
        System.out.println(res1 + "\n");

        int[] arr2 = { 5, 6, 3, 3, 19 };
        int res2 = differentFar(arr2);
        System.out.println(res2 + "\n");

        int[] arr3 = { 5, 2, 3, 4 };
        int res3 = differentFar(arr3);
        System.out.println(res3 + "\n");

    }

    public static int differentFar(int number[]) {
        int max = number[0];
        int min = number[0];
        System.out.print("[");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < (number.length - 1)) {
                System.out.print(", ");
            }
            if (max < number[i])
                max = number[i];
            if (min > number[i])
                min = number[i];
        }
        System.out.println("]");
        return max - min;
    }
}
