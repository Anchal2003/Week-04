package com.javastream.day03;

import java.io.*;
//Create a class ReadLargeFile to read a file
class ReadLargeFile{
    public static void readLargeFile(String filePath){

        //Use try block to handle the exception
        try{
            //Create an object of BufferedReader class
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            //Create a variable to store the values
            String data="" ;

            //Use while loop to read the file
            while((data= br.readLine())!=null){
                //Check the condition and print the result
                if (data.toLowerCase().contains("error".toLowerCase())) {
                    System.out.println(data);
                }
            }

            //close the object
            br.close();

        } catch (IOException e) {
            //Print the statement if exception is occur
            System.out.println("error "+e.getMessage());
        }
    }
}
//Create a class ReadLargeFileLineByLine
public class ReadLargeFileLineByLine {
    public static void main(String[] args) {
        //Create a variable to store the value
        String filePath = "C:\\Users\\hp\\IdeaProjects\\JavaStreams\\src\\main\\java\\com\\javastream\\day03\\large.txt";

        //Call the method to read file and print the result
        ReadLargeFile.readLargeFile(filePath);

    }
}
