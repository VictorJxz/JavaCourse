package Operators;

public class OperatorInstanceOfType {

    public static void main(String[] args) {

        Object text = "Creating an object of the class String";
        Number num = 7;
        Number numx = Integer.valueOf(7);

        boolean b1 = text instanceof String;
        System.out.println("The text is of the type String= " + b1);

        b1 = text instanceof  Object;
        System.out.println(" the text is from the Object = "+ b1);

        b1 = num instanceof Integer;
        System.out.println("num is of the type Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num is of the type Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num is of the type Object = " + b1);

        Number decimal = Double.valueOf(45.54);
        b1 = decimal instanceof  Number;
        System.out.println("decimal is type Number= " + b1);


        b1 = text instanceof Integer;
        System.out.println("The text is of the type Integer = " + b1);

        b1 = num instanceof Long;
        System.out.println("Num is of the type Long = " + b1);

        b1 = decimal instanceof Double;
        System.out.println("Num is of the type Double = " + b1);




    }
}
