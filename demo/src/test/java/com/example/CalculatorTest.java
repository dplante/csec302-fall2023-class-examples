package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Practice writing test cases for Calculator add() function.
 */
public class CalculatorTest 
{
    /**
     * Test that 1 + 1 = 2 
     */
    @Test
    public void testAddTwoInts()
    {
        Calculator calculator = new Calculator();
        assertTrue( "1 + 1 should equal 2", 2 == calculator.add(1, 1));
    }

    @Test
    public void testAddTwoDoubles()
    {
        Calculator calculator = new Calculator();
        assertEquals( "9.9 + 1.2 should equal 11.1", 11.1, calculator.add(9.9, 1.2), 0.0000000001);
    }

    @Test 
    public void testMulitplySmall() 
    {
        Calculator calculator = new Calculator();
        assertEquals( "2 * 2 = 4", 4, calculator.multiply(2, 2), 0.0000000001);

    }

}
