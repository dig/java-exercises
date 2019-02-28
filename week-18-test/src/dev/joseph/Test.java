package dev.joseph;

public class Test {
  
    //*** DO NOT INSERT OR CHANGE CODE INTO THIS CLASS TO OBTAIN ***//
    //*** CORRECT OUTPUT                                         ***//    

    public static void main(String[] args) {
        
        System.out.println("*****STEP 1 & 2 ************");
        Bus myBus = new Bus("DeBus", "DB456", 34);
        myBus.setCurrentDieselLevel(11);
        display(myBus);
        
        System.out.println("\n");        
        System.out.println("*****STEP 3 ************");
        System.out.println("*2 PASSENGERS DISEMBARKING*");
        myBus.getOffBus(2);
        
        display(myBus);
        
       System.out.println("\n");        
        System.out.println("*****STEP 4 ************");
        System.out.println("*REFUELLING, FUEL CAPACITY: 50*");
        myBus.setFuelTankSize(50);
        myBus.refuelBus();
        
        display(myBus);
        
        System.out.println("\n");        
        System.out.println("*****STEP 5 ************");
        
        /********************STEP 5**************************/
        
        System.out.println("AVAILABLE SEATS: 100****");       
        Bus myBus2 = new Bus("DeBus2", "DB2-HL666", 14, 100);
        myBus2.setCurrentDieselLevel(50);
        display(myBus2);
        
        System.out.println("***********************");
        System.out.println("*LAST MINUTE PASSENGER PICK UP: 5*");        
        myBus2.lastMinutePassengerPickup(5);      
        display(myBus2);


    }
    
     public static void display(Bus myBus){

        System.out.println("***********************");
        System.out.println("COMPANY: " + myBus.getCompanyName());        
        System.out.println("BUS ID: " + myBus.getId());
        System.out.println("Passengers: " + myBus.getPassengers());
        System.out.println("Current Diesel: " + myBus.getCurrentDieselLevel());
        System.out.println("***********************");
    }    
}
