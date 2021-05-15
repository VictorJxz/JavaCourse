package org.svrlab.overload;

import static org.svrlab.overload.Calculator.*;

public class ExampleOverload {

    public static void main(String[] args) {

        System.out.println("Add two integers : "+ add(10, 5));
        System.out.println("Add double : " + add( 10.0, 5.0));
        System.out.println("Add double - int : " +  add( 10.0, 5));
        System.out.println("Add int - double : " + add( 10, 5.0));
        System.out.println("Add float - float : " + add( 10f, 5f));
        System.out.println("Add string : " + add( "10", "5"));


        System.out.println("Add long : " + add( 10L, 5L));
        System.out.println("Add int : " + add( 10, '@'));
        System.out.println("Add float - int : " + add( 10.0, '@'));
        System.out.println("Add three integer : " + add(10, 5, 3));

        // Varargs
        System.out.println("Add varargs float - n int  : " + add(10.5f, 5, 3, 4));
        System.out.println("Add three integer : " + add(10, 5, 3, 4));
        System.out.println("Add double - n int : " + add( 10.0, 5.0, 3.5, 4.5));


    }
}
