package org.svrlab.api_stream;

import org.svrlab.api_stream.models.Invoice;
import org.svrlab.api_stream.models.User;

import java.util.Arrays;
import java.util.List;

public class ExampleStreamFlatMapInvoice {

    public static void main(String[] args) {

        User user = new User("Victor", "Jxz");
        User user1 = new User("TestQ", "Ts");

        user.addInvoice( new Invoice("Buy Technology "));
        user.addInvoice( new Invoice("Buy furniture"));

        user1.addInvoice( new Invoice("Buy bike"));
        user1.addInvoice( new Invoice("Buy notebook"));

        List<User> userList = Arrays.asList( user, user1);

        userList.stream()
                .flatMap( u -> u.getInvoices().stream())
                .forEach( f -> System.out.println( f.getDescription().concat(" : Client ")
                        .concat( f.getUser().toString() )) );

/*        for ( User u: userList){
            for ( Invoice invoice: user.getInvoices()){
                System.out.println( invoice.getDescription());
            }
        }*/

    }
}
