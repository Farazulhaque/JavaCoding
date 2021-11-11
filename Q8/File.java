package Q8;

import java.io.FileWriter;
import java.util.*;

public class File {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            try {
                FileWriter fw = new FileWriter("Rec.txt", true);
                System.out.print("Enter rectangle width and length: ");
                String s[] = sc.nextLine().split(" ");
                float a[] = new float[2];
                for (int j = 0; j < s.length; j++) {
                    a[j] = Float.parseFloat(s[j]);
                }
                fw.write("Rectangle(" + i + ")-Width=" + a[0] + "\n");
                fw.write("Rectangle(" + i + ")-Length=" + a[1] + "\n");
                if (a[0] == a[1]) {
                    fw.write("Rectangle(" + i + ")-Area=ERROR, this is square not rectangle!\n");
                } else {
                    fw.write("Rectangle(" + i + ")-Area=" + a[0] * a[1] + "\n");
                }
                fw.write("\n");
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}