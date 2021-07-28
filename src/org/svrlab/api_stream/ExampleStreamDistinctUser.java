package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.stream.Stream;

public class ExampleStreamDistinctUser {

    public static void main(String[] args) {

        Stream<User> usernames = Stream.of("Username[1] surname[1]","Username[1] surname[4]","Username[2] surname[2]",
                "Username[1] surname[1]","Username[1] surname[1]")
                .map( username ->  new User(username.split(" ")[0], username.split(" ")[1]))
                .distinct();

        usernames.forEach(System.out::println);


    }
}
