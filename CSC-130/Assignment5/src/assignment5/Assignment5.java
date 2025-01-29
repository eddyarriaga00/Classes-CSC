package assignment5;

import java.util.Scanner;

/**
 * Integrity Policy Statement My words and actions will reflect Academic
 * Integrity. I will not cheat or lie or steal in academic matters. I will
 * promote integrity in the UNCG community. Student’s Signature Eddy
 * Arriaga-Barrientos Date 10/2/2024
 */
//Eddy Arriaga-Barrientos
//CSC 130, Sec 1
//Assignment Five

public class Assignment5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        int choice;
        int max = 98;
        int min = 85;
        int range = max - min + 1;
        int randomNumber1;
        int randomNumber2;

        double area;
        double side;
        double base;
        double height;
        double radius;
        double testNumber = 15.56;
        double cosine = 0.0;
        double logarithm = 0.0;
        double squareRoot = 0.0;
        double ceiling = 0.0;
        double floor = 0.0;

        int minimum = 0;
        int maximum = 0;
        int newNumber = 97;

        System.out.println("Eddy Arriaga-Barrientos");
        System.out.println("CSC 130, Sec 1");
        System.out.println("Assignment Five");
        System.out.println("");
        System.out.println("This program will show the user a menu that allows him to make choices\n"
                + " between calculating the area of a rectangle, triangle, or circle, or generating a random number,\n"
                + " or playing with the math functions.\n"
                + "The program will use a switch statement.\n"
                + "After the user has selected his or her choice, the program will use a conditional operator to.\n"
                + " test if the user chooses a 2 or a 5.");
        System.out.println("");

        System.out.println("Menu");
        System.out.println("1 - Rectangle");
        System.out.println("2 - Triangle");
        System.out.println("3 - Circle");
        System.out.println("4 - Generate a random number between 55 and 98");
        System.out.println("5 - Playing with the math functions");
        System.out.println("6 - Testing with a nested if/else");
        System.out.println("7 - Quit");
        System.out.println("");

        System.out.print("Please make your choice from the menu: ");
        choice = input.nextInt();

        if (choice < 1 || choice > 7) {
            System.out.print("Invalid choice. Please select 1, 2, 3, 4, 5, 6, or 7: ");
            choice = input.nextInt();
        }

        switch (choice) {
            case 1:
                System.out.print("What is the length of one side of the rectangle? ");
                side = input.nextDouble();
                System.out.print("What is the length of the height of the rectangle? ");
                height = input.nextDouble();
                area = side * height;
                System.out.println("The area is " + area);
                break;
            case 2:
                System.out.print("What is the base of the triangle? ");
                base = input.nextDouble();
                System.out.print("What is the height of the triangle? ");
                height = input.nextDouble();
                area = 0.5 * (base * height);
                System.out.println("The area is " + area);
                break;
            case 3:
                System.out.print("What is the radius of the circle? ");
                radius = input.nextDouble();
                area = radius * radius * PI;
                System.out.println("The area is " + area);
                break;
            case 4:
                randomNumber1 = (int) (Math.random() * range) + min;
                System.out.println("The first random number is " + randomNumber1);
                randomNumber2 = (int) (Math.random() * range) + min;
                System.out.println("The second random number is " + randomNumber2);
                break;
            case 5:
                System.out.println("\nPlaying with the math functions\n");

                cosine = Math.cos(max);
                System.out.println("The trigonometric cosine of " + max + " in radians is " + cosine);

                logarithm = Math.log(max);
                System.out.println("The natural logarithm of " + max + " in radians is " + logarithm);

                squareRoot = Math.sqrt(min);
                System.out.println("The square root of " + min + " in radians is " + squareRoot);

                ceiling = Math.ceil(testNumber);
                System.out.println("The ceiling of " + testNumber + " is rounded up to its nearest integer and is " + (int) ceiling);

                floor = Math.floor(testNumber);
                System.out.println("The floor of  " + testNumber + " is rounded down to its nearest integer and is " + (int) floor);

                minimum = Math.min(min, max);
                System.out.println("The smallest of the two numbers " + min + " and " + max + " is " + minimum);

                maximum = Math.max(min, max);
                System.out.println("The largest of the two numbers " + min + " and " + max + " is " + maximum);
                break;
            case 6:

                System.out.println("\nTesting with a nested if/else");

                if (min > 75 || newNumber <= 99) {
                    System.out.println("\nThe variable that is min is " + min + " and that is greater than 75 and the variable that is newNumber is " + newNumber
                            + " and that is less than or equal to 99");
                }

                if (min == 50 || newNumber > 105) {
                    System.out.println("Either the variable that is min is " + min + " and that is equal to 50 or the variable that is newNumber is " + newNumber + " and that is greater than 105");
                } else {
                    System.out.println("Either the variable that is min is " + min + " and that is equal to 50 or the variable that is newNumber is " + newNumber + " and that is greater than 105");
                }

                min = 12;
                newNumber = 101;
                System.out.println("The variable that is min is " + min + " and that is less than 25 and the variable that is newNumber is " + newNumber + " and that is equal to 101");

            default:
                System.out.println("\nThank you for using my program!\n");
                break;
        }
        System.out.println("\nmax is now " + (max = (choice == 2 || choice == 5) ? 108 : 101));
        
        // bonus

    }
}
