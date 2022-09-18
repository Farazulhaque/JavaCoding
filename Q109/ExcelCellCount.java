package Q109;

public class ExcelCellCount {
    public static void main(String[] args) {
        String s1 = "AA";
        // String s2 = "AB";
        int num = 0;

        for (int j = 'A'; j >= 'A' && j <= 'Z'; j++) {
            num += 1;
            if (s1.charAt(num) == j) {
                break;
            }
        }

        System.out.println(num);
    }
}