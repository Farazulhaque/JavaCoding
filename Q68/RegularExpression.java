
import java.util.*;
import java.util.regex.*;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sequence: ");
        String sequence = sc.nextLine();
        System.out.print("Pattern: ");
        String pattern = sc.nextLine();

        matchPattern(sequence, pattern);
    }

    public static void matchPattern(String sequence, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(sequence);

        System.out.println("Is there a match? " + matcher.find());
    }
}