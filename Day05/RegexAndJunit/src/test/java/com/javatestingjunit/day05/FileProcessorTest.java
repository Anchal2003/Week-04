package com.javatestingjunit.day05;

import static org.junit.jupiter.api.Assertions.*;

import com.javajunit.day05.FileProcessor;
import org.junit.jupiter.api.Test;

import java.io.IOException;

//Create class FileProcessorTest to perform junit testing on the file
public class FileProcessorTest {

    //Create a method testWriteToFileAndReadFromFile to check the content is written and read correctly.
        @Test
        public void testWriteToFileAndReadFromFile () throws IOException {
        String filePath="C:\\Week-04\\Day-05-JavaRegexAndJUnit\\src\\main\\java\\com\\day05\\javajunit\\sourcefile.txt";
        String content = "Hello, world!";

        // Write content to the file
        FileProcessor.writeToFile(filePath.toString(), content);

        // Read content from the file
        String readContent = FileProcessor.readFromFile(filePath.toString());

        //Call  the method to compare the actual and expected result
        assertEquals(content, readContent);
    }

    //Create a method testReadFromFileNonExistent to test file not present
        @Test
        public void testReadFromFileNonExistent () {
        // Test reading from a non-existent file
        Exception exception = assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile("nonexistentfile.txt");
        });

        //Call  the method to compare the actual and expected result
        assertTrue(exception.getMessage().contains("nonexistentfile.txt"));
    }

    }
