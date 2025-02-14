package com.javaexception.day04;

//Create a class InsufficientBalanceException Which extends Exception class
class InsufficientBalanceException extends Exception{

    //Parameterized constructor to initialize object
    public InsufficientBalanceException(String message){
        //Call the super method
        super(message);
    }
}

//Create a class Bank
class Bank{
    //Create a variable to balance to store the value
    private double balance;

    //Parameterized constructor to initialize variable
    public Bank(double balance) {
        this.balance = balance;
    }

    //Create a method withdraw to withdraw amount
    public void withdraw(double amount) throws InsufficientBalanceException{

        //check the condition
        if(amount>balance){
            //Throw exception
            throw new InsufficientBalanceException("Insufficient balance!");
        }else if (amount < 0) {
            //Throw exception
            throw new IllegalArgumentException("Invalid amount!");
        }else {
            //update the balance
            balance =balance-amount;
            //Print the statement
            System.out.println("Withdrawal successful, new balance: "+balance);
        }
    }
}

//Create a class BankTransactionSystem
public class BankTransactionSystem {
    public static void main(String[] args) {
        //Create an object of Bank class
        Bank account=new Bank(50000);

        //Use try-catch block
        try{
            //call the method withdraw to withdraw amount
            account.withdraw(45000);
            account.withdraw(6000);
        } catch (InsufficientBalanceException e){//Catch block to handle the InsufficientBalanceException
            //Print the statement
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){//Catch block handle the IllegalArgumentException
            //Print the statement
            System.out.println(e.getMessage());
        }


        //Use try-catch block to handle the exception
        try{
            //call the method withdraw to withdraw amount
            account.withdraw(-1500);
        } catch (InsufficientBalanceException e){//Catch block
            //Print the statement
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){//Catch block
            //Print the statement
            System.out.println(e.getMessage());
        }
    }
}
