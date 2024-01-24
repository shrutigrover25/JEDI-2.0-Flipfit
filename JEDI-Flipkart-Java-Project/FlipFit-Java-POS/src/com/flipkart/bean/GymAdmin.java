/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class GymAdmin extends User {

	   int slots;
	    
	    
	    // Constructor
	    
	    public GymAdmin(){
	        System.out.println("Gym Admin created !");
	    }
	    
	    // Methods
	    
	    void approveRequest(GymOwner gymOwner){
	        System.out.println("Gym Owner list approved!");
	    }
	    
	    void addSlot(int slot){
	        System.out.println("Adds new slots !");
	    }

}
