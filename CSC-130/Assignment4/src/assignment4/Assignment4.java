package assignment4;

import java.util.Scanner;

/**
 * Integrity Policy Statement My words and actions will reflect Academic
 * Integrity. I will not cheat or lie or steal in academic matters. I will
 * promote integrity in the UNCG community. Student’s Signature Eddy
 * Arriaga-Barrientos Date 09/30/2024
 */
// Eddy Arriaga-Barrientos
// CSC 130, Sec 1
// Assignment Four

public class Assignment4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        int number1 = 0;
        int number2 = 0;
        int addNumbers;
        int subtractNumbers;
        int modulusNumbers = 0;
        double divideNumbers;

        System.out.println("Eddy Arriaga-Barrientos");
        System.out.println("CSC 130, Sec 1");
        System.out.println("Assignment Four");

        System.out.println("This program will show the user a menu that allows the user to have\n"
                + "  the program calculate the sum, subtraction, division, and modulus of two numbers.\n");

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        System.out.println("Menu");
        System.out.println("1 - Calculate the addition of two numbers");
        System.out.println("2 - Calculate the subtraction of number2 from number1");
        System.out.println("3 - Calculate the division of number1 divided by number2");
        System.out.println("4 - Calculate the modulus of number1 mod number2");
        System.out.println("5 - Quit");
        System.out.print("\nPlease make your choice from the menu: ");
        choice = input.nextInt();

        if (choice < 1 || choice > 5) {
            System.out.print("Invalid choice. Please select 1, 2, 3, 4, or 5: ");
            choice = input.nextInt();
        }
        if (choice == 1) {
            addNumbers = number1 + number2;
            System.out.println("The addition of " + number1 + " + " + number2 + " = " + addNumbers);
        } else if (choice == 2) {
            subtractNumbers = number1 - number2;
            System.out.println("The subtraction of " + number1 + " - " + number2 + " = " + subtractNumbers);
        } else if (choice == 3) {
            divideNumbers = (double)number1 / (double)number2;
            System.out.println("The division of " + number1 + " / " + number2 + " = " + divideNumbers);
        } else if (choice == 4) {
            modulusNumbers = number1 % number2;
            System.out.println("The modulus of " + number1 + " % " + number2 + " = " + modulusNumbers);
        } else {
            System.out.println("Thank you for using my program!");
        }

    }
}
