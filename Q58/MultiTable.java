public class MultiTable {
    public static void main(String[] args) {

        // header
        System.out.print("* |");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%4d", i);
        }

        // printing dash(-)
        System.out.println();
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }

        // printing table
        System.out.println();
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
