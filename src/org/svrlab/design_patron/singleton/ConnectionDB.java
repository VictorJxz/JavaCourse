package org.svrlab.design_patron.singleton;

public class ConnectionDB {

    private static ConnectionDB instance;

    private ConnectionDB() {
        System.out.println("Connection still database engine");
    }

    public static ConnectionDB getInstance() {

        if ( instance == null ) {
            instance = new ConnectionDB();
        }
        return instance;
    }



}
