package com.javacollections.day02.mapinterface;

import java.util.*;

//Create a class Merge to merge two maps
class MergeMap{
    //Create a static method mergeTwoMap to merge the given map
    public static void mergeTwoMaps(Map<String,Integer> map1,Map<String,Integer> map2){

        //Create a map mergeMap to store two merged map value
        Map<String,Integer> mergeMap=new HashMap<>(map1);

        //Use for loop to merge maps
        for(Map.Entry<String,Integer> entry: map2.entrySet()){
            if(mergeMap.containsKey(entry.getKey())){

                //Create a variable temp to store value
                int temp = entry.getValue();
                mergeMap.put(entry.getKey(),temp+ mergeMap.get(entry.getKey()));
            } else{
                mergeMap.put(entry.getKey(),entry.getValue());
            }
        }

        //Use for loop to print the map
        for(Map.Entry<String,Integer>entry:mergeMap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}

//Create a class MergeTwoMaps
public class MergeTwoMaps {
    public static void main(String[] args) {

        //Create two map to store value
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        //Call put method to add  key and value in map1
        map1.put("A", 1);
        map1.put("B", 2);

        //Call put method to add  key and value in map2
        map2.put("B", 3);
        map2.put("C", 4);

        //call the method and print the result
        MergeMap.mergeTwoMaps(map1, map2);
    }
}
