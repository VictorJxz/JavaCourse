package HelloWorld;

public class PrimitiveFloat {

    public static void main(String[] args) {

        float realFloat = 0.000000000015F; //1.5e-10F
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float type correspond in byte to "+Float.BYTES);
        System.out.println("Float type correspond in bytes to "+Float.SIZE);
        System.out.println("Maximum value of a float "+Float.MAX_VALUE);
        System.out.println("Maximum value of a float "+Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = "+realDouble);
        System.out.println("Double type correspond in byte to "+Double.BYTES);
        System.out.println("Double type correspond in bytes to "+Double.SIZE);
        System.out.println("Maximum value of a double "+Double.MAX_VALUE);
        System.out.println("Minimum value of a double "+Double.MIN_VALUE);

        var varFloat = 3.1416F;
        System.out.println("VarFloat = "+varFloat);
    }
}
