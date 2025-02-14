package com.javaexception.day04;

import java.util.*;
//Create a class InvalidAgeException which extends to Exception class
class InvalidAgeException extends Exception{
    //Parameterized constructor to initialize object
    public InvalidAgeException(String message){
        //call the super method
        super(message);
    }
}

//Create a class to AgeValidation
class AgeValidation{
    //Create a static method to validate age
    public static void validateAge(int age){
        //Use try block
       try {
           //Check the condition
           if (age < 18) {
               //throw exception
               throw new InvalidAgeException("Age must be 18 or above");
           }
            //Print the statement
           System.out.println("Access granted!");
       } catch(InvalidAgeException e){//Catch block to handle the exception
           //Print the statement
           System.out.println("Custom Exception: "+e.getMessage());
       }
    }
}

//Create  a class CustomException
public class CustomException {
    public static void main(String[] args) {

        //Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        //Create a variable age and take input from user
        System.out.print("Enter Age of Person: ");
        int age = input.nextInt();

        //Call the method validateAge
        AgeValidation.validateAge(age);

    }
}
