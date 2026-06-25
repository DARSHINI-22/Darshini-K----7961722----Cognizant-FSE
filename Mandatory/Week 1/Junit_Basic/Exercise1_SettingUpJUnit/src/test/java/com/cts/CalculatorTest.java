package com.cts;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    // Setup Method
    @Before
    public void setUp() {
        System.out.println("Setup Method Executed");
        calculator = new Calculator();
    }

    // AAA Pattern
    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Teardown Method
    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
        calculator = null;
    }
}