package com.parking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingCalculatorTest {

    ParkingCalculator calculator = new ParkingCalculator();

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
}