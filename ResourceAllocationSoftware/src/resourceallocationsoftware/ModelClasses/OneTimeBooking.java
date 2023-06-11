/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author shanu
 */

public class OneTimeBooking extends Booking{
    protected LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        this.date = zdt.toLocalDate();
    }
    
    public OneTimeBooking() {
        super();
        
    }
    
    public List<LocalDate> getOneTimeDate(BooleanGrabber bg){
        List<LocalDate> dateList = new ArrayList();
        dateList.add(date);
        System.out.println("One time dates fetched");
        return dateList;
    }

    
}
