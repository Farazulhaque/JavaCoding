public class removeAllExceptAlphabets {
    public static void main(String[] args) {
        String text = "Coder 4 ever!";
        System.out.print("String before strip: ");
        System.out.println(text);
        char[] s = text.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length; i++) {

            // Store only valid characters
            if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= 'a' && s[i] <= 'z')) {
                s[j] = s[i];
                j++;
            }
        }
        System.out.print("String after strip: ");
        System.out.println(String.valueOf(s).substring(0, j));
    }
}
