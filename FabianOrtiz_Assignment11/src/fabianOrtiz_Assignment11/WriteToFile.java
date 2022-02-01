package fabianOrtiz_Assignment11;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {  //this writes to the file
	  public static void main(String[] args) {  
	    try {  
	      FileWriter myWriter = new FileWriter("filename.txt"); //name if file
	     //what we want to be written to the file
	      myWriter.write("Writing files in java is challenging but interesting!");
	      myWriter.close();
	      
	      //this confirms that what we wanted to be written to the file is written
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    } 
	  }  
	} 