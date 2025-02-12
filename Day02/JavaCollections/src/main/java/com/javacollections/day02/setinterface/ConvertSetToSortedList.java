package com.javacollections.day02.setinterface;
import java.util.*;
//Create a class SortedList to convert hashset into the sorted list
class SortedList{

    //Create a static method convertSetToSortedList to convert set to sorted list
    public static List<Integer> convertSetToSortedList(Set<Integer> s1){
        //Create an ArrayList to store value
        ArrayList<Integer> list = new ArrayList<>();
        //Use for loop
        for(int val: s1){
            list.add(val);
        }
        return list;
    }
}

//Create a class ConvertSetToSortedList
public class ConvertSetToSortedList {
    public static void main(String[] args) {
        //Create a HashSet to store the element
        Set<Integer> hashSet = new HashSet<>();

        //Call the add method to add element into the set
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(1);
        hashSet.add(2);

        //print the hashSet
        System.out.println("HashSet: "+hashSet);

        //call the method and print the result
        System.out.println("Converted Sorted List: "+SortedList.convertSetToSortedList(hashSet));

    }
}
