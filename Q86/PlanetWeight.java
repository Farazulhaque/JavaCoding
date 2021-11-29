package Q86;

import java.util.Scanner;

public class PlanetWeight

{
    // Name
    private final static String name = "<Enter Name Here>";

    // declaring global data as mentined in the question
    public static String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
    public static double[] gravity = { 0.39, 0.91, 1.00, 0.38, 2.87, 1.32, 0.93, 1.23 };

    /**
     * The function returns the index of the given planet name
     * from the above declared planets array,
     * if not found, i.e., if an invalid planet is passed it returns -1
     * 
     * @param planet String planet name to search inside the array
     * @return index of the given planet name
     * @return -1 if invalid planet name is passed as argument
     */
    public static int indexOfPlanet(String planet)

    {
        // searching linearly the entire planets array
        for (int i = 0; i < planets.length; i++)

        {
            // using equalsIgnoreCase to find the index of the planet
            if (planets[i].equalsIgnoreCase(planet))

            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)

    {
        // printing the header for program
        System.out.println();
        System.out.println("This program is for ACO101 Homework-06 .Developed by: " + name);
        System.out.println();

        // defining scanner onject to take input from user
        Scanner sc = new Scanner(System.in);

        // running infinite loop until we get 0 as input from user
        while (true)

        {
            System.out.print("Enter a weight on earth. Enter 0 to exit: ");
            double weight = sc.nextDouble();
            // checking the given weight if 0 we are breaking the loop
            if (weight == 0)

            {
                sc.close();
                break;
            }
            // declaring variables to store the planet name and the corresponding index
            String planet;
            int index = 0;
            // infinite loop to prompt the user for valid input
            while (true)

            {
                System.out.print("Enter a valid planet name: ");
                planet = sc.next();
                // if a valid name is entered then the if case is executed
                // we are storing the index as well as comparing the index value
                if ((index = indexOfPlanet(planet)) >= 0)

                {
                    break;
                }
            }
            // printing the output with required precision
            // using the given formula to calculate weight
            // overwring the weight variable
            weight = weight * gravity[index];
            System.out.println(
                    "The weight of the object on the planet " + planet + " is " + String.format("%.2f", weight) + ".");
            System.out.println();
        }
        // if the above loop is broken saying goodbye
        System.out.println("GoodBye!");
        System.out.println();
    }
}