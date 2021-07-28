package org.svrlab.api_stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ExampleStreamRange {

    public static void main(String[] args) {

        // Range
        IntStream numbers = IntStream.range(5, 20).peek(System.out::println);
        int result = numbers.sum();
        IntSummaryStatistics summaryStatistics = numbers.summaryStatistics();
        System.out.println(" Max: "+ summaryStatistics.getMax() );
        System.out.println(" Min: "+ summaryStatistics.getMin() );
        System.out.println(" Sum: "+ summaryStatistics.getSum() );
        System.out.println(" Average: "+ summaryStatistics.getAverage() );


    }
}
    