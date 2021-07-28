package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamFilterSingle {

    public static void main(String[] args) {

        Stream<User> usernames = Stream.of("Username[1] surname[1]","Username[1] surname[4]","Username[2] surname[2]")
                .map( username ->  new User(username.split(" ")[0], username.split(" ")[1]))
                .filter( u -> u.getUsername().equals("Username[1]"));

        Optional<User> user = usernames.findFirst();
        System.out.println( user );


    }
}
