package Q30;

public class Branching {
    // Step 1: Basic Mathematical comparisons
    /**
     * Takes two ints and runs three comparisons. Less than, Greater Than or Equal
     * To, and just Equal to. For each comparison append to the return string the
     * result of the comparison. "first" is/is not less than "second" "first" is/is
     * not greater than or equal to "second" "first" is/is not equal to "second"
     * however replace the is/is not with the proper result of the comparisons and
     * "first" and "second" with the values of the variables of the same name.
     * Include a newline character after each line "\n"
     * 
     * @param first  first variable to compare to
     * @param second second variable to compare against
     * @return String with a statement about the variables.
     */
    public static String compareTwo(int first, int second) {
        String output = "";
        if (first < second) {
            output = output + first + " is less than " + second + "\n";
        } else {
            output = output + first + " is not less than " + second + "\n";
        }
        if (first >= second) {
            output = output + first + " is greater than or equal to " + second + "\n";
        } else {
            output = output + first + " is not greater than or equal to " + second + "\n";
        }

        return output;
    }

    // Step 2
    /**
     * Depending on the value of the number return one of the following statements:
     * If the number is less than 10 but greater than 0, return "Single digit". If
     * the number is 7 return "Luck Sevens". If the number is 42, return "The answer
     * to life the universe and everything". If the number is below 0, return
     * "negative number". If the number is 0, return "Z3R0". Otherwise return
     * "Positive number".
     * 
     * @param number the number to look at
     * @return string with the message that is listed above
     */
    public static String numberGame(int number) {
        // Write a series of If/elseIF statements to complete the method
        if (number < 10 && number > 0)
            return "Single digit";

        else if (number == 7)
            return "Lucky Sevens";

        else if (number == 42)
            return "The answer to life the universe and everything";

        else if (number < 0)
            return "Negative number";

        else if (number == 0)
            return "Zero";

        else
            return "Positive number";
    }

    // Step 3
    /**
     * You can assume proper capitalization (e.g. Logan Seabolt not logan seabolt)
     * The return string is based on the first letter of the firt_name and the
     * length of last_name If the user's first letter is in the first half of the
     * alphabet (Up to and including M) the message starts with: "Good day [insert
     * first] and [last_name]" Otherwise the message starts: "What is up [insert
     * first] and [last_name]" If the User's last name is less than or equal to 5
     * characters long, the message ends: ", I am sure glad to meet you!" if the
     * User's last name is between 6 and 12 characters long (inclusive), the message
     * ends: ", I hope you are having a good day so far!" Otherwise the message
     * ends: " how are you doing this fine day?"
     * 
     * @param first_name the first name
     * @param last_name  the last name
     * @return a string introduction
     */
    public static String nameIntroductions(String first_name, String last_name) {
        // Note string's have a .length and .charAt method.
        // Note 2, Characters can be compared directly.
        String message = "";
        if (first_name.charAt(0) <= 'M')
            message = message + "Good day " + first_name + " " + last_name;
        else
            message = message + "What is up " + first_name + " " + last_name;

        if (last_name.length() <= 5)
            message = message + ", I am sure glad to meet you!";

        else if (last_name.length() >= 6 && last_name.length() <= 12)
            message = message + ", I hope you are having a good day so far!";
        else
            message = message + " how are you doing this fine day?";

        return message;
    }

    // Step 4
    /**
     * Compare the month and day the user enter's and return a string stating "Your
     * Zodiac is 'insert zodiac sign'!" We will be using the Tropical Zodiac from
     * this site https://en.wikipedia.org/wiki/Zodiac. -The dates overlap slightly,
     * the max end of the range is included (July 23 is a cancer not a leo) If the
     * user enters a month that does not exist (for example Juneuary) return:
     * "Please enter a valid month" If the user enters a date invalid for the month
     * (For example February 30) or a day below 0. reutrn: "Please enter a valid
     * day" Note: December and deCember are still the same month (the method
     * .equalsIgnoreCase might help here) Note 2: Please check if the date is out of
     * standard range (e.g. less than 0 or greater than 31) Note 3: You can place if
     * statements within each other.
     * 
     * @param month Month spelled out
     * @param day   the day as an int
     * @return a string with the zodiac or error
     */
    public static String zodiacSign(String month, int day) {
        String zodiac = "";
        if ((month.equalsIgnoreCase("march") && day > 21 && day <= 31)
                || (month.equalsIgnoreCase("april") && day <= 20 && day > 0)) {
            zodiac = zodiac + "Aries";
        } else if ((month.equalsIgnoreCase("april") && day > 20 && day <= 30)
                || (month.equalsIgnoreCase("may") && day <= 21 && day > 0)) {
            zodiac = zodiac + "Taurus";
        } else if ((month.equalsIgnoreCase("may") && day > 21 && day <= 31)
                || (month.equalsIgnoreCase("june") && day <= 21 && day > 0)) {
            zodiac = zodiac + "Gemini";
        } else if ((month.equalsIgnoreCase("june") && day > 21 && day <= 30)
                || (month.equalsIgnoreCase("july") && day <= 23 && day > 0)) {
            zodiac = zodiac + "Cancer";
        } else if ((month.equalsIgnoreCase("july") && day > 23 && day <= 31)
                || (month.equalsIgnoreCase("august") && day <= 23 && day > 0)) {
            zodiac = zodiac + "Leo";
        } else if ((month.equalsIgnoreCase("august") && day > 23 && day <= 31)
                || (month.equalsIgnoreCase("september") && day <= 23 && day > 0)) {
            zodiac = zodiac + "Virgo";
        } else if ((month.equalsIgnoreCase("september") && day > 23 && day <= 30)
                || (month.equalsIgnoreCase("october") && day <= 23 && day > 0)) {
            zodiac = zodiac + "Libra";
        } else if ((month.equalsIgnoreCase("october") && day > 23 && day <= 31)
                || (month.equalsIgnoreCase("november") && day <= 22 && day > 0)) {
            zodiac = zodiac + "Scorpio";
        } else if ((month.equalsIgnoreCase("november") && day > 22 && day <= 30)
                || (month.equalsIgnoreCase("december") && day <= 23 && day > 0)) {
            zodiac = zodiac + "Sagittarius";
        } else if ((month.equalsIgnoreCase("december") && day > 23 && day <= 31)
                || (month.equalsIgnoreCase("january") && day <= 20 && day > 0)) {
            zodiac = zodiac + "Capricon";
        } else if ((month.equalsIgnoreCase("january") && day > 20 && day <= 30)
                || (month.equalsIgnoreCase("february") && day <= 19 && day > 0)) {
            zodiac = zodiac + "Aquarius";
        } else if ((month.equalsIgnoreCase("february") && day > 19 && day <= 29)
                || (month.equalsIgnoreCase("march") && day <= 21 && day > 0)) {
            zodiac = zodiac + "Pisces";
        } else {
            zodiac = zodiac + "Please enter a valid month / day";
        }
        return zodiac;
    }
}