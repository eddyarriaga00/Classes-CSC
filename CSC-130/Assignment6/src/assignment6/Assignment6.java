package assignment6;

import java.util.Scanner;

/**
 * Integrity Policy Statement My words and actions will reflect Academic
 * Integrity. I will not cheat or lie or steal in academic matters. I will
 * promote integrity in the UNCG community. Student’s Signature Eddy
 * Arriaga-Barrientos Date 10/25/2024
 */
//Eddy Arriaga-Barrientos
//CSC 130, Sec 1
//Assignment Six

public class Assignment6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nameLength;
        int whereIsSpace;
        String fullName;
        String firstName;
        String initial;
        String lastName;
        String convertedName;
        char firstLetter;
        int code;
        char ch;

        System.out.println("Eddy Arriaga-Barrientos");
        System.out.println("CSC 130, Sec 1");
        System.out.println("Assignment Six");
        System.out.println("");
        System.out.println("The program will work with the char and String data types and methods and ASCII and Unicode\n"
                + "characters.\n");

        System.out.print("Enter your full name, please, in the form of first name middle initial followed by a period, last name: ");
        fullName = input.nextLine();

        System.out.println("\nYour name is: " + fullName);
        nameLength = fullName.length();

        System.out.println("The length of your name is " + nameLength);

        whereIsSpace = fullName.indexOf(" ");
        firstName = fullName.substring(0, whereIsSpace);

        initial = fullName.substring(whereIsSpace + 1, whereIsSpace + 3);

        lastName = fullName.substring(whereIsSpace + 4, nameLength);

        System.out.println("\nYour first name is " + firstName + ".");
        System.out.println("Your middle initial is " + initial);
        System.out.println("Your last name is " + lastName + ".");

        firstLetter = lastName.charAt(0);

        System.out.println("\nThat the first character in your last name is a letter is " + Character.isLetter(firstLetter)
                + "\nand is that it is in lower case is " + Character.isLowerCase(firstLetter)
                + "\nand changed to a lower-case letter, it becomes a letter " + Character.toLowerCase(firstLetter));

        System.out.print("\nEnter an ASCH code: ");

        code = input.nextInt();
        ch = (char) code;
        
        System.out.println("The character for ASCH code " + code + " is " + ch);

        System.out.print("\nEnter an ASCH or Unicode character: ");
        convertedName = input.next();
        code = convertedName.charAt(0);    

        System.out.println("The Unicode for the character " + convertedName.charAt(0) + " is " + code);
    }

}
