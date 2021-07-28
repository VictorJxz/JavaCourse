package org.svrlab.api_stream;

import java.util.stream.Stream;

public class ExampleStreamDistinct {

    public static void main(String[] args) {

        // Remove repeating values .distinct()
        Stream.of("Username[1] surname[1]","","Username[2] surname[2]", "","Username[2] surname[2]" )
                .distinct()
                .forEach(System.out::println);


    }
}
