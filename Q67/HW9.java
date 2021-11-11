package Q67;

public class HW9 {
    public static void main(String[] args) {
        int[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 9, 2, 7, 9 }

        };
        int[] sumArray = calculateSum(workHours);

        int[] indexArray = decreasingSort(sumArray);
        displayArray(indexArray, sumArray);
    }

    public static int[] calculateSum(int[][] array) {
        int sumArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sumArray[i] = sum;
        }
        return sumArray;
    }

    public static int[] decreasingSort(int[] array) {
        int[] sortedArr = new int[array.length];
        int[] indexArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            sortedArr[i] = array[i];

        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                int tmp = 0;
                if (sortedArr[i] < sortedArr[j]) {
                    tmp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (sortedArr[i] == array[j]) {
                    indexArray[i] = j;
                }
            }
        }
        return indexArray;
    }

    public static void displayArray(int[] indexArray, int[] array) {
        for (int i = 0; i < indexArray.length; i++) {
            System.out.println("Employee" + indexArray[i] + ": " + array[indexArray[i]] + " hours");
        }

    }

}