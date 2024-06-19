/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;

public class FileWriter {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the filename: ");
        String fileName = null;
        try {
            fileName = reader.readLine();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the filename.");
            e.printStackTrace();
            return;
        }
        
        System.out.print("Enter the text data you want to write to the file: ");
        String textData = null;
        try {
            textData = reader.readLine();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the text data.");
            e.printStackTrace();
            return;
        }
        
        File file = new File(fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(textData);

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}