package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    private final String databaseName;

    public PostgresDB(String databaseName){
        this.databaseName = databaseName;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL = "jdbc:postgresql://localhost:3345/" + this.databaseName;
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(connectionURL, "postgres", "qwerty123");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
