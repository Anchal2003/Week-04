package com.javastream.day03;

import java.io.*;

//Create a class UppercaseToLowercaseConverter to convert file lowercase
class UppercaseToLowercase {
    //Create a static method to convert uppercase letters to lowercase and write to a new file
    public static void convertUppercaseToLowercase(String inputFilePath, String outputFilePath, String encoding) {
        //use try-catch block for handle exception
        try {
            //Create an object of BufferReader and BufferWriter
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath), encoding));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilePath), encoding));

            //Create a variable to store the data
            String data;
            //Use while loop
            while ((data = br.readLine()) != null) {
                // Convert line into lowercase
                String lowerCaseLine = data.toLowerCase();
                bw.write(lowerCaseLine);
                // Write a new line
                bw.newLine();
            }
            bw.flush();
            System.out.println("File has been successfully converted and written to: " + outputFilePath);
            //use catch block for handle the exception
        } catch (IOException e) {//Catch block to handle exception
            System.out.println("Error"+e.getMessage());
        }
    }
}

//Create a class ConvertUppercaseToLowercase
public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        //Create a variable to store input and output file path
        String inputFilePath = "C:\\Users\\hp\\IdeaProjects\\JavaStreams\\src\\main\\java\\com\\javastream\\day03\\sample.txt";
        String outputFilePath = "C:\\Users\\hp\\IdeaProjects\\JavaStreams\\src\\main\\java\\com\\javastream\\day03\\sample5.txt";
        String ENCODING = "UTF-8";

        //call the method
        UppercaseToLowercase.convertUppercaseToLowercase(inputFilePath,outputFilePath,ENCODING);
    }
}
