package org.svrlab.api_stream;

import java.util.stream.Stream;

public class ExampleStreamFilterEmpty {

    public static void main(String[] args) {

        long count = Stream.of("Username[1] surname[1]","","Username[2] surname[2]","")
                .filter( String::isEmpty ).count();

        System.out.println( "Count -> "+count);


    }
}
