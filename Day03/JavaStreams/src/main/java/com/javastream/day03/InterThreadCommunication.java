package com.javastream.day03;
import java.io.*;

//Create a class WriterTask which implement Runnable interface
class WriterTask implements Runnable {
    //Create a final PipedOutputStream
    private final PipedOutputStream pipedOutputStream;

    //Create a constructor to initialize pipedOutputStream
    public WriterTask(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    //Create a method run() to override the method
    public void run() {
        //handle the exception by try-catch block
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pipedOutputStream))) {
            String[] messages = {"Hello", "This", "Is", "A", "Test", "Message"};
            for (String message : messages) {
                writer.write(message);
                writer.newLine();
                writer.flush();
                System.out.println("Written: " + message);
                // Simulate time taken for writing
                Thread.sleep(100);
            }
            //handle the exception
        } catch (IOException | InterruptedException e) {//Catch block to handle exception
            System.out.println("Error"+e.getMessage());
        }
    }
}

//Create a class ReaderTask which implement Runnable interface
class ReaderTask implements Runnable {
    //Create a final PipedOutputStream
    private final PipedInputStream pipedInputStream;

    //Create a constructor to initialize pipedOutputStream
    public ReaderTask(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    //Create a method run() to override the method
    public void run() {
        //handle the exception by try-catch block
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pipedInputStream))) {
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("Read: " + message);
            }
            //handle the exception by catch clock
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}

//Create a class PipedStreamsInterThreadCommunication to use WriterTask and ReaderTask class
public class InterThreadCommunication {
    public static void main(String[] args) {
        // Create an object of PipedOutputStream class
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        //Create a object of PipedInputStream class
        PipedInputStream pipedInputStream = new PipedInputStream();

        //handle the exception by try-catch block
        try {
            // Connect the piped input stream to the piped output stream
            pipedInputStream.connect(pipedOutputStream);

            // Create and start the writer thread
            Thread writerThread = new Thread(new WriterTask(pipedOutputStream));
            writerThread.start();

            // Create and start the reader thread
            Thread readerThread = new Thread(new ReaderTask(pipedInputStream));
            readerThread.start();

        } catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
    }
}
