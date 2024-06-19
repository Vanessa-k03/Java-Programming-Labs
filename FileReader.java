package lab1;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FileReader {
        public static void main(String[] args) {
        BufferedReader br = null;
    try {
// Prompt the user to enter the name of the file they want to read
        System.out.print("Enter the filename: ");
        String fileName = System.console().readLine();

// Open the file
         File file = new File(fileName);
         br = new BufferedReader(new FileReader(file));

         String line;
         int lineCount = 0;

// Read the file line by line and display its content
         while ((line = br.readLine()) != null) {
         System.out.println(line);
         lineCount++;
}

// Display the total number of lines in the file
    System.out.println("Total number of lines in the file: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
    } finally {
// Close the file
        try {
          if (br != null) {
          br.close();
        }
    } catch (IOException e) {
          System.out.println("Error closing the file: " + e.getMessage());
        }
    }
}
}
   
  
   


 


    