/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artstore.Business;

/**
 *
 * @author Dynee
 */
public class Artist {
    
    private int id;
    private String name;
    private String email;
    private String password;
    
    public Artist(int id, String name, String email, String password) {
        
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
}
