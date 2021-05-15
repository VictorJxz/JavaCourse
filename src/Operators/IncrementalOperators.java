package Operators;

public class IncrementalOperators {

    public static void main(String[] args) {
        int i = 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post increment
        i = 2;
        j = i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Decrement
        i = 3;
        j = --i; // i = i - i = 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);


    }
}
