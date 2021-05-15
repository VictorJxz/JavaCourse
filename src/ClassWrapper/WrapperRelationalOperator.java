package ClassWrapper;

public class WrapperRelationalOperator {

    public static void main(String[] args) {

        Integer num = 1000;
        Integer num1 = num;

        System.out.println("mun1 = " + num1);
        System.out.println("num = " + num);

        System.out.println("They are the some object "+( num1 == num));

        num1 = 1000;
        System.out.println("They are the some object "+( num1 == num));

        // The relational operator in wrapper classes are of referential stay of
        // the object and in primitive values they evaluate by value.

        System.out.println("Have the same value "+( num1.equals( num)) );
        System.out.println("Have the same value "+( num1.intValue() == num.intValue()) );

        num1 = 2000;
        boolean condition = num1 > num;
        System.out.println("condition = " + condition);
    }
}
