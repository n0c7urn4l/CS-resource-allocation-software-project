/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ControllerClasses;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import resourceallocationsoftware.ModelClasses.BooleanGrabber;
import resourceallocationsoftware.ViewClasses.CustomerDetailsUI;
import resourceallocationsoftware.ViewClasses.UnavailableDateUI;


/**
 *
 * @author shanu
 */
public class BookingManager {
    private List<Date> dList =  new ArrayList();
    private List<LocalDate> localDateList = new ArrayList();
    private List<Date> unavailableDateList = new ArrayList();
    private int customerId;
    private int hallNo;
    private double hallPricing;
    private int paymentId;
    public BooleanGrabber bg;
    public BookingManager(){
        this.bg = new BooleanGrabber();
    }
    
    private void localDateToDate(){
        for(LocalDate d : localDateList){
            Date date = Date.valueOf(d);
            dList.add(date);
        }
        System.out.println("localdates added to dList");
    }
    
    public void dateVerifier(){
        localDateToDate();
        List<Date> dArr = new ArrayList();
        List<Date> unDate = new ArrayList();
        boolean flag = false;
        try{
            DatabaseHandler dbHandler = new DatabaseHandler();
            PreparedStatement pstmt = dbHandler.getPreparedStatement("select date from booking where hallNumber=?");
            pstmt.setInt(1, hallNo);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                dArr.add(rs.getDate("date"));
            }
            dbHandler.closeConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        //check whether the selected dates are booked
        for(Date d1 : dArr){
            for(Date d2 : dList){
                if(d1.equals(d2)){
                    flag = true;
                    unDate.add(d2);
                }
            }
        }
        
        if(flag){
            BooleanGrabber bg = new BooleanGrabber();
            new UnavailableDateUI(unDate).showUnavailableDatesUI(bg);;
            boolean flag2 = bg.isFlag1();
            
            if(flag2){
                for(Date d2:unDate){
                    dList.remove(d2);
                }
                addBooking();
            }else{
                JOptionPane.showMessageDialog(null, "Booking Cancelled..", "Booking Status",JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            addBooking();
        }
        
    }
    
    public void addBooking(){
//        localDateToDate();
        int dateCount = dList.size();
        
//        new CustomerDetailsUI(hallNo, dateCount, hallPricing*dateCount,dList.get(0)).showPeriodicUI(bg);
        
        if(bg.isFlag1()){
            try{
                DatabaseHandler dbHandler = new DatabaseHandler();
                PreparedStatement pstmt = dbHandler.getPreparedStatement("select paymentId from payment order by paymentId desc limit 0,1");
                ResultSet rs = pstmt.executeQuery();
                if(rs.next()){
                    paymentId = rs.getInt("paymentId");
                }
                for(Date d:dList){
                    pstmt = dbHandler.getPreparedStatement("insert into booking(customerId,date,hallNumber,paymentId) values('?','?','?','?')");
                    pstmt.setInt(1, customerId);
                    pstmt.setDate(hallNo, d);
                    pstmt.setInt(3, hallNo);
                    pstmt.setInt(4, paymentId);
                    pstmt.execute();
                }
                dbHandler.closeConnection();
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Booking succesfull..");
        }else{
            JOptionPane.showMessageDialog(null, "Booking Cancelled..", "Booking Status",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
}