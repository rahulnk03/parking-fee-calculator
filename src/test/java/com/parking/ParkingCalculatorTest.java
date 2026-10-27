package com.parking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingCalculatorTest {

    ParkingCalculator calculator = new ParkingCalculator();

    // --- Original Tests (Short durations) ---
    
    @Test
    public void testCarFirstHour() {
        assertEquals(5.0, calculator.calculateFee(1, "Car"));
    }

    @Test
    public void testMotorcycleThreeHours() {
        assertEquals(5.0, calculator.calculateFee(3, "Motorcycle"));
    }

    @Test
    public void testBusFiveHours() {
        assertEquals(30.0, calculator.calculateFee(5, "Bus"));
    }
    
    // --- New Tests (Daily Cap logic) ---
    
    @Test
    public void testCarDailyCap() {
        // 24 hours would normally be $5 + (23 * $2) = $51, but cap is $25
        assertEquals(25.0, calculator.calculateFee(24, "Car"));
    }

    @Test
    public void testMotorcycleDailyCap() {
        // 24 hours would normally be $3 + (23 * $1) = $26, but cap is $15
        assertEquals(15.0, calculator.calculateFee(24, "Motorcycle"));
    }

    @Test
    public void testBusDailyCap() {
        // 24 hours would normally be $10 + (23 * $5) = $125, but cap is $50
        assertEquals(50.0, calculator.calculateFee(24, "Bus"));
    }
}