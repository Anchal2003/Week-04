package com.javaexception.day04;

import java.io.*;

//Create a class ReadFile to read the file
class ReadFile{

    //Create a static method to read the file line by line
    public static void readFileLineByLine(String filePath){

        //Use try block
        try{
            //Create an object of BufferReader Class
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            //Create a variable to store data
            String data;

            //Use while loop to read file
            while ((data = br.readLine())!=null){
                //Print the file content
                System.out.println(data);
            }

            //Close the object
            br.close();
        }catch (IOException e){ //Catch block to handle IOException
            //Print the statement
            System.out.println("File Not Found. "+e.getMessage());

        }
    }
}

//Create a class CheckedException
public class CheckedException {
    public static void main(String[] args) {

        //Create a variable to store the file path
        String filePath = "C:\\Users\\hp\\IdeaProjects\\JavaException\\src\\main\\java\\com\\javaexception\\day04\\data.txt";

        //Call the method to read file
        ReadFile.readFileLineByLine(filePath);
    }
}
