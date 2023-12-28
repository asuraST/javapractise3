package main.java.exception;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {
    public void  throwcheckedExption() {
        //Signals that an attempt to open the file denoted by a specified pathname has failed.
        try {
            // Create a File in the specific path
            File file = new File("not_existing_file.txt");
            // here the attempt to open the file denoted by a specified pathname will fail.
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("checked exception type: " + e);
        }
        //An exception that provides information on a database access error or other errors.
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "user", "password")) {
            connection.prepareStatement("SELECT * FROM non_existent_table").executeQuery();
        }
        catch (SQLException e) {
            System.out.println("checked exception type: " + e);
        }
        //occurs when an unable to find the class
        try{
            Class temp = Class.forName(
                    "abc");
        }
        catch(ClassNotFoundException e) {
            System.out.println("checked exception type: " + e);
        }
    }
}
