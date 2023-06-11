/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;
import java.time.LocalDate;
import java.sql.Date;
/**
 *
 * @author shanu
 */
public class Payment {
    
    private String paymentId;
    private double initialPayment;
    private Date initialPaymentDate;
    private boolean initialPaymentStatus;
    private double finalPayment;
    private Date finalPaymentDate;
    private boolean finalPaymentStatus;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getInitialPayment() {
        return initialPayment;
    }

    public void setInitialPayment(double initialPayment) {
        this.initialPayment = initialPayment;
    }

    public Date getInitialPaymentDate() {
        return initialPaymentDate;
    }

    public void setInitialPaymentDate(Date initialPaymentDate) {
        this.initialPaymentDate = initialPaymentDate;
    }

    public boolean isInitialPaymentStatus() {
        return initialPaymentStatus;
    }

    public void setInitialPaymentStatus(boolean initialPaymentStatus) {
        this.initialPaymentStatus = initialPaymentStatus;
    }

    public double getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(double finalPayment) {
        this.finalPayment = finalPayment;
    }

    public Date getFinalPaymentDate() {
        return finalPaymentDate;
    }

    public void setFinalPaymentDate(Date finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
    }

    public boolean isFinalPaymentStatus() {
        return finalPaymentStatus;
    }

    public void setFinalPaymentStatus(boolean finalPaymentStatus) {
        this.finalPaymentStatus = finalPaymentStatus;
    }

    public Payment(double initialPayment, Date initialPaymentDate, boolean initialPaymentStatus) {
        
        this.initialPayment = initialPayment;
        this.initialPaymentDate = initialPaymentDate;
        this.initialPaymentStatus = initialPaymentStatus;
    }
    
    public static void calcPayment(){
        
    }
    
    
}
