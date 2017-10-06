package schillingdl;

import java.util.Scanner;

public class Lab4 {

    /*
     * Name: Draven Schilling
     * Date: 9/28/17
     * Course: SE 1011/011
     * Quarter 1
     * Lab4 - Loops
     */

    public static void main(String args[]){

        /*
        This is a program which offers the users 2 choices for getting inheritance. They then chose which they perfer and
        get a result and a statement telling them if they chose the better option.
         */

        //Initialize variables
        final int linearIncriment = 500; // amount that gets added to the linear amount weekly
        Scanner input;
        input = new Scanner(System.in);

        int option; //user's choice for exponential or linear method
        int playAgain = 1; //used to determine if the user wants to play multiple times
        int numberOfWeeks;
        double uncle; //number which determines if the uncle dies or not
        double linearAmount; //running total for the linear money prediction
        double exponentialAmount; // running total for the exponential money prediction

        //print introduction
        System.out.println("Welcome to the Just for Fun Porobobility game!");
        System.out.println("you can chose either of two options. The number of weeks is random, so the challenge is to decide which option is better.");
        System.out.println("Assupmtions: Your Uncle has a 1/20 chance of dieing every day, the starting amount for option 1 is between 0 & 5000");
        System.out.println("Option 1: Starting with a given amount (such as $5000), he will add that amount to your total inheritance every week");
        System.out.println("Option 2: Starting with one penny, he will double your inheritance every week.");
        System.out.println("");
        while(playAgain == 1){

            //ask for option and initialize varriables
            System.out.println("Which option would you like (1 or 2)");
            option = input.nextInt();
            numberOfWeeks = 0;
            linearAmount = Math.random()*5000- 500;
            exponentialAmount = .005;

            do{
                //calculate weekly values and print them out
                linearAmount += linearIncriment;
                exponentialAmount = 2 * exponentialAmount;
                numberOfWeeks += 1;
                uncle = Math.random();
                System.out.format("Week: %d Linear: %.2f Exponential: %.2f", numberOfWeeks, linearAmount, exponentialAmount);
                System.out.println("");
            }while(uncle >= .05);

            System.out.println("Your uncle dies after " + numberOfWeeks + " weeks.");
            //determine if the user chose the better option and print that along with the difference in money
            if((linearAmount > exponentialAmount && option == 1) || (linearAmount < exponentialAmount && option == 2)){
                System.out.format("You Got lucky and ended up making $%.2f %s", + Math.abs(linearAmount-exponentialAmount), "extra!");
            } else {
                System.out.format("You got unlucky and missed out on $%.2f", Math.abs(linearAmount-exponentialAmount));
            }
            //ask if they would like to play again
            System.out.println("");
            System.out.println("Do you want to play again? (1 for yes) or (0 for no)");
            playAgain = input.nextInt();
        }
    }
}
