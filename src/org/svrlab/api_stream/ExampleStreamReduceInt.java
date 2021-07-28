package org.svrlab.api_stream;

import java.util.stream.Stream;

public class ExampleStreamReduceInt {

    public static void main(String[] args) {

        // Add elements of a Stream
        Stream<Integer> numbers = Stream.of(5, 10, 15, 20);
        Integer result = numbers.reduce(0, Integer::sum );
        System.out.println( result );


    }
}
