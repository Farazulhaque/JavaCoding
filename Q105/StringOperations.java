package Q105;

public class StringOperations {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Caron";
        String string3 = "";
        string3 = "How are you " + string2.concat(string2);
        System.out.println("string3: " + string3);

        System.out.println("Length: " + string1.length());

        System.out.println("Sub: " + string3.substring(0, 5));

        System.out.println("Upper: " + string3.toUpperCase());

        String str1 = "Hello this is a test";
        String str2 = str1.substring(6);
        System.out.println(str1);
        System.out.println(str2);
        String str3 = "hello \t t\n this is a test";
        str2 = str3.substring(6);
        System.out.println(str2);
    }
}