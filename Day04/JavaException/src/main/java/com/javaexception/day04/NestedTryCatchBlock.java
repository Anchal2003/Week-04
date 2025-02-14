package com.javaexception.day04;
import java.util.*;

//Create a class UseNestedTryCatchBlock
class UseNestedTryCatchBlock {
    //Create a method getValueAtIndex to get Value at index
    public static void getValueAtIndex(int[] numbers, int index, int divisor) {

        //Use nested try block
        try {
            //create a variable to store value
            int element = numbers[index];

            //Use nested try block
            try {
                //Create a variable result to store the result
                int result = element / divisor;
                //Print the result
                System.out.println("Divide Result: " + result);
            } catch (ArithmeticException e) {//Catch block  to handle ArithmeticException
                System.out.println("Cannot divide by zero! ");
            }

            //Print the result
            System.out.println("Value at index " + index + " is: " + element);

        } catch (ArrayIndexOutOfBoundsException e) { //Catch block to ArrayIndexOutOfBoundException

            //Print the Statement
            System.out.println("Invalid array index!");
        }
    }
}
//Create a class NestedTryCatchBlock
public class NestedTryCatchBlock {
    public static void main(String[] args) {
        //Create a scanner class object
        Scanner input = new Scanner(System.in);

        //Create a variable and take input from user
        System.out.print("Enter the Number of Element: ");
        int noOfElement = input.nextInt();

        //Create an array
        int[] number = new int[noOfElement];

        //Take input form user
        System.out.println("Enter "+noOfElement+" Element: ");
        for(int i=0;i<noOfElement;i++){
            System.out.print("Enter Element"+(i+1)+": ");
            number[i]=input.nextInt();
        }

        //Create a variable index and take input form user
        System.out.print("Enter Index to get Element: ");
        int index=input.nextInt();

        //Create a variable divisor and take input
        System.out.print("Enter divisor: ");
        int divisor=input.nextInt();

        //Call the method and print the result
        UseNestedTryCatchBlock.getValueAtIndex(number,index,divisor);

        //Close the object
        input.close();
    }
}
