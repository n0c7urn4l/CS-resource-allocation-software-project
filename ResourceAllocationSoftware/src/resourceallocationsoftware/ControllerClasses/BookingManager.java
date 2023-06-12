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


/**
 *
 * @author shanu
 */
public class BookingManager {
    public List<Date> dList =  new ArrayList();
    private List<LocalDate> localDateList = new ArrayList();
    public List<Date> unavailableDateList = new ArrayList();
    public int customerId;
    public int hallNo;
    public double hallPricing;
    private int paymentId;
    public BooleanGrabber bg;

    public BookingManager(){}

    public List<LocalDate> getLocalDateList() {
        return localDateList;
    }

    public void setLocalDateList(List<LocalDate> localDateList) {
        this.localDateList = localDateList;
    }
    
    private void localDateToDate(){
        for(LocalDate d : localDateList){
            Date date = Date.valueOf(d);
            dList.add(date);
        }
        System.out.println("localdates added to dList");
    }
    
    public boolean dateVerifier(){
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
                    unavailableDateList.add(d2);
                }
            }
        }
        
        if(flag){
            return flag;
        }else{
            addBooking();
            JOptionPane.showMessageDialog(null, "Booking added..", "Booking Status",JOptionPane.INFORMATION_MESSAGE);
            
        }
        return flag;
    }
    
    public void addBooking(){
//        localDateToDate();
        int dateCount = dList.size();
        double totalCost = dateCount*hallPricing;
        Date currentDate = Date.valueOf(LocalDate.now());
        String payInfo = "Pay "+totalCost+" to the reception";
        JOptionPane.showMessageDialog(null, payInfo, "Booking Status",JOptionPane.INFORMATION_MESSAGE);

        if(true){
            try{
                DatabaseHandler dbHandler = new DatabaseHandler();
                PreparedStatement pstmt = dbHandler.getPreparedStatement("insert into payment(initialPayment,initialPaymentDate,initialPaymentStatus) values(?,?,?)");
                pstmt.setDouble(1, totalCost);
                pstmt.setDate(2,currentDate);
                pstmt.setBoolean(3, true);
                pstmt.execute();
                pstmt = dbHandler.getPreparedStatement("select paymentId from payment order by paymentId desc limit 0,1");
                ResultSet rs = pstmt.executeQuery();
                if(rs.next()){
                    paymentId = rs.getInt("paymentId");
                }
                for(Date d:dList){
                    pstmt = dbHandler.getPreparedStatement("insert into booking(customerId,date,hallNumber,paymentId) values(?,?,?,?)");
                    pstmt.setInt(1, customerId);
                    pstmt.setDate(2, d);
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