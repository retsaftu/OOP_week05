package com.company;

public interface IDB {
    Connection getConnection() throws SQLException, ClassNotFoundException;
}
