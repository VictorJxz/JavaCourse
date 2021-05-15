package HelloWorld;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericSystemInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number :");

        int decimalNumber = 0;
        try{
            decimalNumber = scanner.nextInt();//Integer.parseInt(numberStr);
        } catch( InputMismatchException e){
            System.out.println("Error you must enter a whole number");
            main(args);
            System.exit(0);
        }


        System.out.println("decimalNumber = " + decimalNumber);

        String messageBinary = "number binary of " + decimalNumber+" = "+Integer.toBinaryString(decimalNumber);

        String messageOctal = "Number octal  of " +decimalNumber+" = "+Integer.toOctalString(decimalNumber);

        String messageHex = "Number hexadecimal de " +decimalNumber+" = "+Integer.toHexString(decimalNumber);

        String message = messageBinary;
        message += "\n"+ messageOctal;
        message += "\n"+ messageHex;
        System.out.println(message);
    }
}

