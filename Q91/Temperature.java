package Q91;

public class Temperature {
    public static void main(String[] args) {
        int[] low = { 18, 13, 32, 56, 59, 62, 64, 63, 54, 49, 30, 22 };
        int[] high = { 30, 43, 52, 64, 79, 82, 74, 73, 84, 79, 80, 42 };
        int monthExceedsLowTempBy20 = 0;
        for (int i = 0; i < 12; i++) {
            if (high[i] - low[i] > 20) {
                monthExceedsLowTempBy20 += 1;
            }
        }
        System.out.println("Number of months that exceed the low temperature by more than 20 degrees are: "
                + monthExceedsLowTempBy20);
    }
}
