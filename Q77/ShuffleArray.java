package Q77;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] A = { 3, 1, 9, 6 };
        int[] B = { 8, 4, 7, 12 };
        shuffle(A, B);
    }

    private static void shuffle(int[] a, int[] b) {
        // create array of size of A array and B array
        int[] result = new int[a.length + b.length];
        int j = 0;
        int k = 0;
        // loop in reslt array to store shuffled elements
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0)
                // at even position i.e 0, 2, 4, 6
                result[i] = a[j++];// increment j
            else
                // at odd position i.e 1, 3, 5, 7
                result[i] = b[k++];// increment k
        }
        // printing shuffled array
        System.out.print("[ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}
