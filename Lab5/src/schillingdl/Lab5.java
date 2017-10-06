package schillingdl;

import java.util.Scanner;

public class Lab5 {

    /*
     * Name: Draven Schilling
     * Date: 8/5/17
     * Course: SE 1011/011
     * Quarter 1
     * Lab5 - Library Classes
     */

    public static void main(String args[]){

        //Declare Varriables
        double y;
        double x;
        int numPoints;
        int pointsUnderCurve;
        int correctDecimalPlaces;
        boolean excSeq;
        boolean isInt;
        String playAgain = "y";
        String pi = Double.toString(Math.PI);
        Scanner input;
        input = new Scanner(System.in);

        //Create escape sequence for if the user wants to play multiple times
        while(playAgain.charAt(0) == 'y' || playAgain.charAt(0) =='Y') {

            //Give initial values
            pointsUnderCurve = 0;
            correctDecimalPlaces = 0;
            excSeq = false;

            //Enter estimate and verify it is an integer
            System.out.println("Enter a number that will be used to estimate pi. The larger the number, the better the estimate");
            while(!input.hasNextInt()){
                System.out.println("Invalid input. Please enter a integer.");
                input.next();
            }
            numPoints = input.nextInt();
            //Run give each point an x,y value and determine if it is under the curve
            for (int pointItr = numPoints; pointItr > 0; pointItr--) {
                y = Math.random();
                x = Math.random();
                if (Math.sqrt(x * x + y * y) < 1) {
                    pointsUnderCurve++;
                }
            }
            //Print estimate and loop through each value and see how many decimal places match with real pi
            System.out.println("The estimate for pi is: " + ((double) pointsUnderCurve / (double) numPoints * 4));
            String piEst = Double.toString(((double) pointsUnderCurve / (double) numPoints * 4));
            for (int i = 0; i < pi.length() && !excSeq; i++) {
                if (pi.charAt(i) == piEst.charAt(i)) {
                    if (pi.charAt(i) != '.')
                        correctDecimalPlaces++;
                } else
                    excSeq = true;
            }
            //Print correct number of estimated digits
            System.out.println("The number of correct estimated digits is: " + correctDecimalPlaces);
            System.out.println("");
            //Ask to play again
            do {
                System.out.println("Would you like to play again [y / n]?");
                playAgain = input.next();
            }while(!(playAgain.equals("Y") || playAgain.equals("y") ||
                    playAgain.equals("N") || playAgain.equals("n")));
        }
    }
}
