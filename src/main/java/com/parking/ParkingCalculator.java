package com.parking;

public class ParkingCalculator {
    
    public double calculateFee(int hoursParked, String vehicleType) {
        if (hoursParked <= 0) return 0.0;
        
        double baseRate = 0.0;
        double hourlyRate = 0.0;
        
        if (vehicleType.equalsIgnoreCase("Car")) {
            baseRate = 5.0;
            hourlyRate = 2.0;
        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            baseRate = 3.0;
            hourlyRate = 1.0;
        } else if (vehicleType.equalsIgnoreCase("Bus")) {
            baseRate = 10.0;
            hourlyRate = 5.0;
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
        
        if (hoursParked <= 1) return baseRate;
        return baseRate + ((hoursParked - 1) * hourlyRate);
    }
}