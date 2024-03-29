// public class Duplicates {
//     public static void main(String[] args) {
//         int[] inputarray = { 3, 4, 4, 1, 2, 3, 5, 6, 7, 8 };
//         int n = removeDuplicatesElement(inputarray);
//         // Printing The array elements
//         for (int i = 0; i < n; i++)
//             System.out.print(inputarray[i] + " ");
//     }

//     public static int[] removeDuplicatesElement(int[] inputarray) {
//         int n = inputarray.length;
//         int[] temp = new int[n];
//         int j = 0;

//         for (int i = 0; i < n - 1; i++) {
//             if (inputarray[i] != inputarray[i + 1]) {
//                 temp[j++] = inputarray[i];
//             }
//         }
//         temp[j++] = inputarray[n - 1];

//         // Changing the original array
//         for (int i = 0; i < j; i++) {
//             inputarray[i] = temp[i];
//         }
//         return j;
//     }
// }

package Q63;

public class Duplicates {

    public static int removeduplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 4, 1, 2, 3, 5, 6, 7, 8 };
        int n = a.length;

        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}