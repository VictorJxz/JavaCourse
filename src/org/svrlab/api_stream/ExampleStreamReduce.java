package org.svrlab.api_stream;

import java.util.stream.Stream;

public class ExampleStreamReduce {

    public static void main(String[] args) {

        // concatenate strings into one
        Stream<String> username = Stream.of("Username[1] surname[1]","","Username[2] surname[2]", "","Username[2] surname[2]" )
                .distinct();
        String result = username.reduce("Result concatenate -> " , (a,b) -> a+" , "+b);
        System.out.println( result);


    }
}
