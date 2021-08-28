package me.java.golf.study.step9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class ExceptionSample {
    
    @Autowired private static DataSource dataSource;
    @Autowired private static Connection connection;
    
    public static void main(String[] args) {
    
        try {
            connection = dataSource.getConnection();
    
            ResultSet resultSet = connection.prepareStatement("SELECT * FROM USER")
            .executeQuery();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}