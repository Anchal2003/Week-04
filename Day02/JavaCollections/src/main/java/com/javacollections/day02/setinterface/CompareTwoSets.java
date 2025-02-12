package com.javacollections.day02.setinterface;

import java.util.*;
//Create a class CompareSets to compare the sets
class CompareSets{
    //Create a static method to compare the two given sets
    public static boolean compareTwoSet(Set<Integer> s1,Set<Integer> s2){
        return s1.equals(s2);
    }
}

//Create a class CompareTwoSets
public class CompareTwoSets {
    public static void main(String[] args) {
        //Create a HashSet to store the element
        Set<Integer> set1 = new HashSet<>();

        //Call the add method to add element into the set
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        //Create another HashSet to store the element
        Set<Integer> set2 = new HashSet<>();
        //Call the add method to add element into the set
        set2.add(4);
        set2.add(3);
        set2.add(2);
        set2.add(1);

        //Call the method and print the result
        System.out.println("Set1 and set2 are Equals: "+CompareSets.compareTwoSet(set1,set2));
    }
}
