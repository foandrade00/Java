package fabianOrtiz_Assignment11;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {// this shows how to read the file
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj); //scanner helps the code read the file
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data); // here we call the data to be displayed 
      }
      myReader.close(); //close scanner 
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred."); 
      //if an error occurs this is what will be displayed
      e.printStackTrace();
    }
  }
}