package org.svr.app;

import org.svr.app.models.Category;
import org.svr.app.models.Product;
import org.svr.app.repository.*;

public class MainUpdate {

    // # 3

    public static void main(String[] args) {

        Repository<Product> repository = new ProductRepository();
        System.out.println("..........      toList      ........");
        repository.toList().forEach(  System.out::println );

        System.out.println(".......     byId        ...........");
        System.out.println( repository.byId(2L));

        System.out.println(".......     updateProduct        ...........");
        Product product = new Product();
        product.setId(4L);
        product.setProduct("Mechanical Razer Test keyboard");
        product.setPrice(1470);
        Category category = new Category();
        category.setId(3L);
        product.setCategory( category );
        repository.save( product );

        System.out.println("Product successfully edit");

        System.out.println(".......     toListProduct        ...........");
        repository.toList().forEach(  System.out::println );

    }
}
