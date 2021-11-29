package Q83;

import java.util.*;

/**
 * Processor.java
 *
 * @author
 * @version
 */
public class Processor {
    // Parser field name
    private Parser parser;

    public Processor(String fileName) {
        // Set the parser field to a new parser object and pass the filename
        parser = new Parser(fileName);

        // Call the parseFile method on the parser object
        parser.parseFile();
        return;
    }

    public void setParser(Parser parser) {
        // Set the parser field to the parser parameter object
        this.parser = parser;
        return;
    }

    public Parser getParser() {
        // Getter for the parser field
        return this.parser;
    }

    public String getMostCommonWord(String[] excludes) {
        // Get basis words array
        String[] basis = parser.getSortedWords();

        // Convert all words to lowercase to ensure no issues checking against excludes
        for (int i = 0; i < basis.length; i++) {
            basis[i] = basis[i].toLowerCase();
        }

        for (int i = 0; i < excludes.length; i++) {
            excludes[i] = excludes[i].toLowerCase();
        }

        // Provides us the first word to start our search with
        String firstWord = basis[0];

        // maxCount holds the highest number of occurances "so far"
        int maxCount = 0;

        // count holds a simple iterator
        int count = 0;

        // mostCommon holds the most common word found
        String mostCommon = "";

        // Create an arraylist for the collections class to use later
        List<String> basisList = Arrays.asList(basis);

        // For loop goes over every element in the basis array
        for (int i = 0; i < basis.length; i++) {

            // First we will ensure the word is not one we should exclude, if it is, we will
            // pass.
            // If the current basis item doesn't contain any elements from excludes...

            if (containsWord(excludes, basis[i].toLowerCase()) == false) {
                // Counting logic:
                count = Collections.frequency(basisList, basis[i]);
            }

            if (count > maxCount) {
                if (containsWord(excludes, basis[i].toLowerCase()) == false) {
                    maxCount = count;
                    mostCommon = basis[i];
                    count = 0;
                }
            }

        }

        if (mostCommon == "") {
            mostCommon = "a";
        }

        if (mostCommon.length() > 1) {
            mostCommon = mostCommon.toLowerCase();
            mostCommon = mostCommon.substring(0, 1).toLowerCase() + mostCommon.substring(1);
        }

        return mostCommon;
    }

    public static boolean containsWord(String[] basis, String toBeChecked) {

        for (int i = 0; i < basis.length; i++) {
            basis[i] = basis[i].toLowerCase();
        }

        for (int i = 0; i < basis.length; i++) {
            // Modification done here - "==" return true if and only both references are
            // same, SO we should use "equals()" to check the content
            if (basis[i].equals(toBeChecked)) {
                return true;
            }
        }
        return false;
    }

    public int countOccurences(String word) {
        int count = 0;
        String[] basis = parser.getWords();

        for (int i = 0; i < basis.length; i++) {
            if (basis[i].toLowerCase().equals(word.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}