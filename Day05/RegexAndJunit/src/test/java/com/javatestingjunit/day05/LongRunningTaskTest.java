package com.javatestingjunit.day05;
import static org.junit.jupiter.api.Assertions.*;

import com.javajunit.day05.LongRunningTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

//Create a class LongRunningTaskTest to perform junit testing on LongRunning class and perform @Timeout(2) Tests
public class LongRunningTaskTest {

    //Create a method testLongRunningTask to test the longRunningTask method
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() {
        // This test will fail because the longRunningTask method takes 3 seconds
        String result = LongRunningTask.longRunningTask();

        //Call  the method to compare the actual and expected result
        assertEquals("Task Completed", result);
    }
}
