package org.svrlab.interfaces.printing.model;

public interface Printable {

    String DEFAULT_TEXT = "Print a default value";

    default String print(){
        return DEFAULT_TEXT;
    }

    static void print(Printable printable ){
        System.out.println( printable.print() );
    }
}
