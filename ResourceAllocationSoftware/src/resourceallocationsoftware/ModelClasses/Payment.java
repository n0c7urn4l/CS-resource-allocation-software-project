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
public class Payment {
    
    private String paymentId;
    private double initialPayment;
    private LocalDate initialPaymentDate;
    private boolean initialPaymentStatus;
    private double finalPayment;
    private LocalDate finalPaymentDate;
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

    public LocalDate getInitialPaymentDate() {
        return initialPaymentDate;
    }

    public void setInitialPaymentDate(LocalDate initialPaymentDate) {
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

    public LocalDate getFinalPaymentDate() {
        return finalPaymentDate;
    }

    public void setFinalPaymentDate(LocalDate finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
    }

    public boolean isFinalPaymentStatus() {
        return finalPaymentStatus;
    }

    public void setFinalPaymentStatus(boolean finalPaymentStatus) {
        this.finalPaymentStatus = finalPaymentStatus;
    }

    public Payment(String paymentId, double initialPayment, LocalDate initialPaymentDate, boolean initialPaymentStatus) {
        this.paymentId = paymentId;
        this.initialPayment = initialPayment;
        this.initialPaymentDate = initialPaymentDate;
        this.initialPaymentStatus = initialPaymentStatus;
    }
    
    public static void calcPayment(){
        
    }
    
    
}
