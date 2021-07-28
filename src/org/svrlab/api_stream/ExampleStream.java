package org.svrlab.api_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {

    public static void main(String[] args) {

        Stream<String> usernames = Stream.of("Username[1]","Username[2]","Username[3]","Username[4]");
        //usernames.forEach( System.out::println );

        String[] arr = {"Username[1]","Username[2]","Username[3]","Username[4]"};
        Stream<String> usernames2 = Arrays.stream( arr );
        //usernames2.forEach( System.out::println );

        Stream<String> usernames3 = Stream.<String>builder().add("Username[1]").add("Username[2]").build();
        //usernames3.forEach( System.out::println );

        List<String> list = new ArrayList<>();
        list.add("Username[1]");
        list.add("Username[2]");
        list.add("Username[3]");

        //Stream<String> usernames4 = list.stream();
        //usernames4.forEach( System.out::println );

        list.stream().forEach( System.out::println );


    }
}
