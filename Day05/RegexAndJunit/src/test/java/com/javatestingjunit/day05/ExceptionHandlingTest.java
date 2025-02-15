package com.javatestingjunit.day05;

import com.javajunit.day05.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Create a class ExceptionHandlingTest to perform junit testing ExceptionHandling class
public class ExceptionHandlingTest {

    //Create a class testDivide() to test a divide method
    @Test
    public void testDivide() {
        int result= ExceptionHandling.divide(10,2);
        int expectedResult=5;

        //Call  the method to compare the actual and expected result
        assertEquals(expectedResult,result);
    }

    //Create a class testDivideByZero() to handle a exception and test the method
    @Test
    public void testDivideByZero() {
        try {
            int throwable = ExceptionHandling.divide(10, 0);
        }catch (ArithmeticException ex){

            //Call  the method to compare the actual and expected result
            assertEquals("Division by zero is not allowed.",ex.getMessage());
        }
    }
}
