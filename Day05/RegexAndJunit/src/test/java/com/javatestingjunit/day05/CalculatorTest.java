package com.javatestingjunit.day05;
import com.javajunit.day05.UseCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Create a class Calculator to perform junit testing
public class CalculatorTest {
    //Create an Object of Calculator class
    UseCalculator calculator=new UseCalculator();


    //Create a class testAdd() to test a add method
    public void testAdd() {
        int result=calculator.add(2,3);
        int expectedResult=5;

        //Call  the method to compare the actual and expected result
        assertEquals(expectedResult,result);
    }

    //Create a class testSubtract() to test a subtract method
    @Test
    public void testSubtract() {
        int result=calculator.subtract(2,1);
        int expectedResult=1;

        //Call  the method to compare the actual and expected result
        assertEquals(expectedResult,result);
    }

    //Create a class testMultiply() to test a multiple method
    @Test
    public void testMultiply() {
        int result=calculator.multiply(2,3);
        int expectedResult=6;

        //Call  the method to compare the actual and expected result
        assertEquals(expectedResult,result);
    }

    //Create a class testDivide() to test a divide method
    @Test
    public void testDivide() {
        int result=calculator.divide(10,2);
        int expectedResult=5;

        //Call  the method to compare the actual and expected result
        assertEquals(expectedResult,result);
    }

    //Create a class testDivideByZero() to handle a exception and test the method
    @Test
    public void testDivideByZero() {
        try {
            int throwable = calculator.divide(10, 0);
        }catch (IllegalArgumentException ex){

            //Call  the method to compare the actual and expected result
            assertEquals("Division by zero is not allowed.",ex.getMessage());
        }
    }
}
