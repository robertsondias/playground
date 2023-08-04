package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String PASSWORD = "rr";
    private static final String USERNAME = "postgres";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        

    }
    
}
