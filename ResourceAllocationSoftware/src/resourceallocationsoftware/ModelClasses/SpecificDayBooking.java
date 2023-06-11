/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;

import java.time.DayOfWeek;
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

public class SpecificDayBooking extends Booking{
    protected LocalDate startingDate;
    protected LocalDate endDate;
//    protected DayOfWeek dayOfWeek;
    
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
    
    public SpecificDayBooking() {
        super();
        
    }

    public List<LocalDate> getRecurringDateList(){
        DayOfWeek day = startingDate.getDayOfWeek();
        List<LocalDate> dateList = new ArrayList();
        for (LocalDate d = startingDate; !d.isAfter(endDate); d = d.plusDays(1)) {
            if(d.getDayOfWeek().equals(day)){
                dateList.add(d);
            }
        }
        System.out.println("Recurring dates fetched..");
        return dateList;
    }
}
