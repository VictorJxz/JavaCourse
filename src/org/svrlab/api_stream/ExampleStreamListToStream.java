package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStreamListToStream {

    public static void main(String[] args) {


        List<User> list = new ArrayList<>();
        list.add( new User("Victor", "Jxz"));
        list.add( new User("Emilio", "Jxz"));
        list.add( new User("Test", "Gtz"));
        list.add( new User("Carta", "Ts"));
        list.add( new User("Test2","Ts2"));

        Stream<String> usernames = list.stream().map( user -> user.getUsername().toUpperCase().concat(" ")
                .concat(user.getSurname().toUpperCase()))
                .flatMap( username -> {
                    if ( username.contains("Victor".toUpperCase())){
                        return Stream.of( username);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(usernames.count());


    }
}
