package com.vti.academy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
    private Connection conn;

    public Connection getConn() throws ClassNotFoundException,
            SQLException {
        if (conn == null || conn.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/Testing_Assignment_1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
            String username = "root";
            String password = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, username, password);
        }

        return conn;
    }

    public void closeConn() throws SQLException {
        if (conn != null && conn.isClosed()) {
            conn.close();
        }
    }
}
