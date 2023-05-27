/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;

import java.time.LocalDate;

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

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    public PeriodicBooking(String bookingId, Hall hall, Payment payment, Customer customer) {
        super(bookingId, hall, payment, customer);
    }

    public static void calcDate(){
        
    }
    
}
