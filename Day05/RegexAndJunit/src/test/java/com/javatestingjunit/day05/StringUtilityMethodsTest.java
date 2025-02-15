package com.javatestingjunit.day05;
import com.javajunit.day05.StringUtilityMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Create a class StringUtilityMethodsTest to perform junit testing
public class StringUtilityMethodsTest {

        //Create a method testReverse to test reverse method
        @Test
        public void testReverse() {
            String reverseResult= StringUtilityMethods.reverse("mohit");
            String expectedResult="tihom";
            assertEquals(expectedResult,reverseResult);
        }


    //Create a method testIsPalindrome to test isPalindrome method
        @Test
        public void testIsPalindrome() {
            boolean palindromeResult=StringUtilityMethods.isPalindrome("kanak");
            boolean expectedResult=true;

            //Call  the method to compare the actual and expected result
            assertEquals(expectedResult,palindromeResult);
        }

    //Create a method testToUpperCase to test toUpperCase method
        @Test
        public void testToUpperCase() {
            String reverseResult=StringUtilityMethods.toUpperCase("mohit");
            String expectedResult="MOHIT";

            //Call  the method to compare the actual and expected result
            assertEquals(expectedResult,reverseResult);
        }
}
