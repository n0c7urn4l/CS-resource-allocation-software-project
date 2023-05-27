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

public class OneTimeBooking extends Booking{
    protected LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public OneTimeBooking(String bookingId, Hall hall, Payment payment, Customer customer) {
        super(bookingId, hall, payment, customer);
    }

    
}
