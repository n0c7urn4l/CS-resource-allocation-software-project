/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ControllerClasses;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shanu
 */
public class DatabaseHandler {
    public static String URL = "jdbc:mysql://localhost:3306/hallmanager";
    public DatabaseHandler(){
        
    }
    
    public Connection getConnection() throws Exception{
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(URL,"root","");
        System.out.println("Connection Established...");
        return con;
        
    }
    
    public Statement getStatement(){
        
        Statement stmt = null;
        try {
            stmt = getConnection().createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return stmt;
        
    }
    
    
    
    
}
