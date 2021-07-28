package org.svrlab.api_stream;

import org.svrlab.api_stream.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ExampleStreamParallel {

    public static void main(String[] args) {


        List<User> list = new ArrayList<>();
        list.add( new User("Victor", "Jxz"));
        list.add( new User("Emilio", "Jxz"));
        list.add( new User("Test", "Gtz"));
        list.add( new User("Carta", "Ts"));
        list.add( new User("Test2","Ts2"));
        list.add( new User("Test3","Ts3"));
        list.add( new User("Test4","Ts4"));

        long time1 = System.currentTimeMillis();
        String result = list.stream()
                .parallel()
                .map( user -> user.toString().toUpperCase())
                .peek( n -> {
                    System.out.println("Name thread: " + Thread.currentThread().getName()+" - " +n);
                })
                .flatMap( username -> {
                    if ( username.contains("Test4".toUpperCase())){
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return Stream.of( username);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");
        long time2 = System.currentTimeMillis();
        System.out.println("Total time: "+ (time1-time2));

        System.out.println(result);


    }
}
