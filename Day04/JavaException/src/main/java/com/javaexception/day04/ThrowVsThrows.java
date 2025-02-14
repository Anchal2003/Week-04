package com.javaexception.day04;

//Create a class to  calculate the Interest
class CalculateInterest{
    //Create a method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalAccessException {

        //Check the condition
        if(amount<0 || rate<0){
            //Throw exception
            throw new IllegalAccessException("Invalid input: Amount and rate must be positive");
        }
        //Create a variable simpleInterest and calculate the interest
        double simpleInterest = (amount*rate*years)/100;

        return simpleInterest;
    }
}

//Create a class ThrowVsThrows
public class ThrowVsThrows {
    public static void main(String[] args) {
        //Use try block
        try {
            //Create variable to store the value
            double simpleInterest;

            //Call the method
            simpleInterest = CalculateInterest.calculateInterest(1000,10,2);

            //Print the result
            System.out.println("Simple Interest: "+simpleInterest);

            //Call the method
            simpleInterest = CalculateInterest.calculateInterest(-2500,10,2);

            //Print the result
            System.out.println("Simple Interest: "+simpleInterest);

        } catch (IllegalAccessException e){//Catch block to handle IllegalAccessException

            //Print the statement
            System.out.println(e.getMessage());
        }
    }
}
