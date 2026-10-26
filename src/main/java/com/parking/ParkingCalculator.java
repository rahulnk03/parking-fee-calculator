package com.parking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingCalculatorTest {

    ParkingCalculator calculator = new ParkingCalculator();

    @Test
    public void testCarFirstHour() {
        // A car parked for 1 hour should cost the base rate of 5.0
        assertEquals(5.0, calculator.calculateFee(1, "Car"));
    }

    @Test
    public void testMotorcycleThreeHours() {
        // Motorcycle base (3.0) + 2 extra hours (2 * 1.0) = 5.0
        assertEquals(5.0, calculator.calculateFee(3, "Motorcycle"));
    }

    @Test
    public void testBusFiveHours() {
        // Bus base (10.0) + 4 extra hours (4 * 5.0) = 30.0
        assertEquals(30.0, calculator.calculateFee(5, "Bus"));
    }
}