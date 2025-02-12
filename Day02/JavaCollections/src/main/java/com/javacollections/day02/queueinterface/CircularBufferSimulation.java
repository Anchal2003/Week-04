package com.javacollections.day02.queueinterface;

import java.util.*;

//Create a generic class CircularBuffer
class CircularBuffer<T>{
    //Create a variable to store the size of buffer
    private int size;

    //Parameterized constructor to initialize variable
    public CircularBuffer(int size) {
        this.size = size;
    }

    //Create a ArrayDeque to store the element
    ArrayDeque<T> circularBuffer= new ArrayDeque<>(size);

    //Create a method to add element into ArrayDeque
    public void addElement(T data){
        //Check the condition
        if(circularBuffer.size()==size){
            //remove an element from queue
            circularBuffer.remove();
        }
        //call the add method
        circularBuffer.add(data);
    }
}

//Create a class CircularBufferSimulation
public class CircularBufferSimulation {

    public static void main(String[] args) {
        //Create a variable to store the size
        int size = 3;

        //Create an object of CircularBuffer class
        CircularBuffer<Integer> circularBufferQueue = new CircularBuffer<>(size);

        //Call the add Element method to add the value
        circularBufferQueue.addElement(1);
        circularBufferQueue.addElement(2);
        circularBufferQueue.addElement(3);

        //Print the CircularBuffer queue
        System.out.println("Circular Buffer: "+circularBufferQueue.circularBuffer);

        //Call the addElement method
        circularBufferQueue.addElement(4);

        //print the result
        System.out.println("Circular Buffer: "+circularBufferQueue.circularBuffer);
    }
}
