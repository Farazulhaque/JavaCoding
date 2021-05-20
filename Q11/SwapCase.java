public class SwapCase {
    public static void main(String[] args) {
        String text = "Tony Lowe";
        System.out.println("String before swapping case: " + text);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        System.out.print("String after swapping case: ");
        System.out.println(chars);
    }
}
