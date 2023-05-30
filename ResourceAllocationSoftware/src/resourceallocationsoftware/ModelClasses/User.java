/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;

/**
 *
 * @author shanu
 */
public abstract class User{
    
    protected String nic;
    protected String name;
    protected Login login;
    protected int userId;
    

    public String getNic(){
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public int getUserId(){
        return userId;
    }

    public User(String nic, String name, Login login) {
        this.nic = nic;
        this.name = name;
        this.login = login;
    }
    
    public abstract void createLogin();

    
    
    
    
}
