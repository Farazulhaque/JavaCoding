import java.util.ArrayList;
import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        ArrayList<Float> marks = new ArrayList<Float>(); // new array list creted
        Scanner sc = new Scanner(System.in); // for user input mark
        DecimalFormat df = new DecimalFormat("##.00"); // format the average upto 2 decimal points
        float mark;
        float avg = 0;
        float total = 0;
        for (int i = 1; i <= 13; i++) { // loop upto 13 and add mark of student in marks array list
            System.out.print("Please enter marks of student " + i + ": ");
            mark = sc.nextInt();
            marks.add(mark);
        }
        System.out.println("Data added in the list are: " + marks); // print marks aaray list
        for (int j = 0; j < marks.size(); j++) {
            total += marks.get(j);
        }
        avg = total / marks.size();
        System.out.println("Total of the marks is: " + total); // print total marks
        System.out.println("Average of the marks is: " + df.format(avg)); // print average marks
    }
}
