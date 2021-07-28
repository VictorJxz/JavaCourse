package org.svrlab.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExampleFunction {

    public static void main(String[] args) {

        Function<String, String> function = param -> "Hi, "+param;
        String result = function.apply("Victor");
        System.out.println(result);

        Function<String, String> function1 = String::toUpperCase;
        System.out.println( function1.apply("victor"));

        BiFunction<String, String, String> biFunction = (a, b) -> a.toUpperCase().concat( b.toUpperCase());
        String result2 = biFunction.apply("victor","jxz");
        System.out.println(result2);

        BiFunction<String, String, Integer> biFunction1 = String::compareTo; //(a, b) -> a.compareTo(b);
        System.out.println( biFunction1.apply("victor","victor"));

        BiFunction<String, String, String> biFunction2 = String::concat; //(a, b) -> a.concat(b);
        System.out.println( biFunction2.apply("victor","jxz"));

    }
}
