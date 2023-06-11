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
import resourceallocationsoftware.ControllerClasses.BookingManager;
import resourceallocationsoftware.ModelClasses.Login;
import resourceallocationsoftware.ViewClasses.*;


/**
 *
 * @author shanu
 */
public class ResourceAllocationSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new LoginUI().getLoginUI();
//        new BookingManager().addBooking();
        
    }
    
}
