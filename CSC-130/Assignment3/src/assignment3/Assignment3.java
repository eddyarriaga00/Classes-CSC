
package assignment3;

import java.util.Scanner;

/**
 * Integrity Policy Statement My words and actions will reflect Academic
 * Integrity. I will not cheat or lie or steal in academic matters. I will
 * promote integrity in the UNCG community. Student’s Signature Eddy
 * Arriaga-Barrientos Date 09/23/2024
 */
// Eddy Arriaga-Barrientos
// CSC 130, Sec 1
// Assignment Three

public class Assignment3 {

    public static void main(String[] args) {
        // identifiers
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int addingNumbers = 0;
        int modulusIntegers = 0;
        double numberFour = 0.0;
        double numberFive = 0.0;
        double addingRealNumbers = 0.0;
        float largeNumber = 123456789111213f;
        double powerNumber = 0.0;
        double average = 0.0;
        int count = 3;
        final double TAX_RATE = .06;

        // programmer and program information
        System.out.println("Eddy Arriaga-Barrietos");
        System.out.println("CSC 130, Sec 1");
        System.out.println("Assignment Three");
        System.out.println("");
        System.out.println("This program works with variables, constants, values, input and typecasting.\n" + "The program will also work with the augmented and increment and decrement operators.\n");

        // getting the values
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a whole number (one that does not have a decimal point): ");
        numberOne = keyboard.nextInt();
        System.out.print("Enter another whole number (one that does not have a decimal point): ");
        numberTwo = keyboard.nextInt();
        System.out.print("Enter the third whole number (one that does not have a decmial point): ");
        numberThree = keyboard.nextInt();
        System.out.print("Enter a real number (one that can have a decimal point): ");
        numberFour = keyboard.nextDouble();
        System.out.print("Enter another real number (one that can have a decimal point): ");
        numberFive = keyboard.nextDouble();
        System.out.println("");

        // doing some math and typecasting
        addingNumbers = (numberOne + numberTwo + numberThree);
        System.out.println("The addition of " + numberOne + " and " + numberTwo + " and " + numberThree + " is " + addingNumbers);

        average = (double) addingNumbers / 3;
        System.out.println("The average of the three numbers is " + average);

        modulusIntegers = (numberThree % numberOne);
        System.out.println("The modulus of " + numberThree + " by " + numberOne + " is " + modulusIntegers);

        modulusIntegers = (numberThree % numberTwo);
        System.out.println("The modulus of " + numberThree + " by " + numberTwo + " is " + modulusIntegers);

        modulusIntegers = (numberTwo % numberThree);
        System.out.println("The modulus of " + numberTwo + " by " + numberThree + " is " + modulusIntegers);

        addingRealNumbers = ((numberFour + numberFive) * TAX_RATE);
        System.out.println("The tax on the sum of " + (numberFour + numberFive) + " is " + addingRealNumbers);

        powerNumber = Math.pow((double) numberOne, (double) numberTwo);
        System.out.println(numberOne + " to the power of " + numberTwo + " is " + powerNumber);
        System.out.println("This is a large number that is showing in scientific notation: " + largeNumber);
        System.out.println("");

        // working with the augmented operator
        numberOne *= 3;
        System.out.println("numberOne was 2 and is now " + numberOne);

        numberTwo /= 3;
        System.out.println("numberTwo was 4 and is now " + numberTwo);

        numberThree %= 4;
        System.out.println("numberThree was 6 and is now " + numberThree);

        System.out.println("");

        // working with the increment and decrement operarators
        numberFour++;
        System.out.println("numberFour was 51.3 and is now " + numberFour);

        count++;
        System.out.println("count was 3 and is now " + count);
        System.out.println("");
        System.out.println("");

        // Bonus 
        int changeNumber = 20;

        changeNumber++;
        changeNumber %= 5;
        changeNumber *= 25;
        changeNumber /= 10;
        changeNumber -= 10;

        System.out.println("The variable changeNumber now has the value of: " + changeNumber);

        System.out.println("");
        System.out.println("");

    }

}
