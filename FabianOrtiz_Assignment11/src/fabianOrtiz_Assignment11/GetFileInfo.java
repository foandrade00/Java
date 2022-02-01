package fabianOrtiz_Assignment11;

import java.io.File;  // Import the File class

public class GetFileInfo { //this shows us how to get file info
  public static void main(String[] args) {
    File myObj = new File("filename.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName()); //states file name
      System.out.println("Absolute path: " + myObj.getAbsolutePath());//shows destination of where file is stored
      System.out.println("Writeable: " + myObj.canWrite());// shows file is writable
      System.out.println("Readable: " + myObj.canRead()); //shows file is readable
      System.out.println("File size in bytes: " + myObj.length()); //shows file size
    } else {
      System.out.println("The file does not exist.");
    }
  }
}