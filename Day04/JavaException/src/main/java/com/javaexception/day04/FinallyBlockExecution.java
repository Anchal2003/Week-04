package com.javaexception.day04;

import java.util.*;

//Create a class IntegerDivision
class IntegerDivision{
    //Create a method
    public static int  getIntegerDivision(){
        //Use try block to handle the exception
        try {
            //Create an object of Scanner class
            Scanner input = new Scanner(System.in);

            //Create a variable num1 and take input from user
            System.out.print("Enter First Number: ");
            int num1 = input.nextInt();

            //Create a variable num and take input from user
            System.out.print("Enter Second Number: ");
            int num2 = input.nextInt();

            //Create a variable to store result
            int result = num1/num2;

            //Print the result
            System.out.println("Answer: "+result);

            return result;
        } catch (ArithmeticException e){ //Catch block to catch the ArithmeticException
            //Print the statement
            System.out.println("Denominator can't be zero "+e.getMessage());
        } finally {//Use finally block
            //Print the statement
            System.out.println("Operation Completed");
        }
        return 0;
    }
}
//Create a class FinallyBlockExecution
public class FinallyBlockExecution {
    public static void main(String[] args) {
        //Create a variable to store value
        int result;

        //Call the method and print the result
        result = IntegerDivision.getIntegerDivision();
    }
}
