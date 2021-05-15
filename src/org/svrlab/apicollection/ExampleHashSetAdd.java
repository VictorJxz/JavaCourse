package org.svrlab.apicollection;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSetAdd {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");

        System.out.println( hs );

        boolean element = hs.add("three");
        System.out.println("Allow duplicate elements " + element);
        System.out.println( hs );


    }
}
