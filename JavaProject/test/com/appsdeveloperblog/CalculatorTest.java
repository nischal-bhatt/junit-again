package com.appsdeveloperblog;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    //this has to be static
    static void beforeAll()
    {
        System.out.println("hi");
    }

    @BeforeEach
    public void beforeEach()
    {
        System.out.println("hey");
    }

    @DisplayName("this is a display name !!!!!")
    @Test
    void testIntegerDivision_whenFourIsDividedByTwo_ShouldReturnTwo() throws Exception {
        //arrange
        Calculator calculator
                = new Calculator();

        //act
        double res = calculator.division(4 ,2);

        //assert
        assertEquals(2,res);
    }

    @Test
    void integerDivision_whenDecimalValuesPassed_returnProperResult() throws Exception {
        Calculator calculator = new Calculator();

        double res = calculator.division(5.0,0.2);

        assertEquals(25,res);
    }

    @Test
    void division_when0passedasdivisor_throwsException()
    {
        Calculator calculator = new Calculator();



        assertThrows(Exception.class ,() -> calculator.division(5.0,0));
    }

    @Test
    void division_when0passedasdivident_thenReturn0() throws Exception {
        Calculator calculator = new Calculator();

        double x = calculator.division(0,2);

        assertEquals(0,x);
    }

    @Test
    void subtraction()
    {
        Calculator calculator
                = new Calculator();

        int s = calculator.integerSubtraction(5,2);
        assertEquals(3,s);
    }

    @Test
    void lazy()
    {
        Calculator calculator
                = new Calculator();

        int s = calculator.integerSubtraction(7,9);

        assertEquals(-2,s,() -> "only if it failse");
    }

}