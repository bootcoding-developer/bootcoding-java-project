package com.bootcoding.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerDAO {

    public static void main(String[] args) {
        CustomerDAO cd = new CustomerDAO();
        for(int i = 103; i < 10000; i++){
            cd.insertCustomer(i);
            System.out.println("New record Inserted into database!");
        }
    }

    public void insertCustomer(int i){

        // Database Connectivity in Java
        // Total 5 steps
        // 1. Load JDBC Driver into Memory
        // 2. Create Database Connection
        // 3. Create Statement to write a SQL Query
        // 4. Get Result into ResultSet
        // 5. Close DB Connection
        try{
            // 1. Load JDBC Driver into Memory
            Class.forName("org.postgresql.Driver");

            // 2. Create Database Connection
           Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "postgres");
            // 3. Create Statement to write a SQL Query
            Statement stmt = connection.createStatement();
            // 4. Get Result into ResultSet
            stmt.executeUpdate("insert into customer " +
                    "values("+ i + ", 'Suresh', 'Surya Nagar', 989787, 'Wardha')");

            // 5. Close DB Connection
            connection.close();


        }catch (Exception ex){

        }
    }
}
