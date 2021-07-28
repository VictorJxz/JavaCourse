package org.svrlab.apicollection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>((a, b) ->  b.compareTo(a) );
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");

        System.out.println( "Tree set"+ treeSet);
        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        System.out.println("numbers = " + numbers);


    }
}
