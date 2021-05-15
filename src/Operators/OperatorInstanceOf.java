package Operators;

public class OperatorInstanceOf {

    public static void main(String[] args) {

        String text = "Creating an object of the class String";
        Integer num = 7;

        boolean b1 = text instanceof String;
        System.out.println("The text is of the type String= " + b1);

        b1 = text instanceof  Object;
        System.out.println(" the text is from the Object = "+ b1);

        b1 = num instanceof Integer;
        System.out.println("num is of the type Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num is of the type Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num is of the type = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof  Number;
        System.out.println("decimal is type= " + decimal);


    }
}
