package com.javaexception.day04;

//Create a class ArrayOperation
class ArrayOperation{
    //Create a method getValueAtIndex to get Value at index
    public static void getValueAtIndex(int[] numbers,int index){

        //Use try block
        try{
            //create a variable to store value
            int result = numbers[index];

            //Print the result
            System.out.println("Value at index "+index+" is: "+result);

        } catch (ArrayIndexOutOfBoundsException e){ //Catch block to ArrayIndexOutOfBoundException

            //Print the Statement
            System.out.println("Error: "+e.getMessage());
        } catch (NullPointerException e){ //Catch block to NullPointerException

            //Print the Statement
            System.out.println("Error: "+e.getMessage());
        }
    }
}

//Create a class MultipleCatchBlocks
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        //Create an array
        int[] numbers = {10,5,3};

        //Call the method to get value at index
        ArrayOperation.getValueAtIndex(numbers,4);

        //Create a null array
        int[] numbers2 = null;

        //Call the method to get value at index
        ArrayOperation.getValueAtIndex(numbers2,2);
    }
}
