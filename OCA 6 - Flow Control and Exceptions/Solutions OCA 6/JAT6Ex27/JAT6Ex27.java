import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class JAT6Ex27{
  public static void main(String[] args){
	new JAT6Ex27().writeToTextFile();
  }// main
  
  public void writeToTextFile(){
     // Create a reference to a File object
	 File file = new File("Messages.txt");
  
     // Declare object references.
     FileWriter fw = null;
	 BufferedWriter bw = null;
	 PrintWriter pw = null;
	 
	 try{
      // Create a FileWriter object.
      fw = new FileWriter(file);
	
	  // Create a BufferedWriter object.
	  bw = new BufferedWriter(fw);
	  
	  // Create a PrintWriter object.
	  pw = new PrintWriter(bw);
		   
	  // Write a line of data to the text file.
	  pw.println("I am preparing to sit the Java Associate Exam!");
		   
	  // Print a confirmation message to the console.
	  System.out.println("Message successfully written to text file.");
	
    }catch(IOException e){
      System.out.println("Unable to read from the text file at this time.");
    }finally{
      try{
	    pw.close();
		bw.close();
	    fw.close();
	  }catch(IOException e) {
		e.printStackTrace();
	  }
    }// finally	
    
  }// method
  
}// class
