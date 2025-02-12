package com.javacollections.day02.mapinterface;

import java.io.*;
import java.util.*;

// Create a class FindFrequency count the frequency of each word using a HashMap
class FindFrequency{
    //Create a static method getWordFrequencies to count the frequency of the word in the file
    public static void getWordFrequencies(String filePath){
        //Create a HashMap to store the frequency
        HashMap<String,Integer> countFrequency=new HashMap<>();

        //Try block to handle the exception
        try{
            //Create an object of BufferReader class
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            //Create a variable to store value
            String data;

            //Use while to read file text line-by-line
            while((data=br.readLine())!=null){

                //Create an array words to store the word
                String[] words=data.toLowerCase().replaceAll("[^a-zA-Z ]", "").split(" ");

                //Use for each loop
                for(String word:words){
                    if(countFrequency.containsKey(word))
                        countFrequency.put(word,countFrequency.get(word)+1);
                    else
                        countFrequency.put(word,1);
                }
            }

            //Print the frequency of each word
            System.out.printf("%-20s %s","Words","Frequency");
            for(Map.Entry<String ,Integer> entry :countFrequency.entrySet()){
                System.out.printf("\n%-20s %d",entry.getKey(),entry.getValue());
            }

        }catch (Exception e){  //Catch block to handle the exception
            System.out.println("Error"+e.getMessage());
        }
    }
}

//Create a class WordFrequencyCounter
public class WordFrequencyCounter {
    public static void main(String[] args) {
        //Create a string variable to store path of the file
        String filePath="C:\\Users\\hp\\IdeaProjects\\JavaCollections\\src\\main\\java\\com\\javacollections\\day02\\mapinterface\\sample.txt";

        //call the method getWordFrequencies and print the result
        FindFrequency.getWordFrequencies(filePath);
    }
}

