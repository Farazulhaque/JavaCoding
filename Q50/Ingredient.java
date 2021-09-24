import java.util.Scanner;

public class Ingredient {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Ingredient newIngredient = new Ingredient(); // Creates New Ingredient "newIngredient" of Class "Ingredient"

        // Initializes Variables
        String nameOfIngredient = "";
        String unitMeasurement = ""; // Options: Cup(s), Tbsp(s), Tsp(s), or Gram(s)
        float ingredientAmount = 0;
        int numberCaloriesPerUnit = 0; // Number of Calories per each unit of ingredient
        double totalCalories = 0.0; // total calories for whole ingredient

        // Prompts user for name of ingredient
        System.out.println("Please Enter Ingredient Name: ");
        nameOfIngredient = scnr.nextLine();

        // Prompts user to select a specifc measurement unit
        System.out.println("Please Enter the Unit of Measurement for this Ingredient. You have the following options:");
        System.out.println("Cup");
        System.out.println("Tbsp");
        System.out.println("Tsp");
        System.out.println("Gram");
        System.out.println("Type a unit of measurement as it appears from the above list.");

        // if else statements checking if the user input for measurement type is correct
        // or not
        if (scnr.hasNext()) {
            unitMeasurement = scnr.next();

            if (!"Gram".equals(unitMeasurement) && !"Cup".equals(unitMeasurement) && !"Tbsp".equals(unitMeasurement)
                    && !"Tsp".equals(unitMeasurement)) {
                System.out.println("Please enter unit of measurement in the format shown before.");
            } else {
                System.out.println("You have selected " + unitMeasurement);
            }
        }

        else {
            System.out.println("Please enter unit of measurement in the format shown before.");
            if (scnr.hasNext()) {
                unitMeasurement = scnr.next();

                if (!"Gram".equals(unitMeasurement) && !"Cup".equals(unitMeasurement) && !"Tbsp".equals(unitMeasurement)
                        && !"Tsp".equals(unitMeasurement)) {
                    System.out.println("Entered Unit of measurement not recognized. You are out of attempts.");
                } else {
                    System.out.println("You have selected " + unitMeasurement);
                }
            }
        }

        // Prompts user to enter the number of units and if else statements check to see
        // if the value is in range
        System.out.println("Please enter number of " + unitMeasurement + " required for " + nameOfIngredient
                + " and it should be between 1 and 100: ");
        if (scnr.hasNextInt()) {
            ingredientAmount = scnr.nextInt();
            if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
                System.out.println(ingredientAmount + " is a valid amount and any recipe using " + nameOfIngredient
                        + " will require " + ingredientAmount + " " + unitMeasurement);
            } else {
                System.out.println(ingredientAmount + " is not a valid amount.");
                System.out.println("Please enter a valid number of units between 1 and 1000: ");
                if (scnr.hasNextInt()) {
                    ingredientAmount = scnr.nextInt();

                    if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
                        System.out.println(ingredientAmount + " is a valid amount!");
                    }

                    else if (ingredientAmount < 1) {
                        System.out.println(ingredientAmount + " is less than 1 unit. Sorry, you are out of attempts.");
                    }

                    else {
                        System.out.println(
                                ingredientAmount + " is greater than 1000 units. Sorry, you are out of attempts.");
                    }
                }
            }
        }

        else {
            System.out.println("Error: That is not a number. Sorry, you are out of attempts.");
        }
        // Prompts user to enter number of calories per unit and if else statements
        // check if the value is in range
        System.out.println("Please enter the number of calories per one " + unitMeasurement + " of " + nameOfIngredient
                + " ,value should be between 1 and 1000: ");

        if (scnr.hasNextInt()) {
            numberCaloriesPerUnit = scnr.nextInt();
            if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 1000)) {
                System.out.println(numberCaloriesPerUnit + " is a valid number of calories.");
            } else {
                System.out.println(numberCaloriesPerUnit + " is not a valid number of calories.");
                System.out.println(
                        "Please enter a valid number of calories per one " + unitMeasurement + " between 1 and 1000: ");

                if (scnr.hasNextInt()) {
                    numberCaloriesPerUnit = scnr.nextInt();

                    if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 1000)) {
                        System.out.println(numberCaloriesPerUnit + " is a valid number of calories!");
                    }

                    else if (numberCaloriesPerUnit < 1) {
                        System.out.println(numberCaloriesPerUnit + " is less than 1. Sorry, you are out of attempts.");
                    }

                    else {
                        System.out.println(
                                numberCaloriesPerUnit + " is greater than 1000. Sorry, you are out of attempts.");
                    }
                }
            }
        }

        else {
            System.out.println("Error: That is not a number. Sorry, you are out of attempts.");
        }

        // Calculate total calories for the ingredient
        totalCalories = ingredientAmount * numberCaloriesPerUnit;

        System.out.println("Congratulations!");
        System.out.println("Any recipe that uses " + nameOfIngredient + " will contain " + ingredientAmount + " "
                + unitMeasurement + " and will have total Calories of " + totalCalories);
        System.out.println("Ingredient " + nameOfIngredient + " has been successfully added.");

    }
}