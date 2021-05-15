package org.svrlab.exceptions.example;

import javax.swing.*;

public class ExampleExceptions {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        String numerator = JOptionPane.showInputDialog("Enter an integer -> numerator: ");
        String denominator = JOptionPane.showInputDialog("Enter an integer -> divider: ");

        try {
            double division2 = calculator.divide(numerator,denominator);
            System.out.println( division2 );

        } catch (NumberFormatException nfe ){
            System.out.println("An exception was encountered: please enter a numeric value -> "+nfe.getMessage());
            main( args );
        } catch ( NumericFormatException e ){
            System.out.println("An exception was caught "+e.getMessage());
            e.printStackTrace( System.out);
        }
        catch( DivisionByZeroException ae ){
            System.out.println( "Catch exception at runtime -> " + ae.getMessage());
            main( args );
        } finally {
            System.out.println("It is optional, but always runs with or without exception ");
        }
        System.out.println("We continue with the flow of our application");
    }
}
