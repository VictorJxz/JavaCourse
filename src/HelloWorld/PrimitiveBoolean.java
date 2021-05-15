package HelloWorld;

public class PrimitiveBoolean {

    
    public static void main(String[] args){
        boolean logicalData = true;
        System.out.println("logicalData = " + logicalData);

        double d = 23456.89e-3; //23.45689
        System.out.println("d = " + d);
        float f = 1.2345e2f; //12.345
        System.out.println("f = " + f);

        logicalData = d > f;
        System.out.println("logicalData = "+logicalData);

        boolean esIqualx = (3-2 == 1);
        System.out.println("esIqualx = " + esIqualx);

    }

}
