public class Main {
    public static void main(String[] args) {
        getSmallest(0, 0);
        getSmallest(2, 1);
        getSmallest(13, 100);

        getLargest(0, 0);
        getLargest(2, 1);
        getLargest(13, 100);

        getSmallest(0, 0, 0);
        getSmallest(2, 1, 3);
        getSmallest(100, 13, 7);

        getLargest(0, 0, 0);
        getLargest(2, 1, 3);
        getLargest(100, 13, 7);
    }

    public static void getSmallest(int i, int j) {
        if (i < j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
    }

    public static void getLargest(int i, int j) {
        if (i > j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
    }

    public static void getSmallest(int i, int j, int k) {
        if (i < j && i < k) {
            System.out.println(i);
        } else if (j < i && j < k) {
            System.out.println(j);
        } else {
            System.out.println(k);
        }
    }

    public static void getLargest(int i, int j, int k) {
        if (i > j && i > k) {
            System.out.println(i);
        } else if (j > i && j > k) {
            System.out.println(j);
        } else {
            System.out.println(k);
        }
    }
}

