package Q43;

import java.util.*;
// import java.lang.Math; // 2
// import java.text.NumberFormat; // 4
import java.math.BigDecimal; // 5
import java.math.RoundingMode; // 5

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        // double miles_per_gallon = miles / gallons; // 1
        // double miles_per_gallon = Math.round(miles / gallons); // 2
        // double miles_per_gallon = Math.round((miles / gallons) * 100.0) / 100.0; // 3
        // String miles_per_gallon = NumberFormat.getInstance().format(miles / gallons);
        // // 4
        // miles_per_gallon = String.format("%.2f",
        // Double.parseDouble(miles_per_gallon)); // 4
        BigDecimal miles_per_gallon = new BigDecimal(miles / gallons); // 5
        miles_per_gallon = miles_per_gallon.setScale(2, RoundingMode.HALF_UP); // 5

        System.out.println("Miles per gallon = " + miles_per_gallon);

        sc.close();
    }
}