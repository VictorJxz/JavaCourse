package org.svrlab.class_optional;

import java.util.Optional;

public class ExampleOptional {

    public static void main(String[] args) {

        String username = "Victor";
        Optional<String> optional = Optional.of( username);

        System.out.println("optional = " + optional);
        System.out.println( optional.isPresent() );
        if ( optional.isPresent() ){
            System.out.println("Hello "+ optional.get());
        }
        System.out.println( optional.isEmpty() );

        optional.ifPresent( value -> System.out.println("Hello "+ value) );

        System.out.println("#..............................");
        username = "GTest";
        optional = Optional.ofNullable(username);
        System.out.println("optional = " + optional);
        System.out.println( optional.isPresent() );
        System.out.println( optional.isEmpty() );

        // version Java 9
        optional.ifPresentOrElse( value -> System.out.println("Hello "+ value),
                () -> System.out.println("Is not present"));

        if ( optional.isPresent() ){
            System.out.println("Hello "+ optional.get());
        } else {
            System.out.println("Is not present");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());

    }
}
