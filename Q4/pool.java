import java.util.Scanner;
import java.lang.Math; // Needed to use Math.round()

public class pool {
    public static void main(String[] args) {
        final double GALLONSPERCUFT = 7.48;
        final int DAYSINMONTH = 30;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter pool owner's name: ");
        String name = s.next();
        System.out.print("Enter diameter of pool in ft: ");
        int dia = s.nextInt();
        System.out.print("Enter height of pool in ft: ");
        double ht = s.nextDouble();
        double vol = Math.PI * dia * dia * ht / 4 * GALLONSPERCUFT;
        System.out.print("Enter cost of gallon of water in dollars: ");
        double cost = s.nextDouble();
        System.out.print("Enter leak rate in gallons per day: ");
        double leak = s.nextDouble();

        System.out.println("========================================================================");
        System.out.printf("The pool owner name is %s\n", name);
        System.out.printf("The pool needs %.2f gallons of water which costs %.2f dollars\n", vol, vol * cost);
        System.out.printf("The leak will require the pool to be refilled every %.2f days\n", vol / leak);
        System.out.printf("The monthly cost of the leak in dollars is %.2f\n", leak * DAYSINMONTH * cost);
        System.out.println();
        System.out.println("========================================================================");

        System.out.println("================================Summary=================================");
        System.out.println("Pool Owner's Name: \t\t\t\t" + name);
        System.out.println("Diameter of Pool: \t\t\t\t" + dia + " foot");
        System.out.println("Height of the Pool: \t\t\t\t" + ht + " feet");
        System.out.println("Cost of Gallons: \t\t\t\t" + cost);
        System.out.println("Leak rate in Gallons/Day: \t\t\t" + leak);
        System.out.println("Total gallons of water needed to fill Pool: \t" + Math.round(vol));
        System.out.println("Total cost of filling the Pool: \t\t" + Math.round(vol * cost) + " dollar(s)");
        System.out.println("========================================================================");
    }
}
