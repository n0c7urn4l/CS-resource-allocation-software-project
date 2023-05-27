/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resourceallocationsoftware;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import resourceallocationsoftware.ControllerClasses.DatabaseHandler;
import java.sql.*;


/**
 *
 * @author shanu
 */
public class ResourceAllocationSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            ResultSet rs = new DatabaseHandler().getStatement().executeQuery("SELECT * FROM hall;");
            while(rs.next()){
                System.out.print(rs.getInt("hallNumber")+" ");
                System.out.print(rs.getInt("capacity")+" ");
                System.out.println(rs.getFloat("pricing"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
       
        
    }
    
}
