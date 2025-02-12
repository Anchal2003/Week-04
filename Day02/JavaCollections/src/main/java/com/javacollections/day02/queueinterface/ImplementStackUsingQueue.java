package com.javacollections.day02.queueinterface;
import java.util.*;

//Create a class ImplementStack to implement stack using queue
class ImplementStack{
    //Create two queue to implement stack
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    //Create a method push to push element in the queue
    public void push(int data){
        //call the add method to add element
        queue2.add(data);
        //User while loop
        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        //Create a reference variable of queue
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;
    }

    //Create a method pop to pop element in queue
    public int pop(){
        if(queue1.isEmpty())
            throw new IllegalArgumentException("Stack is empty!");
        return queue1.poll();
    }

    //Create a method top to give peek element in the queue
    public int top(){
        if(queue1.isEmpty())
            throw new IllegalArgumentException("Stack is Empty!");
        return queue1.peek();
    }

    //Create a method displayStack to display the queue
    public void displayStack(){
        System.out.println("Stack: "+queue1);
    }
}

//Create a class ImplementStackUsingQueue
public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        //create an object of ImplementStack
        ImplementStack stack = new ImplementStack();
        //add element in stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //call the displayStack method to display the stack
        stack.displayStack();

        //Print the result and call the method
        System.out.println("Top element is: " + stack.top());

        //Print the result and call the method
        System.out.println("Popped Element is: " + stack.pop());

        //call the displayStack method to display the stack
        stack.displayStack();
    }
}