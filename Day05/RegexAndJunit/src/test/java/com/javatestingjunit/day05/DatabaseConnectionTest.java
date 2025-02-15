package com.javatestingjunit.day05;

import com.javajunit.day05.UseDatabaseConnection;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Create a class DatabaseConnectionTest to perform junit testing DatabaseConnection class and use testing @BeforeEach and @AfterEach Annotations
public class DatabaseConnectionTest {
        private UseDatabaseConnection dbConnection;

        //Create a method testConnect to connect the test before every test method
        @BeforeEach
        public void testConnect() {
            dbConnection = new UseDatabaseConnection();
            dbConnection.connect();
        }

    //Create a method testDisconnect to disconnect the test after every test method
        @AfterEach
        public void testDisconnect() {
            dbConnection.disconnect();
        }

    //Create a method testDatabaseConnection to check database Connection
        @Test
        public void testDatabaseConnection() {
            boolean result=dbConnection.isConnected();
            boolean expectedResult=true;

            //Call  the method to compare the actual and expected result
            assertEquals(expectedResult,result);

        }

    //Create a method testConnectionClosed to check database Connection Closed
        @Test
        public void testConnectionClosed() {
            dbConnection.disconnect();
            boolean result=dbConnection.isConnected();
            boolean expectedResult=false;

            //Call  the method to compare the actual and expected result
            assertEquals(expectedResult,result);
        }
}
