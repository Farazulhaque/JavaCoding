package Q16;

import java.util.Scanner;

public class DrawHalfArrow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight = 0;
        int arrowBaseWidth = 0;
        int arrowHeadWidth = 0;

        System.out.print("Enter arrow base height: ");
        arrowBaseHeight = scnr.nextInt();

        System.out.print("Enter arrow base width: ");
        arrowBaseWidth = scnr.nextInt();

        System.out.print("Enter arrow head width: ");
        arrowHeadWidth = scnr.nextInt();
        // 4.loop to continue prompting the user for an arrow head width until the value
        // is larger than the arrow base width
        while (arrowHeadWidth <= arrowBaseWidth) {
            System.out.println("Enter arrow head width: ");
            arrowHeadWidth = scnr.nextInt();
        }

        // if (arrowHeadWidth > arrowBaseWidth) {
        // System.out.println("**");
        // }

        // if (arrowHeadWidth > arrowBaseWidth) {
        // System.out.println("**");
        // }

        // loop to output an arrow base of height arrowBaseHeight
        for (int i = 0; i < arrowBaseHeight; i++) {
            System.out.println("**");
        }

        // loop to output an arrow base of width arrowBaseWidth
        for (int i = arrowBaseWidth; i > 0; i--) {
            for (int j = i; j > 0; j--) // inner loop
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // loop to output an arrow head of width arrowHeadWidth
        // for (int i = arrowHeadWidth; i > 0; i--) {
        // for (int j = i; j > 0; j--) // inner loop
        // {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        scnr.close();
    }
}