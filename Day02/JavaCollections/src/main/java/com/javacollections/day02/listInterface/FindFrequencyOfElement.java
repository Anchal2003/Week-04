package com.javacollections.day02.listInterface;

import java.util.*;

//Create a class FindFrequencyOfElement
class FindFrequency{
    //Create a static method to count the frequency to each element in list
    public static Map<String,Integer> getFrequency(List<String> list){
        //Create a Map to store the frequency of element
        Map<String,Integer> frequency = new TreeMap<>();

        //Use for-each loop to count the frequency
        for (String val : list) {
            if (frequency.containsKey(val)) {
                //Create a variable temp to store the temporary value
                int temp = frequency.get(val);
                frequency.put(val, temp + 1);
            } else {
                frequency.put(val, 1);
            }
        }
        return frequency;
    }
}

//Create a class FindFrequencyOfElement
public class FindFrequencyOfElement {
    public static void main(String[] args) {
        //Create a list to store the element
        List<String> list = new ArrayList<>();
        //Call the add method to add element into the list
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("mango");

        //Call the method and print the result
        System.out.println(FindFrequency.getFrequency(list));

    }
}
