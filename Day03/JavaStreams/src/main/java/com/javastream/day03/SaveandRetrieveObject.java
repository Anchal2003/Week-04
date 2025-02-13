package com.javastream.day03;

import java.io.*;
import java.util.*;


//Create a class Employee to store employee details
class Employee implements Serializable {
    
    //Create a static final long variable serialVersionUID to store serial version UID
    private static final long serialVersionUID=1;
    
    //Create a variable id,employeeName,department and salary to store employee details
    private int id;
    private String employeeName,department;
    private double salary;


    //Parameterized Constructor to initialize variable
    public Employee(int id, String employeeName, String department, double salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    //Create a method to return employee details
    public void displayEmployeeDetails(){
        System.out.println("Employee Name: "+employeeName+" Employee Id: "+id+" Department: "+department+" Salary: "+salary);
    }

    //Create a static method serializeEmployee to perform serialize
    public static void serializeEmployee(List<Employee> employeeList,String filePath){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(employeeList);
            System.out.println("Employee are serialized to the file: "+filePath);
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    //Create a static method deserializeEmployee to perform serialize
    public static List<Employee> deserializeEmployee(String filePath){
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(filePath));
            List<Employee> employeeList=(List<Employee>)objectInputStream.readObject();
            System.out.println("Employee are deserialized from the file: "+filePath);
            return employeeList;
        }catch (IOException |ClassNotFoundException e){
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }
}

//Create a method SerializationSaveAndRetrieveAnObject to use Employee class
public class SaveandRetrieveObject {
    public static void main(String[] args) {
        //Create a variable to store file path
        String filePath="C:\\Users\\hp\\IdeaProjects\\JavaStreams\\src\\main\\java\\com\\javastream\\day03\\employee.txt";

        //Create a List to store particular employee object
        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(1,"Alok","Software Tester",50000));
        employeeList.add(new Employee(2,"Manoj","Web Developer",70000));
        employeeList.add(new Employee(3,"Arun","Software Engineer",90000));

        //print employee details
        System.out.println("Employee Data is: ");
        for(Employee employee:employeeList){
            employee.displayEmployeeDetails();
        }
        System.out.println(); //next line
        //call the method serializeEmployee
        Employee.serializeEmployee(employeeList,filePath);

        //call the method deserializeEmployee
        List<Employee> deserializeEmployeeList=Employee.deserializeEmployee(filePath);
        System.out.println(); //next line

        //print the result
        if(deserializeEmployeeList!=null){
            for(Employee employee:deserializeEmployeeList){
                employee.displayEmployeeDetails();
            }
        }
    }
}
