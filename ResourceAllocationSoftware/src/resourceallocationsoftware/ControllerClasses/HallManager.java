/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ControllerClasses;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author shanu
 */
public class HallManager {
    
//    private int hallNo;
//    private int capacity;
//    private double pricing;
    
    public HallManager(){
        
    }
    
    public void addHall(int hallNo,int capacity,double pricing){
        
        try{
            
            DatabaseHandler dbHandler = new DatabaseHandler();
            PreparedStatement pstmt = dbHandler.getPreparedStatement("insert into hall(hallNumber,capacity,pricing) values(?,?,?)");
            pstmt.setInt(1, hallNo);
            pstmt.setInt(2,capacity);
            pstmt.setDouble(3, pricing);
            int flag = pstmt.executeUpdate();
            System.out.println(flag);
            if(flag == 1){
                JOptionPane.showMessageDialog(null, "Hall Data Added", "Status",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error Occured,Try Again", "Status",JOptionPane.WARNING_MESSAGE);
            
            
            }
            dbHandler.closeConnection();
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void updateHall(int hallNo,int capacity,double pricing){
        try{
            
            DatabaseHandler dbHandler = new DatabaseHandler();
            PreparedStatement pstmt = dbHandler.getPreparedStatement("update hall set capacity = ?, pricing = ? where hallNumber = ?");
            pstmt.setInt(1,capacity);
            pstmt.setDouble(2, pricing);
            pstmt.setInt(3, hallNo);
            int flag = pstmt.executeUpdate();
            System.out.println(flag);
            if(flag == 1){
                JOptionPane.showMessageDialog(null, "Hall Data Updated", "Status",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error Occured,Try Again", "Status",JOptionPane.WARNING_MESSAGE);
            
            
            }
            dbHandler.closeConnection();
//            System.out.println("Hall data updated..");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void deleteHall(int hallNo){
        try{
            
            DatabaseHandler dbHandler = new DatabaseHandler();
            PreparedStatement pstmt = dbHandler.getPreparedStatement("delete from hall where hallNumber = ?");
            pstmt.setInt(1, hallNo);
            int flag = pstmt.executeUpdate();
            System.out.println(flag);
            if(flag == 1){
                JOptionPane.showMessageDialog(null, "Hall Data Deleted", "Status",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error Occured,Try Again", "Status",JOptionPane.WARNING_MESSAGE);
            
            
            }
            dbHandler.closeConnection();
//            System.out.println("Hall data deleted..");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
    
}
