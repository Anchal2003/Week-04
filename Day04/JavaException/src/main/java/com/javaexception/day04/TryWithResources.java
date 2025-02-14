package com.javaexception.day04;
import java.io.*;
//Create a class ReadFiles
class ReadFiles{

    //Create a static method to read first line of file
    public static void readFirstLineOfFile(String filePath){

        //Use try-with-resource block and create an object of BufferReader class
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){

            //Create a variable to store data and read line
            String data = br.readLine();

            //Print the data
            System.out.println(data);

        }catch (IOException e){//Catch block to handle the IOException

            //Print the statement
            System.out.println("Error reading file.");
        }
    }
}

//Create a class TryWithResources
public class TryWithResources {
    public static void main(String[] args) {

        //Create a variable to store path of file
        String filePath = "C:\\Users\\hp\\IdeaProjects\\JavaException\\src\\main\\java\\com\\javaexception\\day04\\info.txt";

        //Call the method to read file and print the result
        ReadFiles.readFirstLineOfFile(filePath);
    }
}
