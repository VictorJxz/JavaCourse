package org.svrlab.apicollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetSearchDuplicate {

    public static void main(String[] args) {

        String[] fish = {"Corvina","Lenguado","Pejerrey","Robalo","Atún","Lenguado"};

        Set<String> only = new HashSet<>();
        for ( String item: fish){
            if (!only.add( item ) ){
                System.out.println("Duplicate item -> "+ item);
            }
        }
        System.out.println( only.size() + " No duplicated items -> "+ only);

    }
}
