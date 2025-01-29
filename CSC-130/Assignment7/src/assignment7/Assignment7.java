
package assignment7;

import java.util.Scanner;

/**
 * Integrity Policy Statement My words and actions will reflect Academic
 * Integrity. I will not cheat or lie or steal in academic matters. I will
 * promote integrity in the UNCG community. Student’s Signature Eddy Arriaga-Barrientos Date 11/3/2024
 */
// Eddy Arriaga-Barrientos
// Assignment 7
// CSC 130, Section 1

public class Assignment7 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Assignment Seven");
        System.out.println("Eddy Arriaga-Barrientos");
        System.out.println("CSC 130, Sec 1");
        System.out.println("");
        System.out.println("This program will use a while loop to accept integers from a user\n" +
" until the user enters a -1\n" +
"The program will count the number of values entered, calculate the sum & average of the numbers,\n" +
" and show how many of the numbers are even.");
        System.out.println("");
        
        
        double average;
        int counter = 0;
        int evenNumbers = 0;
        int num;
        int sum = 0;  
        
        System.out.print("Please enter a whole number. Enter a -1 (negative 1) to stop: ");
        num = input.nextInt();
        
        
        while (num != -1) {
            counter++;
            sum += num;
            
            if (num %2 == 0) {
                evenNumbers++;
            }
            System.out.print("Please enter a whole number. Enter a -1 (negative 1) to stop: ");
            num = input.nextInt();
            
            
        }
     
        System.out.printf("\nYou entered " + counter + " numbers.");
        System.out.printf("\nThe sum of all the numbers entered is %,d\n", sum);
        
        if (sum > 0) {
            average = ((double) sum/counter);
            System.out.printf("The average of all the numbers entered is %.2f\n", average);
        } else {
            System.out.println("The average could not be calculated because the sum is zero or negative");
        }
         
        
        
        System.out.println("Of these numbers, " + evenNumbers + " of them is/are even.");
        
        
        
        
    }
    
}
