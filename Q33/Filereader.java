import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Filereader {
  public static void main(String[] args) {
    try {
      File myObj = new File("brownfox.txt");
      Scanner myReader = new Scanner(myObj);
      // while (myReader.hasNextLine()) {
      while (myReader.hasNext()) {
        // String data = myReader.nextLine();
        String data = myReader.next();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}