import java.util.*;

public class Foods {
    static double totalCalories(int calories, int servings) {
        return calories * servings;
    }

    static double determineCalorieSplit(int calories) {
        return calories - calories * SPLIT;
    }

    public static final double SPLIT = .25;

    public static void main(String[] args) {
        double total_calories, determine_calorie_split;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the food: ");
        String name = sc.next();
        System.out.print("Enter the calories for a single serving: ");
        int calories = sc.nextInt();
        System.out.print("Enter the number of serving: ");
        int servings = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Calories per serving: " + calories);
        System.out.println("Total number of servings: " + servings);
        total_calories = totalCalories(calories, servings);
        System.out.println("Total calories for dish: " + total_calories);
        determine_calorie_split = determineCalorieSplit(calories);
        System.out.println("Total calories after split: " + determine_calorie_split);

        sc.close();
    }
}

