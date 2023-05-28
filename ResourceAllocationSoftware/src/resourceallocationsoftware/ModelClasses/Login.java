/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resourceallocationsoftware.ModelClasses;

/**
 *
 * @author shanu
 */

//finish autehnticate method
public class Login {
    
    private int authorityLevel;
    private String userName;
    private String password;

    public int getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login(int authorityLevel, String userName, String password) {
        this.authorityLevel = authorityLevel;
        this.userName = userName;
        this.password = password;
    }
    
    private boolean authenticate(){
        
        return true;
        
    }
    
}
