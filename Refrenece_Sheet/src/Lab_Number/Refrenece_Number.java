package Lab_Number;

import javax.swing.*;
import java.util.Scanner;

public class Refrenece_Number {
    /**
     * Java.comment for documentation
     * @param args
     */

    /*
     * class name same as lab name
     * other info including name, class, number, etc.
     */
    public static void main(String args[]){
    /*
     * ---Common Standard Methods---
     * System.out.print / println("String")
     */
        Scanner usr_input;

        usr_input = new Scanner(System.in);
        // Methods- next() *String*, nextLine() *string until newline*, nextInt(), nextDouble(), nextBoolean()
        String item = "text for days";
        // String methods- item.equals("yes") for testing text contents, item.substring(beg,end) inclusive of whitespace
        String inputs = JOptionPane.showInputDialog(null,"Text to get input");
        JOptionPane.showMessageDialog(null, "GUI Text");
        // JOptionPane for GUI window
        //Methods include- showInputDialog *input string*,
        int speed = Integer.parseInt(inputs);
        System.out.println("Hi");
    }
}
