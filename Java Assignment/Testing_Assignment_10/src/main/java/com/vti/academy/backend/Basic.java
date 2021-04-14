package com.vti.academy.backend;

import java.sql.*;

public class Basic {
    private Connection conn;

    //Exercise 1:
    //Q1:
    public void connect() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Testing_Assignment_1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url, username, password);

        System.out.println("Connection to database successful!");
    }

    //Q2:
    public void readPos() throws SQLException {
        Statement statement = conn.createStatement();

        String sql = "SELECT * FROM `Position`";
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt("PositionID"));
            System.out.println(rs.getString("PositionName"));
        }
    }

    //Q3:
    public void createPos(String name) throws SQLException {
        String sql = "INSERT INTO `Position` (PositionName) " + " VALUES (?) ";
        PreparedStatement statement = conn.prepareStatement(sql);

        // set parameter
        statement.setString(1, name);

        // Execute SQL Query with executeUpdate
        int affectedRecords = statement.executeUpdate();

        // Handing result set
        if (affectedRecords == 1) System.out.println("New position added successfully!");
        else {
            System.out.println("Failed to add the position.");
        }
    }

    //Q4:
    public void updatePos() throws SQLException {
        Statement statement = conn.createStatement();

        // Execute SQL Query with executeUpdate
        String sql = "UPDATE `Position` SET PositionName = 'Dev' WHERE PositionID = 5";
        int affectedRecords = statement.executeUpdate(sql);

        // Handing result set
        if (affectedRecords == 1) System.out.println("Updated successfully!");
        else {
            System.out.println("Unable to update.");
        }
    }

    //Q5:
    public void delDepartmentById(int id) throws SQLException {

        // Create a statement object
        String sql = " DELETE FROM `Position` WHERE PositionID = ?";
        PreparedStatement statement = conn.prepareStatement(sql);

        // set parameter
        statement.setInt(1, id);

        // Execute SQL Query with executeUpdate
        int effectedRecordAmount = statement.executeUpdate();

        // Handing result set
        if (effectedRecordAmount > 0) {
            System.out.println("Deleted department successfully!");
        } else {
            System.out.println("Unable to delete department.");
        }
    }

    //Close connection:
    public void closeConn() throws SQLException {
        conn.close();
    }
}
