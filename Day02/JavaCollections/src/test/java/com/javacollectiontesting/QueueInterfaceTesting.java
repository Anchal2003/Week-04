package com.javacollectiontesting;
import com.javacollections.day02.queueinterface.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class QueueInterfaceTesting {

    @Test
    //Create a method to test reverse queue
    public void reverseQueueTest(){

        // Create a Queue to store element
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        //call the method to reverse queue
        ReverseQueue.reverseQueue(queue);

        //Create a expected reversed queue
        Queue<Integer> expectedQueue = new LinkedList<>();
        expectedQueue.add(40);
        expectedQueue.add(30);
        expectedQueue.add(20);
        expectedQueue.add(10);

        //call the method to check the values
        assertEquals(expectedQueue, queue);
    }

    @Test
    //Create a method implementStackUsingQueueTest
    public void implementStackUsingQueueTest() {


        //Create an object of ImplementStackUsingQueue class
        ImplementStackUsingQueue actualStack = new ImplementStackUsingQueue();
        actualStack.push(3);
        actualStack.push(2);
        actualStack.push(1);

        //Create a expectedStack
        Stack<Integer>extepecedStack=new Stack<>();
        extepecedStack.push(3);
        extepecedStack.push(2);
        extepecedStack.push(1);

        //compare actual result and expected Result for pop operation
        assertEquals(extepecedStack.pop(), actualStack.pop());

        //compare actual result and expected Result for top operation
        assertEquals(extepecedStack.peek(), actualStack.top());

    }
}
