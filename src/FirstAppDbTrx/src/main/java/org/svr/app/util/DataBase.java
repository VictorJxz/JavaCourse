package org.svr.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private static final String url = "jdbc:mysql://localhost:3306/java_course";
    private static final String username = "root";
    private static final String password = "virusmx50#";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if ( connection == null ) {
            connection = DriverManager.getConnection( url, username, password);
        }
        return connection;
    }
}
