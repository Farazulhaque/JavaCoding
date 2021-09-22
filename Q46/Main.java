import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int[][] arr = { { 1, 5, 9, 15, '\0', '\0' }, { 2, 6, 10, 16, 18, 20 }, { 3, 7, 11, '\0', '\0', '\0' },
                { 4, 8, 14, 17, 19, '\0' } };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to search for: ");
        int search = sc.nextInt();
        int res = search2D_Array(arr, search);
        if (res == -1) {
            System.out.println("The element is not present in the array");
        } else {
            System.out.println("The element is present in row with index#" + res);
        }
    }

    public static int search2D_Array(int[][] array, int search) {
        int flag = -1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (search == array[i][j]) {
                    flag = i;
                    break;
                }

            }
        }
        return flag;
    }

}
