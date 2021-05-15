package Operators;

import javax.swing.*;

public class ArithmeticOperator {

    public static void main( String[] args){

        int i = 5, j = 4, addition = i +j;
        System.out.println("suma = " + addition);
        System.out.println("i + j = " + (i+j));

        int subtraction = i -j ;
        System.out.println("subtraction = " + subtraction);
        System.out.println("i - j = " + (i - j));

        int multiplication = i * j;
        System.out.println("multiplication = " + multiplication);

        double divicion = (double) i / j;
        System.out.println("divicion = " + divicion);

        int mod = i % j;
        System.out.println("mod = " + mod);
        mod = 8 % 5;
        System.out.println("mod = " + mod);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number "));
        if( num % 2 == 0){
            System.out.println("Even number " + num);
        }else {
            System.out.println("Is odd number "+ num);
        }

        


    }
}
