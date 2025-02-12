package com.javacollections.day02.mapinterface;
import  java.util.*;

//Create a class HighestKeyValue to find key with the highest value
class HighestKeyValue{

    //Create a static method findKeyWithHighestValue to find key with the highest value
    public static String findKeyWithHighestValue(Map<String,Integer> map){
        //Create a variable maximumValueKey
        String maximumValueKey=null;

        //Create a variable highestValue
        int highestValue=0;

        //Use for each loop
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            if(entry.getValue()>highestValue){
                highestValue=entry.getValue();
                maximumValueKey=entry.getKey();
            }
        }
        return maximumValueKey;
    }
}

//Create class FindKeyWithHighestValue
public class FindKeyWithHighestValue {
    public static void main(String[] args) {

        //Create a HashMap to store the value
        Map<String,Integer> hm=new HashMap<>();

        //Call the method put to add element into the hashmap
        hm.put("A",10);
        hm.put("B",20);
        hm.put("C",15);

        //Print the map
        System.out.println("Map: "+hm);

        //Call the method and print the result
        System.out.println("The Key with the maximum value: "+HighestKeyValue.findKeyWithHighestValue(hm));
    }
}


