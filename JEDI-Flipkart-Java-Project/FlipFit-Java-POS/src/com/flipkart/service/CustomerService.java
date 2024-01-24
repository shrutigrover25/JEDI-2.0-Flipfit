/**
 * 
 */
package com.flipkart.service;

/**
 * 
 */
public class CustomerService {

	public void createBooking() {
		 
		 System.out.println("Booking is done-->");
		 
	 }
	  
	 public boolean cancelBooking(int userId) {
		 
	    System.out.println("Booking is cancelled with ID-->" +userId);
		 
		 return true; 
	 }
	 
	 public boolean updateBooking(int userId) {
		 
		 System.out.println("Booking is updated with ID-->" +userId); 
		 return true;
	 }
	
	 public boolean ManageUserProfile(int userId) {
		 
	
		 System.out.println("User profile is Managed");
		 return true;
	 }
	
	 public boolean ManagerOwnerProfile(int ownerId)
	 {
		 System.out.println("owner profile is Managed");
		 return true;
		 
	 }
	 
	 public boolean AddGym(int GymId)
	 {
		 System.out.println("Gym is addded successfully");
		 return true;
	 }
	
	 public boolean RemoveGym(int GymId)
	 {
		 System.out.println("Gym is Removed");
		 return true;
	 }
	 
	 public boolean RequestApproved(int GymId)
	 {
		 System.out.println("Request is approved for the Gym");
		 return true;
	 }
	 
	 
}
