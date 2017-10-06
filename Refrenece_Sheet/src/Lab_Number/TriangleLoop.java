package Lab_Number;

import java.util.Scanner;

public class TriangleLoop {
    public static void main(String args[]){
        Scanner user_input;
        user_input = new Scanner(System.in);
        System.out.println("input tirnagle base that is greater than 0");
        int base = user_input.nextInt();
        boolean flag = false;
        if(base%2 == 1){
            flag = true;
        }
        double height = Math.ceil((base/2 + 1));
        int row = 1;
        int depth = 0;
        while(row < height){
            depth = row;
            System.out.println("");
            while(depth >= 1){
                System.out.print("*");
                --depth;
            }
            ++row;
        }
        System.out.println("");
        int remainder = base-row-1;
        if(!flag) {
            while (row > 1) {
                System.out.print("*");
                --row;
            }
        }else {
            while(row > 0){
                System.out.print("*");
                --row;
            }
        }
        while(remainder >= 0){
            depth = remainder + 1;
            System.out.println("");
            while(depth >= 1){
                System.out.print("*");
                --depth;
            }
            --remainder;
        }
    }
}
