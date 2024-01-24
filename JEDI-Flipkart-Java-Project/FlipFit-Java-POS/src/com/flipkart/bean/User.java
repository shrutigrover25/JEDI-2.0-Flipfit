/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class User {

	  
    int id;
    String name;
    String email;
    String phone;
    int userType;
    
    // Constructor
    
    public User(){
        System.out.println("user created");
    }
    
    // Getters and Setters
    
    String getName(){
        return name;
    }
    
    void setName(String newName){
        name = newName;
    }
    
    String getEmail(){
        return email;
    }
    
    void setEmail(String newEmail){
        email = newEmail;
    }
    
    String getPhone(){
        return phone;
    }
    
    void setPhone(String newPhone){
        name = newPhone;
    }
    
    int getUserType(){
        return userType;
    }
    
    void setUserType(int type){
        userType = type;
    }
    
    // Methods
    
    
    void login(){
        System.out.println("User logged in !");
    }
    
    void changePassword(String newPassword){
        System.out.println("Password changed !");
    }

}
