package org.svrlab.lambda;

import org.svrlab.lambda.models.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExampleConsumer {

    public static void main(String[] args) {

        Consumer<Date> consumer = date -> {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(format.format( date));
        };

        consumer.accept( new Date());

        BiConsumer<String, Integer> consumer1 = (username, age) -> {
            System.out.println( username+" Age : "+age);
        };
        consumer1.accept("Victor", 22);

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello world lambda");

        List<String>  usernames = Arrays.asList("Username[1]","Username[2]","Username[3]","Username[4]");
        usernames.forEach( consumer2 );
        
        Supplier<User> createUser = User::new;
        User user = createUser.get();

        BiConsumer<User, String> assignUsername = User::setUsername;
        assignUsername.accept( user, "Victor");
        System.out.println("Username : "+ user.getUsername());

        Supplier<String> provider = () -> "Hello world lambda supplier";
        System.out.println( provider.get() );

    }
}
