package Operators;

public class RelationalOperator {

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean n = false;

        boolean b1 = 5 == 5;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = n == true;
        System.out.println("b4 = " + b4);


    }
}
