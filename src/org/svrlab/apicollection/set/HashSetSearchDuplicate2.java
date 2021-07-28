package org.svrlab.apicollection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSearchDuplicate2 {

    public static void main(String[] args) {

        String[] fish = {"Corvina","Atún","Lenguado","Pejerrey","Robalo","Atún","Lenguado"};

        Set<String> only = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for ( String item: fish){
            if (!only.add( item ) ){
                duplicate.add( item );
            }
        }
        only.removeAll( duplicate );
        System.out.println("#Only " + only);
        System.out.println("#Duplicated "+ duplicate);

    }
}
