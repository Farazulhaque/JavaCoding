package Q83;

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Parser class which takes a file name and parses it into
 * a String array.
 */
public class Parser {
    private String fileName;
    private Scanner scanner;
    private String[] words;

    /**
     * 1 Arg constructor for the Parser.
     * 
     * @param fileName The name of the file to be parsed.
     */
    public Parser(String fileName) {
        this.fileName = fileName;
        try {
            this.scanner = new Scanner(new File(this.fileName));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    /**
     * Parses the file passed in through the constructor.
     * Loads the parsed String array into the words field.
     */
    public void parseFile() {
        String agg = "";
        while (scanner.hasNext()) {
            agg += scanner.next() + " ";
        }
        agg = agg.replace(".", "")
                .replace(",", "")
                .replace("?", "")
                .replace(";", "")
                .replace(":", "")
                .replace("!", "")
                .replace("&", "")
                .replace("'", "")
                .replace("[", "")
                .replace("]", "")
                .replace("(", "")
                .replace(")", "")
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "")
                .replace("\\", "")
                .replace("/", "")
                .replace("\ufeff", "");
        this.words = agg.split(" ");
    }

    /**
     * Gets the words array.
     * 
     * @return String[] The array of words parsed from the file.
     */
    public String[] getWords() {
        return this.words;
    }

    /**
     * Sorts the words in the file.
     * 
     * @return String[] The array of sorted words from the file.
     */
    public String[] getSortedWords() {
        String[] temp = this.copyWords();
        Arrays.sort(temp, String.CASE_INSENSITIVE_ORDER);
        return temp;
    }

    /**
     * Copies the words array because the Array.sort method mutates the array
     * passed to it.
     * 
     * @return String[] A copy of the words field.
     */
    private String[] copyWords() {
        String[] temp = new String[this.words.length];
        for (int i = 0; i < this.words.length; i++) {
            temp[i] = this.words[i];
        }
        return temp;
    }
}