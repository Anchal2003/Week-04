package com.javastream.day03;

import java.io.*;

//Create a class BufferedStream to compare the performance of buffered stream and unbuffered stream
class BufferedStreams{
    //Create a static method copyFileWithBufferedStream to copy file in another file using buffered stream
    public static void copyFileUsingBufferedStream(String sourceFilePath, String destinationFilePath){
        //use try-catch block to handle the exception
        try {
            //Create an object of BufferedInputStream and BufferedOutputStream class
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream(sourceFilePath));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destinationFilePath));

            byte[] temp=new byte[4096];
            int data;
            //copy file test in another file
            while((data=bis.read(temp))!=-1){
                bos.write(temp,0,data);
            }
            //handle the exception by catch block
        }catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    //Create a static method copyFileWithBufferedStream to copy file in another file using unbuffered stream
    public static void copyFileUsingUnBufferedStream(String sourceFilePath, String destinationFilePath){
        //use try-catch block to handle the exception
        try {
            //Create an object of FileInputStream and FileOutputStream class
            FileInputStream fis=new FileInputStream(sourceFilePath);
            FileOutputStream fos=new FileOutputStream(destinationFilePath);

            byte[] temp=new byte[4096];
            int data;
            //copy file test in another file
            while((data=fis.read(temp))!=-1){
                fos.write(temp,0,data);
            }
            //handle the exception by catch block
        }catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}

//Create a class EfficientFileCopy
public class EfficientFileCopy {
    public static void main(String[] args) {
        //Create a variable long startTime,unbufferedReaderTime,and bufferReaderTime
        long startTime;
        long bufferReaderTime;
        long unbufferedReaderTime;

        //Create a variable to store the filePath
        String sourceFilePath="C:\\Users\\hp\\IdeaProjects\\JavaStreams\\src\\main\\java\\com\\javastream\\day03\\sample.txt";
        String destinationFilePath="C:\\Users\\hp\\IdeaProjects\\JavaStreams\\src\\main\\java\\com\\javastream\\day03\\samplecopy.txt";

        //store a starting time
        startTime=System.nanoTime();

        //call the method copyFileWithBufferedStream
        BufferedStreams.copyFileUsingBufferedStream(sourceFilePath,destinationFilePath);

        //Calculate the time for bufferedReader
        bufferReaderTime=System.nanoTime()-startTime;

        //store a starting time
        startTime=System.nanoTime();

        //call the method copyFileWithUnBufferedStream
        BufferedStreams.copyFileUsingUnBufferedStream(sourceFilePath,destinationFilePath);

        //Calculate the UnbufferedReaderTime
        unbufferedReaderTime=System.nanoTime()-startTime;

        //print the result
        System.out.println("Time Execution by Buffered Stream:   "+bufferReaderTime);
        System.out.println("Time Execution by UnBuffered Stream: "+unbufferedReaderTime);
    }
}
