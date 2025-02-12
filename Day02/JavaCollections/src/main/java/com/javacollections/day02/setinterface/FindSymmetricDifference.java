package com.javacollections.day02.setinterface;

import java.util.*;

class SymmetricDifference{
    public static void getSymmetricDifference(Set<Integer> s1,Set<Integer> s2){
        //Create a HashSet unionSet to store the union element
        Set<Integer> symmetricDifferenceSet = new HashSet<>();

        //Use for loop to find intersection
        for(int val: s1){
            if(!s2.contains(val)){
                //Call the add method to add element into set
                symmetricDifferenceSet.add(val);
            }
        }

        for(int val: s2){
            if(!s1.contains(val)){
                //Call the add method to add element into set
                symmetricDifferenceSet.add(val);
            }
        }

        //Print the result
        System.out.println("Symmetric Difference: "+symmetricDifferenceSet);
    }
}
public class FindSymmetricDifference {
    public static void main(String[] args) {
        //Create a HashSet to store the element
        Set<Integer> set1 = new HashSet<>();

        //Call the add method to add element into the set
        set1.add(1);
        set1.add(2);
        set1.add(3);

        //Create another HashSet to store the element
        Set<Integer> set2 = new HashSet<>();
        //Call the add method to add element into the set
        set2.add(3);
        set2.add(4);
        set2.add(5);

        //Print the set
        System.out.println("Set1: "+set1+"\nSet2: "+set2);

        //Call the method and print the result
        SymmetricDifference.getSymmetricDifference(set1,set2);
    }
}
