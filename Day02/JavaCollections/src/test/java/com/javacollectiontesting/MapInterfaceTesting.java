package com.javacollectiontesting;
import com.javacollections.day02.mapinterface.FindKeyWithHighestValue;
import com.javacollections.day02.mapinterface.InvertMap;
import com.javacollections.day02.mapinterface.MergeTwoMaps;
import com.javacollections.day02.queueinterface.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//Create a class MapInterfaceTesting to perform testing
public class MapInterfaceTesting {

        @Test
        //Create a method findKeyWithHighestValueTest
        public void findKeyWithHighestValueTest() {
            //Create a hashMap
            Map<String, Integer> map = new HashMap<>();
            map.put("A", 10);
            map.put("B", 20);
            map.put("C", 15);

            //call the method and store the result
            String result = FindKeyWithHighestValue.findKeyWithHighestValue(map);

            //call the assert method
            assertEquals("B", result);
        }

    @Test
    //Create a class invertMapTest
    public void invertMapTest() {
        // Create a map
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        //create a map expectedOutput
        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, Arrays.asList("A", "C"));
        expectedOutput.put(2, Arrays.asList("B"));

       //Create a map actualOutput
        Map<Integer, List<String>> actualOutput =  InvertMap.getInvertMap(inputMap);

        // call the assert method
        assertEquals(expectedOutput, actualOutput);
    }

}
