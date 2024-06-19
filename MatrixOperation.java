/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author mk210
 */

//Java Program to multiply two matrices
import java.util.Scanner;
public class MatrixOperation {

   // To print Matrix 
    static void printMatrix(int M[][], int rowSize, int colSize) 
    { 
        for (int i = 0; i < rowSize; i++) 
        { 
            for (int j = 0; j < colSize; j++) 
            {
                System.out.print(M[i][j] + " "); 
            }
  
            System.out.println(); 
        } 
    }   
    // To multiply two matrices a[][] and b[][] 
    static void multiplyMatrix(int p,int q, int a[][], int m, int n, int b[][]) 
    { 
        int i, j, k;   
        // Print the matrices A and B 
        System.out.println("First Matrix:");
        printMatrix(a, p, q); 
        System.out.println("Second Matrix:");
        printMatrix(b, m, n);   
        // Check if multiplication is Possible 
        if (m != q) 
        { 
            System.out.println("Multiplication Not Possible"); 
            return; 
        }   
        // Matrix to store the result 
        int c[][] = new int[q][n]; 
  
        // Multiply the two matrices 
        for (i = 0; i < p; i++) 
        { 
            for (j = 0; j < n; j++) 
            { 
                for (k = 0; k < m; k++) 
                    c[i][j] += a[i][k] * b[k][j]; 
            } 
        }   
        // Print the result 
        System.out.println("\nResultant Matrix:"); 
        printMatrix(c, p, n); 
    }   
   //Driver Code
    public static void main(String[] args) 
    {
        int p, q, m, n;    //Declare matrix size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix:");
        p = sc.nextInt();    //Initialize first matrix size
        System.out.print("Enter the number of columns in the first matrix:");
        q = sc.nextInt();   //Initialize first matrix size
        System.out.print("Enter the number of rows in the second matrix:");
        m = sc.nextInt();   //Initialize second matrix size
        System.out.print("Enter the number of columns in the second matrix:");
        n = sc.nextInt();   //Initialize second matrix size
        int a[][] = new int[p][q];    //Declare first matrix
        int b[][] = new int[m][n];    //Declare second matrix            
            //Initialize the first Matrix
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            
            //Initialize the second matrix
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }            
            //To Multiply two matrices
             multiplyMatrix(p ,q, a, m, n, b);    
    }
}
    
    
