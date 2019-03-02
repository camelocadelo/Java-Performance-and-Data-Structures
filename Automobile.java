/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto_package;

/**
 *
 * @author технодом
 */
public class Automobile {

    private boolean engineRunning;
    private double speed;
    private String licensePlate;
    
    public Automobile(String lP) {
        
        engineRunning = false;
        speed = 0.0;
        licensePlate = lP;
    }
    //method to start a car
    public void startCar() {
        
        engineRunning = true;
    }
    /**
     * 
     * @throws Exception 
     */
    public void pressGasPedal() throws Exception {
        
        if (engineRunning) {
        speed = speed + 10;
        } else {
                throw new Exception ("Start a car first.");
                }
    }
    
    public void pressBrake() {
    
        speed = 0;
    }
    
    public void shutdown() {
    
        engineRunning = false;
    }
    
    public boolean isEngineRunning() {
    
        return engineRunning;
    }
    
    public double getSpeed() {
    
        return speed;
    }
    
    public String getModel() {
    
        return licensePlate;
    }
    
    public double calculateDistance(double time) {
    
        return time * speed;
    }
    
    public String toString() {
    
        return "Engine Running: " + engineRunning + ". Speed: " + speed
                + ". Model: " + licensePlate;
    }
}
