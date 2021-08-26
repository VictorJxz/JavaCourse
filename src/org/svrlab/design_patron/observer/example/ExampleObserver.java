package org.svrlab.design_patron.observer.example;

import org.svrlab.design_patron.observer.Corporation;

public class ExampleObserver {

    public static void main(String[] args) {

        Corporation google = new Corporation("Google", 1000);
        google.addObserver( (observable, obj ) -> {
            System.out.println("Investor Test: " + observable );
        });

        google.addObserver( (observable, obj ) -> {
            System.out.println("Investor Test2: " + observable );
        });

        google.modifyPrice( 2000 );
    }
}
