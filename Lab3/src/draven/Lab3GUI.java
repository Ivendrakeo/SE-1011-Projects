package draven;

/*
 * Name: Draven Schilling
 * Date: 9/21/17
 * Course: SE 1011/011
 * Quarter 1
 * Lab3 - Conditionals
 */

import javax.swing.*;

public class Lab3GUI {

    // Refer to comments in Lab3Console for information on methodology becasue it's the exact same here
    // Except using console to get user input.

    public static void main(String args[]){

        double taxedIncome = 0;
        int marital_status = -1;
        int bracket = 0;
        double runningIncome;
        double income = 0;

        JOptionPane.showMessageDialog(null, "Welcome to the income tax calculator!");
        //while(){
        String inputs = JOptionPane.showInputDialog(null,
                "input 0 for single, 1 for married or -1 to exit: ");
        marital_status = Integer.parseInt(inputs);
        //}
        if(marital_status != -1){
            String incString = JOptionPane.showInputDialog(null, "input your 2017 Gross income: ");
            income = Integer.parseInt(incString);

        }

        runningIncome = income;

        if(marital_status == 0){
            if(income >= 9325) {
                taxedIncome += .1 * 9325;
                bracket = 1;
            }
            if(income >= 37950) {
                taxedIncome += .15 * 28625;
                bracket = 2;
            }
            if(bracket == 1){
                taxedIncome += .15 * (income - 9325);
            }
            if(income >= 91900){
                taxedIncome += .25 * 53950;
                bracket = 3;
            }
            if(bracket == 2){
                taxedIncome += .25 * (income - 37950);
            }
            if(income >= 191650){
                taxedIncome += .28 * 99750;
                bracket = 4;
            }
            if(bracket == 3){
                taxedIncome += .28 * (income - 91900);
            }
            if(income >= 416700){
                taxedIncome += .33 * 225050;
                bracket = 5;
            }
            if(bracket == 4){
                taxedIncome += .33 * (income - 191650);
            }
            if(income >= 418400){
                taxedIncome += .35 * 1700;
                bracket = 6;
            }
            if(bracket == 5){
                taxedIncome += .35 * (income - 416700);
            }
            if(income >= 418401){
                taxedIncome += .396 * (income - 418401);
                bracket = 7;
            }
            if(bracket == 6){
                taxedIncome += .35 * (income - 418400);
            }
            JOptionPane.showMessageDialog(null, "Your Taxed income is: " + taxedIncome);
        } else if (marital_status == 1){
            if(income > 470701){
                taxedIncome = (.10 * 18650) + (.15 * 57249) + (.25 * 77199)  +
                        (.28 * 80249) + (.33 * 183349) + (.35 * 53999) + (.396 * (runningIncome - 470700));
            }
            if(income > 416701 && income < 470700){
                taxedIncome = (.10 * 18650) + (.15 * 57249) + (.25 * 77199)  +
                        (.28 * 80249) + (.33 * 183349) + (.35 * (runningIncome - 416700));
            }
            if(income > 233351 && income < 416700){
                taxedIncome = (.10 * 18650) + (.15 * 57249) + (.25 * 77199)  +
                        (.28 * 80249) + (.33 * (runningIncome - 233350));
            }
            if(income > 153101 && income < 233350)
                taxedIncome = (.10 * 18650) + (.15 * 57249) + (.25 * 77199)  + (.28 * (runningIncome - 153100));
            if(income > 153101 && income < 233350)
                taxedIncome = (.10 * 18650) + (.15 * 57249) + (.25 * 77199)  + (.28 * (runningIncome - 153100));
            if(income > 75901 && income < 153100)
                taxedIncome = (.10 * 18650) + (.15 * 57249) + (.25 * 77199)  + (.25 * (runningIncome - 75900));
            if(income > 18651 && income < 75900)
                taxedIncome = (.10 * 18650) + (.15 * (runningIncome - 18650));
            if(income <= 18650)
                taxedIncome = .1 * income;
            JOptionPane.showMessageDialog(null, "Your Taxed income is: " + taxedIncome);
        } else {
            JOptionPane.showMessageDialog(null, "I guess you don't want to file today...");
        }
    }
}
