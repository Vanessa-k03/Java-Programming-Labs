package lab1;

//Java program to read data from a file, perform data analysis, and write the results to another file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *package lab1;
 * @author mk210
 */
public class DataAnalysis {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        System.out.println("Enter your student ID: ");
        System.out.println("C:\\Users\\mk210\\OneDrive\\Desktop\\Values.txt");
        String inputFileName = userInput.nextLine();
        
        File inputFile = new File(inputFileName);
        try {
            int count;
            try (Scanner inputScanner = new Scanner(inputFile)) {
                double smallest = Double.MAX_VALUE;
                double largest = Double.MIN_VALUE;
                count = 0;
                while (inputScanner.hasNext()) {
                    double current = Double.parseDouble(inputScanner.next());
                    if (current < smallest) {
                        smallest = current;
                    }
                    if (current > largest) {
                        largest = current;
                    }
                    count++;
                }
            }
            
            
            FileWriter fw;
            try (FileReader fr = new FileReader("solutions.txt")) {
                fw = new FileWriter("outputFile");
                
                String str = "";
                int i;
                while ((i = fr.read()) != -1) {
                    
                    // Storing every character in the string
                    str += (char)i;
                }   System.out.println(str);
                fw.write(str);
            }
            fw.close();
            
            System.out.println("Data Analysis complete. Results written to solutions,txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        }
        catch (NumberFormatException e) {
            System.out.println("InputFile conatins an invalid number format");
        }catch (IOException e) {
            System.out.println("An error occured.");
            
 
            // Display message
            System.out.println(
                "File reading and writing both done");
        }

    }
}