package com.javacollections.day02.queueinterface;

import java.util.*;

//Create a class Reverse to reverse the queue element
class Reverse{
    //Create a static Method reverseQueue to reverse the queue
    public static void reverseQueue(Queue<Integer> queue){
        //Create a stack to store element
        Stack<Integer> stack=new Stack<>();

        //Use while loop
        while(!(queue.isEmpty())){
            stack.push(queue.remove());
        }
        while(!(stack.isEmpty())){
            queue.add(stack.pop());
        }
    }
}

//Create a class ReverseQueue
public class ReverseQueue {
    public static void main(String[] args) {
        //Create a Queue with name queue to store integer element
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);

        //Print the queue
        System.out.println("Queue before reversing: "+queue);

        //call the method reverseQueue to reverse the queue
        Reverse.reverseQueue(queue);

        //use while loop to print reverse element of the queue
        System.out.print("Queue after reversing: "+queue);
    }
}






