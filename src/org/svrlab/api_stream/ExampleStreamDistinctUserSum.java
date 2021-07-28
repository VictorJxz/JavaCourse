package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleStreamDistinctUserSum {

    public static void main(String[] args) {

        IntStream largerUsername = Stream.of("Username[1] surname[1]0101","Username[1] surname[4]","Username[2] surname[2]",
                "Username[1] surname[1]","Username[1] surname[1]")
                .map( username ->  new User(username.split(" ")[0], username.split(" ")[1]))
                .distinct()
                .mapToInt( u -> u.toString().length())
                .peek(System.out::println);

        //largerUsername.forEach(System.out::println);
        IntSummaryStatistics statistics = largerUsername.summaryStatistics();
        System.out.println("Total  " + statistics.getSum());
        System.out.println("Max " + statistics.getMax());
        System.out.println("Min " + statistics.getMin());
        System.out.println("Average " + statistics.getAverage());


    }
}
