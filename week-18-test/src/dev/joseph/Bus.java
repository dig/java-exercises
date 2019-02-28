package dev.joseph;

public class Bus {
    
    private String company;
    private String id;
    private int passengers;
    private double currentDieselLevel;
    private double fuelTankSize;
    private int seats;

    //STEP 1
    public Bus(String companyName, String busId, int passengerCount) {
        this.company = companyName;
        this.id = busId;
        this.passengers = passengerCount;
    }

    public Bus(String companyName, String busId, int passengerCount, int availableSeats) {
        this.company = companyName;
        this.id = busId;
        this.passengers = passengerCount;
        this.seats = availableSeats;
    }

    //STEP 2
    public void setCurrentDieselLevel(double dieselFromPump) {
        this.currentDieselLevel = dieselFromPump;
    }
    
    //STEP 3
    public void getOffBus(int passengersLeavingBus) {
        this.passengers -= passengersLeavingBus;
    }

    public String getCompanyName() { 
        return company; 
    }
    
    public String getId() { 
        return id; 
    }    
    
    public int getPassengers() { 
        return passengers; 
    }
    
    public double getCurrentDieselLevel() { 
        return currentDieselLevel; 
    }

    public void setFuelTankSize(double max){
        this.fuelTankSize = max;
    }
    
    
    public double getFuelTankSize(){
        return this.fuelTankSize;
    }    
    
    //STEP 4
    public void refuelBus() {
       if ((this.currentDieselLevel + 10) < this.fuelTankSize) {
           this.currentDieselLevel += 10;
       }
    }

    public void lastMinutePassengerPickup(int newPassengers) {
        if (this.currentDieselLevel > 10) {
            if ((newPassengers + this.passengers) <= this.seats) {
                this.passengers += newPassengers;
            } else if ((newPassengers + this.passengers) > this.seats) {
                this.passengers = this.seats;
            }
        }
    }
 
}
