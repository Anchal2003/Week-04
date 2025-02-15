package com.javatestingjunit.day05;
import static org.junit.jupiter.api.Assertions.*;

import com.javajunit.day05.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BankAccountTest {
        private BankAccount account;

        //Create a method bankAccountObject to create BankAccount class object
        @BeforeEach
        public void bankAccountObject() {
            // Initialize with an initial balance
            account = new BankAccount(100.0);
        }

        //Create a method testDeposit to test deposit method
        @Test
        public void testDeposit() {
            account.deposit(50.0);
            double result=account.getBalance();
            double expectedResult=150;

            //Call  the method to compare the actual and expected result
            assertEquals(expectedResult, result);
        }

        //Create a method testWithdraw to test withdraw method
        @Test
        public void testWithdraw() {
            account.withdraw(40.0);
            double result=account.getBalance();
            double expectedResult=60;

            //Call  the method to compare the actual and expected result
            assertEquals(expectedResult, result);
        }

    //Create a method testWithdrawInsufficientFunds
        @Test
        public void testWithdrawInsufficientFunds() {
            try {
                account.withdraw(150);
            } catch (IllegalArgumentException exception) {

                //Call  the method to compare the actual and expected result
                assertEquals("Insufficient funds for withdrawal.", exception.getMessage());
            }
        }

        //Create a method testGetBalance to test getBalance method
        @Test
        public void testGetBalance() {
            double result=account.getBalance();
            double expectedResult=100;

            //Call  the method to compare the actual and expected result
            assertEquals(expectedResult,result);
        }
}
