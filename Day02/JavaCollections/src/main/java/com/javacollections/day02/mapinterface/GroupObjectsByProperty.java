package com.javacollections.day02.mapinterface;

import  java.util.*;

//Create an employee class to define employee details
class Employee {
    //Create a variable name and department to store employee details
    private String name;
    private String department;

    //Parameterized constructor to initialize variable
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    //Create a method getDepartment
    public String getDepartment() {
        return department;
    }

    //Create a method to toString to return name
    public String toString() {
        return name;
    }

    //Create a static method groupObjectByDepartment to make group of employee by department
    public static Map<String, List<Employee>> groupObjectByDepartment(List<Employee>employees){

        //Create a map to store value
        Map<String,List<Employee>> department=new HashMap<>();

        //Use for each loop
        for(Employee employee: employees){
            //Create a variable to store the department
            String temp=employee.getDepartment();
            if(department.containsKey(temp))
                department.get(temp).add(employee);
            else{
                //Create a list to store the value
                List<Employee> employeeList=new ArrayList<>();
                employeeList.add(employee);
                department.put(temp,employeeList);
            }
        }

        return department;
    }
}

//Create a class GroupObjectsByProperty
public class GroupObjectsByProperty {
    public static void main(String[] args) {
        // Create an ArrayList to store element
        List<Employee> employees = new ArrayList<>();

        //Call add method
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        //Create a Map reference variable
        Map<String,List<Employee>> employeesDepartment = Employee.groupObjectByDepartment(employees);

        //Use for each loop to print the details
        for(Map.Entry<String,List<Employee>> entry:employeesDepartment.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
