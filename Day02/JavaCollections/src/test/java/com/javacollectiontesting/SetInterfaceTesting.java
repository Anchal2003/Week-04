package com.javacollectiontesting;
import com.javacollections.day02.listInterface.*;
import com.javacollections.day02.setinterface.ConvertSetToSortedList;
import com.javacollections.day02.setinterface.FindSubsets;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//Create a class SetInterfaceTesting
public class SetInterfaceTesting {

    @Test
    //Create a method convertSetToSortedListTest
    public void convertSetToSortedListTest() {

        //Create a HashSet
        Set<Integer> hashSet=new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(1);
        hashSet.add(2);

        //Create a actualList and call the method
        List<Integer> actualList = ConvertSetToSortedList.convertSetToSortedList(hashSet);

        //Create an arrayList
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(9);

        //compare the value
        assertEquals(expectedList, actualList);
    }



    @Test
    //Create a method findSubsetTest
    public void findSubsetTest() {

        //Create a Set
        Set<Integer> set1=new HashSet<>();
        set1.add(2);
        set1.add(3);

        //Create another Set
        Set<Integer> set2= new HashSet<>(Arrays.asList(1, 2, 3, 4));
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        //Compare the value
        assertTrue(FindSubsets.checkSubset(set1, set2));
    }
}