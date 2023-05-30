/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ControllerClasses;

import resourceallocationsoftware.ModelClasses.Admin;
import resourceallocationsoftware.ModelClasses.Customer;
import resourceallocationsoftware.ModelClasses.Login;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import resourceallocationsoftware.ViewClasses.AdminUI;
import resourceallocationsoftware.ViewClasses.CustomerMenuUI;
import resourceallocationsoftware.ViewClasses.LoginUI;
/**
 *
 * @author shanu
 */
public class LoginManager {
    
    private int authorityLevel;
    private int dbAuthorityLevel;
    private String userName;
    private String dbUserName;
    private String password;
    private String dbPassword;
    

    public int getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getDbAuthorityLevel() {
        return dbAuthorityLevel;
    }

    public void setDbAuthorityLevel(int dbAuthorityLevel) {
        this.dbAuthorityLevel = dbAuthorityLevel;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
    
    public LoginManager(String userName,String password,int authorityLevel){
        this.userName = userName;
        this.password = password;
        this.authorityLevel = authorityLevel;
    }
    
    public boolean verify(){
        boolean flag = false;
        ResultSet rs;
        DatabaseHandler dbHandler = null;
        boolean userVerify = false;
        try{
            dbHandler = new DatabaseHandler();
//            rs = dbHandler.getResult("SELECT userName,password,authorityLevel FROM login WHERE userName= '"+userName+"';");
            PreparedStatement pstmt = dbHandler.getPreparedStatement("select userName,password,authorityLevel FROM login WHERE userName= ?;");
            pstmt.setString(1, userName);
            rs = pstmt.executeQuery();
            System.out.println("ResultSet returned..");
            if(rs.next()){
                dbAuthorityLevel = rs.getInt("authorityLevel");
                setDbPassword(rs.getString("password"));
                dbUserName = rs.getString("userName");
                userVerify = true;
            }
            dbHandler.closeConnection();
            System.out.println(dbAuthorityLevel+"---"+authorityLevel);
            System.out.println(dbUserName+"---"+userName);
            System.out.println(dbPassword+"---"+password);
            if(!dbHandler.equals(null)){
                if(!dbUserName.equals(null) && (dbAuthorityLevel == authorityLevel)){
                    flag = true;
                
                    System.out.println(getDbPassword());
                
                }else if(!(dbAuthorityLevel == authorityLevel)){
                    JOptionPane.showMessageDialog(null, "Authority Level mismatch!", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
        }catch(Exception e){
//            e.printStackTrace();
            
            JOptionPane.showMessageDialog(null, "User name doesn't exist!", "Login Error", JOptionPane.ERROR_MESSAGE);
     
            
        }
        return flag;
    }
    
    private Admin createAdminObj(){
        ResultSet rs;
        int userId = 0;
        String userNic = null;
        String name = null;
        Admin admin = null;
        
        try {
            DatabaseHandler dbHandler = new DatabaseHandler();
            PreparedStatement pstmt = dbHandler.getPreparedStatement("select userId FROM login WHERE userName= ?;");
            pstmt.setString(1, userName);
            rs = pstmt.executeQuery();
            if(rs.next()){
                userId = rs.getInt("userId");
            }
            pstmt = dbHandler.getPreparedStatement("select userNic,name FROM user WHERE userId= ?;");
            pstmt.setInt(1, userId);
            rs = pstmt.executeQuery();
            if(rs.next()){
                userNic = rs.getString("userNic");
                name = rs.getString("name");
            }
            System.out.println(userNic+"---"+name);
            dbHandler.closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Login l = new Login(authorityLevel, dbUserName, dbPassword);
        admin = new Admin(userNic, name, l);
        admin.setUserId(userId);
        return admin;
    }
    
    private Customer createCustomerObj(){
        String nic = null;
        String name = null;
        Login login;
        String telephone = null;
        
        ResultSet rs;
        int userId = 0;
        
        try{
            DatabaseHandler dbHandler = new DatabaseHandler();
            PreparedStatement pstmt = dbHandler.getPreparedStatement("select userId from login where userName = ?");
            pstmt.setString(1, userName);
            rs = pstmt.executeQuery();
            if(rs.next()){
                userId = rs.getInt("userId");
            }
            pstmt = dbHandler.getPreparedStatement("select userNic,name from user where userId = ?");
            pstmt.setInt(1, userId);
            rs = pstmt.executeQuery();
            if(rs.next()){
                nic = rs.getString("userNic");
                name = rs.getString("name");
            }
            System.out.println(userId);
            pstmt = dbHandler.getPreparedStatement("select telephoneNumber from customer where userId = ?");
            pstmt.setInt(1, userId);
            rs = pstmt.executeQuery();
            if(rs.next()){
                telephone = rs.getString("telephoneNumber");
            }
            System.out.println(nic+"--"+name+"--"+telephone);
            dbHandler.closeConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        Login l = new Login(authorityLevel, userName, password);
        Customer customer = new Customer(nic, name, l, telephone);
        customer.setUserId(userId);
        
        return customer;
    }
    
    public boolean authenticate(){
        boolean flag = false;
        if(verify()){
            if(dbPassword.equals(password)){
                flag = true;
                
                if(dbAuthorityLevel == 1){
                    System.out.println("Login success");
                    new AdminUI().getAdminUI(createAdminObj());
                    
                }else if(authorityLevel == 2){
                    System.out.println("Login success");
                    new CustomerMenuUI().getCustomerMenuUI(createCustomerObj());
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Password!", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        return flag;
    }
    
    
}
