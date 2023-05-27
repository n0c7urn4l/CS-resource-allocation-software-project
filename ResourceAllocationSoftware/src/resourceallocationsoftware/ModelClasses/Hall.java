/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;

/**
 *
 * @author shanu
 */
public class Hall {
    
    private int hallNumber;
    private int capacity;
    private double pricing;

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPricing() {
        return pricing;
    }

    public void setPricing(double pricing) {
        this.pricing = pricing;
    }

    public Hall(int hallNumber, int capacity, double pricing) {
        this.hallNumber = hallNumber;
        this.capacity = capacity;
        this.pricing = pricing;
    }
    
    
    
}
