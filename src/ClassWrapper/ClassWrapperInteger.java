package ClassWrapper;

public class ClassWrapperInteger {

    public static void main(String[] args) {

        int primitiveInt = 32768;
        Integer object = Integer.valueOf( 32768 );
        Integer object1 = primitiveInt ;

        int num = object;
        System.out.println("num = " + num);
        int num1 = object.intValue();
        System.out.println("num1 = " + num1);

        String value = "67000";
        Integer value1 = Integer.valueOf( value );
        System.out.println("value1 = " + value1);

        Short shortObject = object.shortValue();
        System.out.println("shortObject = " + shortObject);

        Byte byteObject = object.byteValue();
        System.out.println("byteObject = " + byteObject);

        Long longValue = object.longValue();
        System.out.println("longValue = " + longValue);






    }
}
