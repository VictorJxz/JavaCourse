package org.svrlab.annotations.models;

import org.svrlab.annotations.processor.JsonSerializer;

import java.time.LocalDate;


public class ExampleAnnotation {

    public static void main(String[] args) {

        Product product = new Product();
        product.setDate( LocalDate.now() );
        product.setName("oak coffee table");
        product.setPrice(1000L);

        System.out.println("json -> " + JsonSerializer.convertJson( product ));



    }
}
