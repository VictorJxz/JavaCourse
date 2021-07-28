package org.svrlab.lambda;

import org.svrlab.lambda.arithmetic.ArithmeticX;
import org.svrlab.lambda.arithmetic.Calculator;

public class ExampleInterfaceFunctional {

    public static void main(String[] args) {

        ArithmeticX  add = Double::sum;
        ArithmeticX subtraction = (a, b) ->  a - b;

        Calculator calculator = new Calculator();
        System.out.println( calculator.compute( 10,5, add));
        System.out.println( calculator.compute( 10,5, subtraction));
        System.out.println( calculator.compute(10,5, (a, b) -> a * b));

        System.out.println(calculator.computeBiFunction(10, 5, (a, b) -> a + b));

    }
}
