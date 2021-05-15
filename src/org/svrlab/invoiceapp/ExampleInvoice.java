package org.svrlab.invoiceapp;

import org.svrlab.invoiceapp.model.*;
import org.svrlab.invoiceapp.model.Client;
import org.svrlab.invoiceapp.model.Invoice;
import org.svrlab.invoiceapp.model.ItemInvoice;
import org.svrlab.invoiceapp.model.Product;

import java.util.Scanner;

public class ExampleInvoice {

    public static void main(String[] args) {

        Client client = new Client();
        client.setNif("5555-5");
        client.setName("@Victor");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the invoice description : ");
        Invoice invoice = new Invoice( scanner.nextLine(), client );

        Product product;

        System.out.println();

        for ( int i = 0; i < 2; i++) {
            product = new Product();
            System.out.print("Enter the product #" + product.getCode() + " : ");
            product.setName( scanner.nextLine());

            System.out.print("Enter the price : ");
            product.setPressure( scanner.nextDouble());

            System.out.print("Enter quantity : ");
            invoice.addItemInvoice( new ItemInvoice( scanner.nextInt(), product));

            System.out.println();
            scanner.nextLine();
        }

        System.out.println( invoice );


    }
}
