package com.javaexception.day04;

//Create a class ExceptionPropagate
class ExceptionPropagate {

    //Create a static method1 to divide number
    public static void method1() {
        //Create a variable to store value
        int num = 10/0;
    }

    //Create a static method2
    public static void method2() {
        //Call the method1
        method1();
    }
}

//Create a class ExceptionPropagationMethods
public class ExceptionPropagationMethods {
    public static void main(String[] args) {

        //Use a try-catch block to handle the exception
        try{
            //call the method method2
            ExceptionPropagate.method2();
        }
        catch (ArithmeticException e){
            //print the massage
            System.out.println("Handled exception in main "+e.getMessage());
        }
    }
}