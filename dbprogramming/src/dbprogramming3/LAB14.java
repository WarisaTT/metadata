/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,username,password);
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("database URL: " + meta.getURL());
            System.out.println("database Product Name: " + meta.getDatabaseProductName());
            System.out.println("database Product Version: " + meta.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + meta.getDriverName());
            System.out.println("JDBC driver Version: " + meta.getDriverVersion());
            System.out.println("JDBC driver Major Version: " + meta.getDriverMajorVersion());
            System.out.println("JDBC driver Minor Version: " + meta.getDriverMinorVersion());
            System.out.println("Max Table Name Length: " + meta.getMaxTableNameLength());
            System.out.println("Max Columns In Table: " + meta.getMaxColumnsInTable());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
