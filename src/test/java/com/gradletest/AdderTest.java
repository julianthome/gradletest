package com.gradletest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {

    private final Adder adder = new Adder();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, adder.add(2, 3), "Adding positive numbers should work correctly");
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, adder.add(-2, -3), "Adding negative numbers should work correctly");
    }

    @Test
    public void testAddMixedSignNumbers() {
        assertEquals(-1, adder.add(2, -3), "Adding a positive and negative number should work correctly");
        assertEquals(1, adder.add(-2, 3), "Adding a negative and positive number should work correctly");
    }

    @Test
    public void testAddZero() {
        assertEquals(5, adder.add(5, 0), "Adding zero to a number should return the same number");
        assertEquals(5, adder.add(0, 5), "Adding a number to zero should return the number");
    }

    @Test
    public void testAddLargeNumbers() {
        assertEquals(2000000000, adder.add(1000000000, 1000000000), "Adding large numbers should work correctly");
    }
}