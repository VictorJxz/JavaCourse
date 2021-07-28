package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamMap {

    public static void main(String[] args) {

        Stream<User> usernames = Stream.of("Username[1] surname[1]","Username[2] surname[1]","Username[3] surname[1]")
                .map( username ->  new User(username.split(" ")[0], username.split(" ")[1]))
                .map( user -> {
                    String username  = user.getUsername().toUpperCase();
                    user.setUsername( username );
                    return  user;
                });
        List<User> list = usernames.collect(Collectors.toList());
        list.forEach(System.out::println);

        //usernames.forEach( System.out::println );



    }
}
