package com.javacollections.day02.mapinterface;

import java.util.*;

// Create a class Invert to Invert a Map
class Invert{
    //Create a static method getInvertMap to invert the map data
    public static <K,V> void getInvertMap(Map<K,V> inputMap){

        //Create a map to store the  data
        Map<V,List<K>> invertMap=new HashMap<>();

        //Use for loop to invet data
        for(Map.Entry<K,V>entry:inputMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();
            if (invertMap.containsKey(value)) {
                invertMap.get(value).add(key);
            } else {
                //Create an ArrayList to store value
                List<K> list = new ArrayList<>();
                list.add(key);
                invertMap.put(value, list);
            }
        }

        //Use for loop to print the invert map data
        for(Map.Entry<V,List<K>> entry : invertMap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}

//Create a class InvertMap
public class InvertMap {
    public static void main(String[] args) {
        //Create a map
        Map<String,Integer> hm=new HashMap<>();

        //call the put method to
        hm.put("A",1);
        hm.put("B",2);
        hm.put("C",1);

        //call the method and print the result
        Invert.getInvertMap(hm);
    }
}


