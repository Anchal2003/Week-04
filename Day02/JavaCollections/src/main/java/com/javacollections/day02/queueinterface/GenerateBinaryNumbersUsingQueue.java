package com.javacollections.day02.queueinterface;
import java.util.*;

//Create a class GenerateBinaryNumber to generate the binary numbers
class GenerateBinaryNumber{
    //Create a static method generateBinaryNumbers to generate the first N number of binary number
    public static void generateBinaryNumbers(int n){
        //Create a queue interface to store binary numbers
        Queue<String>queue=new LinkedList<>();
        queue.add("1");
        //Use for loop
        for(int i=0;i<n;i++){
            //Create a variable temp
            String temp=queue.remove();
            System.out.print(temp+" ");
            //Call the add method
            queue.add(temp+"0");
            queue.add(temp+"1");
        }
    }
}

//Create a class GenerateBinaryNumbersUsingQueue
public class GenerateBinaryNumbersUsingQueue {
    public static void main(String[] args) {
        //Create a variable n to store the value
        int n =5;

        //Call the method to generate binary numbers
        GenerateBinaryNumber.generateBinaryNumbers(n);

        System.out.println();

        //Call the method to generate binary numbers
        GenerateBinaryNumber.generateBinaryNumbers(10);



    }
}
