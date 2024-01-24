package com.flipkart.bean;

public class GymOwner extends User {
	
	private Gym[] gyms; 
	 
    // Constructor
    public GymOwner(Gym[] gyms) {
        this.gyms = gyms;
    }
    
    // Method to add a gym
    public void addGym(Gym gym) {
        System.out.println("Adding a new gym to the list.");
        // Implementation to add gym to gyms array
    }
    
    // Method to edit a gym
    public void editGym(Gym gym) {
        System.out.println("Editing an existing gym's details.");
        // Implementation to edit gym details
    }
    
    // Method to delete a gym
    public void deleteGym(Gym gym) {
        System.out.println("Deleting a gym from the list.");
        // Implementation to remove gym from gyms array
    }
    
    // Method to add seats to a gym
    public void addSeats(Gym gym) {
        System.out.println("Adding seats to a gym.");
        // Implementation to add seats to the gym
    }
    
    // Method to update the number of seats in a gym
    public void updateSeats(Gym gym) {
        System.out.println("Updating the number of seats in a gym.");
        // Implementation to update gym's seats
    }
 
    // Getters and Setters
    public Gym[] getGyms() {
        return gyms;
    }
 
    public void setGyms(Gym[] gyms) {
        this.gyms = gyms;
    }

}
