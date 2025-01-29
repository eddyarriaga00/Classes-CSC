package assignment2;
import java.util.Scanner;

/**
 * Integrity Policy Statement My words and actions will reflect Academic
 * Integrity. I will not cheat or lie or steal in academic matters. I will
 * promote integrity in the UNCG community. Student’s Signature Eddy
 * Arriaga-Barrientos Date 09/14/2024
 */
// Eddy Arriaga-Barrientos
// CSC 130, Sec 1
// Assignment Two

public class Assignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Eddy Arriaga-Barrientos");
        System.out.println("CSC 130, Sec 1");
        System.out.println("Assignment Two");
        System.out.println("");

        System.out.println("This program will prompt a user to enter the length and width of a rectangle and will then display the\n"
                + "perimeter, area, and the length of diagonal.");

        System.out.println("");
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;
        double diagonal = Math.sqrt((Math.pow(length, 2)) + Math.pow(width, 2));

        System.out.println("");
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
        System.out.println("The diagonal is " + diagonal);
    }

}
