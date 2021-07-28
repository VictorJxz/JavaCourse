package org.svrlab.lambda.arithmetic;

import java.util.function.BiFunction;

public class Calculator {

    public double compute( double a, double b, ArithmeticX lambda){
        return lambda.operation(a,b);
    }

    public  double computeBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a, b);
    }
}
