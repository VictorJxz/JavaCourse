package org.svrlab.apicollection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

    public static void main(String[] args) {

        // Java 8 -> Comparator.reverseOrder()
        Map<String, Object> person = new TreeMap<>(Comparator.reverseOrder());

        person.put("username","John");
        person.put("surname", "Doe");
        person.put("email", "john_doe@gmail.com");
        person.put("age", 30);

        Map<String, String> direction = new TreeMap<>(Comparator.comparing(String::length).reversed());
        direction.put("country","MX");
        direction.put("state","Quintana Roo");
        direction.put("city","Cancun");
        direction.put("street", "principal");
        person.put("direction", direction);

        System.out.println("person = " + person);



    }
}
