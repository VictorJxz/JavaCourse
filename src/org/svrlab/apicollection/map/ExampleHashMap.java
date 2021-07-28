package org.svrlab.apicollection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleHashMap {

    public static void main(String[] args) {

        Map<String, Object> person = new HashMap<>();
        System.out.println("Contains elements : " + !person.isEmpty());
        person.put(null, "1234");
        person.put("username","John");
        person.put("surname", "Doe");
        person.put("email", "john_doe@gmail.com");
        person.put("age", 30);

        Map<String, String> direction = new HashMap<>();
        direction.put("country","MX");
        direction.put("state","Quintana Roo");
        direction.put("city","Cancun");
        direction.put("street", "principal");
        person.put("direction", direction);

        System.out.println("person = " + person);

        String username = (String) person.get("username");
        System.out.println("username -> " + username);

        Map<String, String> directionPerson = (Map<String, String>)person.get("direction");
        String country = directionPerson.get("country");
        String city = directionPerson.get("city");
        String location = directionPerson.getOrDefault("location", "Beach");

        System.out.println("Country : "+ country);
        System.out.println("City : "+ city);
        System.out.println("Location : "+ location);

        String value = (String)person.remove("surname");
        System.out.println("Delete -> " + value);
        System.out.println("person = " + person);


        boolean b = person.containsKey("surname");
        System.out.println("b = " + b);

        b = person.containsValue("john_doe@gmail.com");
        System.out.println("b = " + b);

        System.out.println("#................................... values() ");
        Collection<Object> values = person.values();
        for (Object v: values){
            System.out.println( v);
        }

        System.out.println("#................................... keySet() ");
        Set<String> keys = person.keySet();
        for( String k: keys){
            System.out.println("k : "+ k);
        }

        System.out.println("#................................... entrySet() ");
        for(Map.Entry<String, Object> item: person.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }

        System.out.println("#................................... keySet() ");
        for (String key: person.keySet()){
            Object var = person.get(key);
            if (var instanceof Map){
                Map<String, String> directionMap = (Map<String, String>) var;
                for (Map.Entry<String, String> dir: directionMap.entrySet()){
                    System.out.println(dir.getKey() +" : "+dir.getValue());
                }
            } else{
                System.out.println( key + " * "+ var);
            }
        }

        System.out.println("#................................... Java 8 ");
        person.forEach( (key,var) ->{
            System.out.println( key + " * "+ var);
        });

        System.out.println("Total : "+person.size());
        System.out.println("Contains elements : " + !person.isEmpty());

        boolean b2 = person.replace("username","John", "Victor");
        System.out.println("b2 = " + b2);
        System.out.println(person);


    }
}
