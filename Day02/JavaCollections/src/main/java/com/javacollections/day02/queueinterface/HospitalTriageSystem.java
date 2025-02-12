package com.javacollections.day02.queueinterface;

import java.util.*;

//Create a class Patient to indicate the details
class Patient {
    //Create variable name and severity
    private String name;
    int severity;

    //Parameterized constructor to initialize variable
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    //Create a method toString and override it
    public String toString() {
        return name;
    }
}

//Create a class HospitalTriageSystem
public class HospitalTriageSystem {
    public static void main(String[] args) {
        //Create a PriorityQueue(
        PriorityQueue<Patient> triageSystem = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));

        //Call the add method to add element
        triageSystem.add(new Patient("John", 3));
        triageSystem.add(new Patient("Alice", 5));
        triageSystem.add(new Patient("Bob", 2));

        //Print the result
        while (!triageSystem.isEmpty()) {
            Patient patient = triageSystem.remove();
            System.out.println(patient);
        }
    }
}
