public class ReverseString {
    public static void main(String[] args) {
        String text = "Tony Lowe";
        System.out.print("String before reverse: ");
        System.out.println(text);
        // convert String to character array
        // by using toCharArray
        char[] try1 = text.toCharArray();
        System.out.print("String after reverse: ");
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}
