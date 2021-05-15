package HelloWorld;

import javax.swing.*;

public class NumericSystem {

    public static void main(String[] args){

        String numberStr = JOptionPane.showInputDialog(null,"Enter a whole number");
        int decimalNumber = 0;
        try{
            decimalNumber = Integer.parseInt(numberStr);
        } catch( NumberFormatException e){
            JOptionPane.showMessageDialog( null, "Error you must enter a whole number");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String messageBinary = "number binary of " + decimalNumber+" = "+Integer.toBinaryString(decimalNumber);
        System.out.println( messageBinary );

        int binaryNumber = 0b111110100;

        System.out.println("binaryNumber = " + binaryNumber);
        String messageOctal = "Number octal  of " +decimalNumber+" = "+Integer.toOctalString(decimalNumber);
        System.out.println( messageOctal );
        int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber);

        String messageHex = "Number hexadecimal de " +decimalNumber+" = "+Integer.toHexString(decimalNumber);
        System.out.println(messageHex);
        int hexNumber = 0x1f4;
        System.out.println("hexNumber = " + hexNumber);

        String message = messageBinary;
        message += "\n"+ messageOctal;
        message += "\n"+ messageHex;
        JOptionPane.showMessageDialog( null,message);
    }
}

