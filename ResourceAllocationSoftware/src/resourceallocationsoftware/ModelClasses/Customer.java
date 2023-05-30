/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;

/**
 *
 * @author shanu
 */
public class Customer extends User{
    
    protected String telephone;
    
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public Customer(String nic, String name, Login login, String telephone) {
        super(nic, name, login);
        this.telephone = telephone;
    }


    @Override
    public void createLogin() {
        
    }
    
    
    
}
