package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.stream.Stream;

public class ExampleStreamFlatMap {

    public static void main(String[] args) {

        Stream<User> usernames = Stream.of("Username[1] surname[1]","Username[1] surname[4]","Username[2] surname[2]","Username[3] surname[3]")
                .map( username ->  new User(username.split(" ")[0], username.split(" ")[1]))
                .flatMap( u -> {
                    if (u.getUsername().equalsIgnoreCase("Username[1]")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

/*
        List<User> list = usernames.collect(Collectors.toList());
        list.forEach(System.out::println);
*/
        //usernames.forEach( System.out::println );
        System.out.println( usernames.count());



    }
}
