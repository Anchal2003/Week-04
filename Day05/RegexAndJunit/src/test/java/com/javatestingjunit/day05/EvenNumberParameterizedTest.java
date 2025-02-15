package com.javatestingjunit.day05;
import com.javajunit.day05.CheckEverNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Create a class EvenNumberParameterizedTesting to perform junit testing on EvenNumber class and perform Parameterized Tests
public class EvenNumberParameterizedTest {


    //Create a class testIsEven to call the @ParameterizedTest method and perform junit testing
    @Test
    public void testIsEven() {
         boolean result = CheckEverNumber.isEven(2);
         boolean expectedResult=true;

        //Call  the method to compare the actual and expected result
         assertEquals(expectedResult,result);
    }
}
