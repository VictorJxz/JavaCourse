package org.svrlab.api_stream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ExampleStreamInfiniteGenerate {

    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger(0);
        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello world -> ".concat(String.valueOf( counter.incrementAndGet()));
        })
                .limit(10)
                .forEach(System.out::println);
    }
}
