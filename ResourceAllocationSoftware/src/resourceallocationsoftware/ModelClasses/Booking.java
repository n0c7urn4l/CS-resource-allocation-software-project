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
public abstract class Booking {
    
    protected String bookingId;
    protected Hall hall;
    protected Payment payment;
    protected Customer customer;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Booking(String bookingId, Hall hall, Payment payment, Customer customer) {
        this.bookingId = bookingId;
        this.hall = hall;
        this.payment = payment;
        this.customer = customer;
    }
    
    public Booking(){
        this("",null,null,null);
    }
    
    public static void checkHallAvailability(LocalDate date){
        
    }
    
}
