package org.svrlab.generics;

import org.svrlab.repository_poo.model.Client;
import org.svrlab.repository_poo.model.ClientPremium;

import java.util.*;

public class ExampleGenerics {

    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        clients.add( new Client("Victor", "Jimenez"));

        Client dataTest = clients.iterator().next();

        Client[] clientsArray = {new Client("Victor", "Jimenez"),new Client("Emilio", "Perez")};
        Integer[] integersArray = {1,2,3};

        List<Client> clientsList = fromArrayToList( clientsArray );
        List<Integer> integersList = fromArrayToList( integersArray );

        clientsList.forEach( System.out::println );
        integersList.forEach( System.out::println );

        List<String> usernames = fromArrayToList(new String[]{"Victor","Emilio","Erick"}, integersArray);
        usernames.forEach( System.out::println );

        List<ClientPremium> clientPremiums = fromArrayToList(new ClientPremium[]{ new ClientPremium("Raul","Fernandez")});

        printClient( clients );
        printClient( clientsList );
        printClient( clientPremiums );

        System.out.println("Max of 1,9 y 4 -> "+maximum(1,9,4));
        System.out.println("Max of 3.9, 11.6, 7.78 -> "+ maximum(3.9,11.6,7.78));
        System.out.println("Max of carrot, blueberries, apple -> "+ maximum("carrot","blueberries","apple"));
    }

    // #............    Bounded generics    .................
    // There may be times when you want to restrict the types that can be used as type arguments
    // in a parameterized type. For example, a method that operates on numbers might only want
    // to accept instances of Number or its subclasses. This is what bounded type parameters are for.

    public static <T> List<T> fromArrayToList( T[] data ){
        return Arrays.asList( data );
    }

    public static <T extends Number> List<T> fromArrayToList( T[] data ){
        return Arrays.asList( data );
    }

    public static <T extends Client & Comparable<T>> List<T> fromArrayToList( T[] data ){
        return Arrays.asList( data );
    }

    public static <T, G> List<T> fromArrayToList( T[] data, G[] anyType ){
        for ( G item : anyType ){
            System.out.println( item );
        }
        return Arrays.asList( data );
    }

    public static void printClient(List<? extends Client> clients){
        clients.forEach( System.out::println );
    }

    public static <T extends Comparable<T>> T maximum(T a, T b ,T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if ( c.compareTo( max ) > 0){
            max = c;
        }
        return max;
    }
}
