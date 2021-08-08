package org.svrlab.design_patron.singleton;

public class ExampleSingleton {

    public static void main(String[] args) {

        ConnectionDB connectionDB = null;

        for ( int i =0; i < 5; i++) {
            connectionDB = ConnectionDB.getInstance();
            System.out.println("Connection -> " + connectionDB);
        }
        ConnectionDB connectionDB2 = ConnectionDB.getInstance();

        boolean bool = connectionDB == connectionDB2;
        System.out.println("bool -> " + bool);
    }


}
