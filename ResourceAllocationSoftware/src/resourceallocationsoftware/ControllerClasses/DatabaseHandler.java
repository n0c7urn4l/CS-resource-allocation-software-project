/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ControllerClasses;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shanu
 */
public class DatabaseHandler {
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pstmt;
    public static String URL = "jdbc:mysql://localhost:3306/hallmanager";
    
    public DatabaseHandler(){
        
    }
    
    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,"root","");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection failed!", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Connection Established...");
        return con;
        
    }
    
    public Statement getStatement(){
        
        try {
            stmt = getConnection().createStatement();
            System.out.println("Statement returned..");
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        return stmt;
        
    }
    
    public PreparedStatement getPreparedStatement(String query){
        try {
            pstmt = getConnection().prepareStatement(query);
            System.out.println("PreparedStatement returned..");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return pstmt;
    }
    
    public ResultSet getResult(String query){
        try {
            rs = getStatement().executeQuery(query);
            System.out.println("ResultSet returned..");
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    public void closeConnection(){
        try {
            con.close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
