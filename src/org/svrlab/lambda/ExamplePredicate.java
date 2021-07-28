package org.svrlab.lambda;

import org.svrlab.lambda.models.User;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExamplePredicate {

    public static void main(String[] args) {

        Predicate<Integer> test = number -> number > 10;
        boolean result = test.test(7);
        System.out.println("Result : " + result );

        Predicate<String> predicate = role -> role.equals("ROLE_ADMIN");
        System.out.println( predicate.test("ROLE_ADMIN"));

        BiPredicate<String, String> biPredicate = String::equals; //(a, b) -> a.equals(b);
        System.out.println( biPredicate.test("Victor","Test"));

        BiPredicate<Integer, Integer> biPredicate1 = (i, j) -> j > i;
        boolean result2 = biPredicate1.test(5,10);
        System.out.println( result2 );

        User a = new User();
        User b = new User();
        a.setUsername("Username[0]");
        b.setUsername("Username[0]");
        BiPredicate<User, User> biPredicate2 = (ua, ub) -> ua.getUsername().equals( ub.getUsername());
        System.out.println( biPredicate2.test( a, b));

    }
}
