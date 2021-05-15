package MathClass;

public class ExampleMathClass {

    public static void main(String[] args) {

        int absolute = Math.abs( -3 );
        System.out.println("absolute = " + absolute);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double ceiling = Math.ceil(3.5);
        System.out.println("ceiling = " + ceiling);

        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);

        long whole = Math.round(Math.PI);
        System.out.println("whole = " + whole);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double power = Math.pow(10, 3);
        System.out.println("power = " + power);

        double squareRoot = Math.sqrt(5);
        System.out.println("squareRoot = " + squareRoot);

        double degrees = Math.toDegrees(1.57);
        degrees = Math.round( degrees );
        System.out.println("Convert radians to degrees = " + degrees);

        double radians = Math.toRadians(90.00);
        System.out.println("Convert degrees to radians = " + radians);

        System.out.println("sing( 90 ) : "+ Math.sin( radians ));
        System.out.println("cos( 90 ) : "+ Math.cos( radians ));

        radians = Math.toRadians( 180.00 );
        System.out.println("cos( 180 ) : "+ Math.cos( radians ));


    }
}
