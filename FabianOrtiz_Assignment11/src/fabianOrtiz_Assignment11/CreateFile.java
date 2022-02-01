package fabianOrtiz_Assignment11;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile { //Here we see how to create a new file
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt"); //name of file
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName()); //when successfully creating file
      } else {
        System.out.println("File already exists.");//when file is already created
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");//prints in case of an error
      e.printStackTrace();
    }
  }
}