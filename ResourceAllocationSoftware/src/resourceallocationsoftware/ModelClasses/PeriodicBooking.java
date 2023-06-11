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
public class PeriodicBooking extends Booking{
    
    protected LocalDate startingDate;
    protected LocalDate endDate;

    
    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        Instant instant = startingDate.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        this.startingDate = zdt.toLocalDate();
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        Instant instant = endDate.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        this.endDate = zdt.toLocalDate();
    }
    
    public PeriodicBooking() {
        super();
        
    }
    
    public List<LocalDate> getPeriodDateList(){
        List<LocalDate> dateList = new ArrayList();
        for (LocalDate d = startingDate; !d.isAfter(endDate); d = d.plusDays(1)) {
            dateList.add(d);
        }
        System.out.println("Period dates fetched..");
        return dateList;
    }

    
    
}
