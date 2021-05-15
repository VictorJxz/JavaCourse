package HelloWorld;

public class TypeConservation {

    public static void main(String[] args){

        var numberStr = "50";
        int numberInt = Integer.parseInt( numberStr );
        System.out.println("numberInt = " + numberInt);

        var realStr = "987564.73e-3";
        double realDouble = Double.parseDouble( realStr );
        System.out.println("realDouble = " + realDouble);

        var logicalStr = "true";
        boolean logicalBoolean = Boolean.parseBoolean( logicalStr );
        System.out.println("logicalBoolean = " + logicalBoolean);

        int otherNumber = 100;
        System.out.println("otherNumber = " + otherNumber);
        String otherNumberStr = Integer.toString( otherNumber );
        System.out.println("otherNumberStr = " + otherNumberStr);

        otherNumberStr = String.valueOf( otherNumber+10 );
        System.out.println("otherNumberStr = " + otherNumberStr);

        double otherRealDouble = 1.34567e2;
        String otherRealStr = Double.toString( otherRealDouble );
        System.out.println("otherRealStr = " + otherRealStr);

        otherRealStr = String.valueOf(1.53456e2f);
        System.out.println("otherRealStr = " + otherRealStr);

        int i = 20000;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char)i;
        System.out.println("b = " + b);
        float f = (float)i;
        System.out.println("f = " + f);

    }
}
