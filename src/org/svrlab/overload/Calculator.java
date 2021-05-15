package org.svrlab.overload;

public class Calculator {

    private Calculator() {
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static double add(double x, double y){
        return x + y;
    }

    public static double add( double x, int y ){
        return x + y;
    }

    public static double add( int x, double y){
        return x + y;
    }

    public static float add( float x, float y ){
        return x + y;
    }

    public static int add( String x, String y ){
        int result;
        try{
            result = Integer.parseInt( x) + Integer.parseInt( y );
        } catch ( NumberFormatException e ){
            result = 0;
        }

        return result;
    }

    public static int add( int x, int y, int z ){
        return x + y + z;
    }

    // Varargs
    public static int add( int... arguments){
        int total  = 0;
        for ( int i : arguments ){
            total += i;
        }
        return total;
    }

    public static float add( float a , int... arguments){
        float total  = a;
        for ( int i : arguments ){
            total += i;
        }
        return total;
    }

    public static double add( double ... arguments) {
        double total = 0;
        for ( double i : arguments ){
            total += i;
        }
        return total;
    }




}
