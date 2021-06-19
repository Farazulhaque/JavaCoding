public class Main {
    public static void main(String[] args) {
        float x = 10;
        if (x < 5) {
            x = x + 5;
        } else {
            x = x--;
        }
        System.out.println(x);
    }
}
