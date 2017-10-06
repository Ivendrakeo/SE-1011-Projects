/*
 * Course: SE-1011
 * Term: Fall 2017
 * Assignment: Lab 1
 * Author: Dr. Chris Taylor
 * Date: 09/14/09
 * Modified: 06/08/17 - updated for Fall 2017
 */
package schillingdl;
import java.util.Scanner;
/**
 * Class containing the entire program for lab 1 in fall 2017
 *  SE-1011 course.
 * @author taylor
 * @version 2017-06-08-1.5
 */
public class Lab1 {
    /**
     * Simple program to calculate the amount of money a user
     * will earn in one year.
     * @param args ignored
     */
    public static void main(String[] args) {
        // Create a "reference variable"/object to gather data
        // from the keyboard
        final int WEEKS_IN_YEAR = 52;
        Scanner in = new Scanner(System.in);
        // Request data from the user
        System.out.print("Enter the number of hours worked per week: ");
        int hoursWorked = in.nextInt();
        System.out.print("Enter the number of weeks of vacation taken: ");
        int vacationWeeks = in.nextInt();
        System.out.print("Enter your hourly wage (in dollars): ");
        double hourlyWage = in.nextDouble();
        // Calculate earnings
        double yearlyEarnings = hoursWorked * (WEEKS_IN_YEAR - vacationWeeks)
                * hourlyWage;
        System.out.print("You will earn $" + yearlyEarnings
                + " in one year.");

    }
}
