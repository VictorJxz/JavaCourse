package org.svrlab.exceptions.example;

public class Calculator {

    public double divide( int numerator, int denominator) throws DivisionByZeroException{
        if ( denominator == 0){
            throw new DivisionByZeroException("Cannot be divided by zero");
        }
        return numerator/(double)denominator;
    }

    public double divide(String numerator, String denominator ) throws DivisionByZeroException, NumericFormatException{
        try {
            int num = Integer.parseInt(numerator);
            int den = Integer.parseInt(denominator);
            return this.divide( num, den);
        } catch ( NumberFormatException e){
            throw new NumericFormatException("You must enter only number [numerator, denominator] ");
        }

    }
}