package com.javacollections.day02.setinterface;

import java.util.HashSet;
import java.util.Set;

//Create a class Subset to check one set is subset of another
class Subset{

    //Create a method checkSubset to check that one set is subset or not
    public static boolean checkSubset(Set<Integer> s1,Set<Integer> s2){
        return (s1.containsAll(s2) || s2.containsAll(s1));
    }
}
public class FindSubsets {
    public static void main(String[] args) {
        //Create a HashSet to store the element
        Set<Integer> set1 = new HashSet<>();

        //Call the add method to add element into the set
        set1.add(2);
        set1.add(3);

        //Create another HashSet to store the element
        Set<Integer> set2 = new HashSet<>();
        //Call the add method to add element into the set
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        //Print the set
        System.out.println("Set1: "+set1+"\nSet2: "+set2);

        //call the method and Print the result
        System.out.println("Set1 is Subset of Set2: "+Subset.checkSubset(set1,set2));
    }
}