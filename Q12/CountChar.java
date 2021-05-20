public class CountChar {
    public static void main(String[] args) {
        String text = "Tony Lowe";
        char character = 'o';
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        System.out.println(text + " contains " + count + " '" + character + "'s");
    }
}
