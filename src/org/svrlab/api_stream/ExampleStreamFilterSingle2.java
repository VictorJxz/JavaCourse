package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.stream.Stream;

public class ExampleStreamFilterSingle2 {

    public static void main(String[] args) {

        User user = Stream.of("Username[1] surname[1]","Username[1] surname[4]","Username[2] surname[2]")
                .map( username ->  new User(username.split(" ")[0], username.split(" ")[1]))
                .filter( u -> u.getId().equals(6))
                .findFirst().orElseGet( () -> new User("Optional user", "test 01") );

        System.out.println( user );


    }
}
