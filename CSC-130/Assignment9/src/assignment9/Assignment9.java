package assignment9;

import java.util.Scanner;

public class Assignment9 {

    static Scanner input = new Scanner(System.in); //created a static scanner to be available throughout for user input

    public static void main(String[] args) {
        //program and programmer information block
        System.out.println("Briseida Cruz Maldonado, Michael Ramcharitar, Eddy Arriaga-B");
        System.out.println("CSC 130, Sec 1");
        System.out.println("Assignment Nine");
        System.out.println("");
        System.out.println("This program will play a guessing game with the user.");
        System.out.println("The computer will \"think\" of a number from 1- 100.");
        System.out.println(" and the user will try to guess the number.");
        System.out.println("This program will be method-based.");
        System.out.println("The first method of the program called namePlay( ) will ask the user to enter his or her name.");
        System.out.println("The program will be able to display that name.");
        System.out.println("The method seedRand( ) will generate a random number from 1-100.");
        System.out.println("The method readGuess( ) will accept a user's guess(es).");
        System.out.println("The method playGame( ) will compare the user's guess to the random number and tell the user to enter Higher\n" + "or Lower.");
        System.out.println("  This method will tell the user when they have guessed the number telling them how many times it took them\n" + "to guess it.");
        System.out.println("");
        System.out.println("Welcome to the GUESSING GAME!");
        System.out.println("");
        
        //call the method namePlay() to get the users name, create a random number and store it in randomNum by calling seedRand(), 
        //and call the playGame() method to start the game.
        String name = namePlay();
        int randomNum = seedRand(1, 100);
        playGame(name, randomNum);
    }
    
    //this method block will get the users name and tell the user about the hints.
    public static String namePlay() {
        System.out.println("I am thinking of a number from 1-100. You will try to guess the number.");
        System.out.print("To play, enter your first name: ");
        String name = input.nextLine();
        System.out.println("");
        System.out.println("Hi, " + name + ". Take your first guess.");
        System.out.println("I'll tell you whether to guess higher or lower.");
        System.out.println("");
        return name;
    }
    
    //this method block creates the random number and stores it so we can compare the users input to it later in the code.
    public static int seedRand(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    
    //this method block will compare the users guess to the parameters of the random number and will display an error if the uers's input is outside of the parameters. 
    public static void readGuess(int[] guessArr) {
        int guess;
        do {
            System.out.print("Enter a guess 1-100: ");
            guess = input.nextInt();
            System.out.println("");
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                System.out.println("");
            }
        }
        while (guess < 1 || guess > 100);
        guessArr[0] = guess;
    }
    
    //this method block will compare the users input to the stored random number and display a hint to aid the user in guessing the correct number. It will also
    //count the number of entered guesses and display a congratulatory message once the user guesses the correct number. 
    public static void playGame(String name, int randomNum) {
        int[] guessArr = new int[1];
        int guessCount = 0;
        
        do {
            readGuess(guessArr);
            int guess = guessArr[0];
            guessCount++;
            if (guess < randomNum) {
                System.out.println("Guess higher.");
            }
            else if (guess > randomNum) {
                System.out.println("Guess Lower.");
            }
        }
        while (guessArr[0] != randomNum);
        System.out.print("Congratulations, " + name + "! You guessed it in " + guessCount + " guesses!\n");
    }
    
}