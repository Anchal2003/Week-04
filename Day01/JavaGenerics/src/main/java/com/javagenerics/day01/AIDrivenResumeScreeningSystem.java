package com.javagenerics.day01;

import java.util.*;

//Create an abstract class JobRole
abstract class JobRole{
    //Create a private variable to store the candidateName and jobRole
    private String candidateName;
    private String jobRole;

    //Parameterized constructor to initialize value
    public JobRole(String jobRole, String candidateName) {
        this.jobRole = jobRole;
        this.candidateName = candidateName;
    }

    //Create a getter method to get the name
    public String getCandidateName() {
        return candidateName;
    }

    //Create a getter method to get the job role
    public String getJobRole() {
        return jobRole;
    }

    //Create an abstract method resumeProcess
    abstract void resumeProcess();
}

//Create a class SoftwareEngineer which extends JobRole class
class SoftwareEngineer extends JobRole{
    //Parameterized constructor to initialize value
    public SoftwareEngineer(String candidateName) {
        super("Software Engineer", candidateName);
    }

    //Create a method resumeProcess and override it
    void resumeProcess(){
        System.out.println("Resume Processing For Software Engineer Job Role");
    }

}

//Create a class DataScientist which extends JobRole class
class DataScientist extends JobRole{
    //Parameterized constructor to initialize value
    public DataScientist(String candidateName) {
        super("Data Scientist", candidateName);
    }

    //Create a method resumeProcess and override it
    void resumeProcess(){
        System.out.println("Resume Processing For Data Scientis Job Role");
    }

}

//Create a class ProductManager which extends JobRole class
class ProductManager extends JobRole{
    //Parameterized constructor to initialize value
    public ProductManager(String candidateName) {
        super("Product Manager", candidateName);
    }

    //Create a method resumeProcess and override it
    void resumeProcess(){
        System.out.println("Resume Processing For Product Manager Job Role");
    }
}
//Create a generic class Resume to store details
class Resume<T extends JobRole>{
    //Create a variable of T type
    T role;

    //Parameterized conatructor to initialize value
    public Resume(T role) {
        this.role = role;
    }

    //Create a static generic method resumeScreening
    public static void resumeScreening(List<? extends JobRole> resumes) {
        //Print the result
        for (JobRole resume : resumes) {
            System.out.println("Screening resume for: " + resume.getCandidateName());
        }
    }
}

//Create a class AIDrivenResumeScreeningSystem
public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {

        //Create an object of Resume class and pass the SoftwareEngineer class as parameter
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new SoftwareEngineer("Anchal"));
        //Call the method to print the resume status
        softwareEngineerResume.role.resumeProcess();

        //Create an object of Resume class and pass the DataScientist class as parameter
        Resume<DataScientist>  dataScientistResume = new Resume<>(new DataScientist("Sunil"));
        //Call the method
        dataScientistResume.role.resumeProcess();

        //Create an object of Resume class and pass the ProductManager class as parameter
        Resume<ProductManager> productManagerResume = new Resume<>(new ProductManager("Ritik"));
        //Call the method
        productManagerResume.role.resumeProcess();

        //Create a list of JobRole type
        List<JobRole> list = new ArrayList<>();
        //Add the element in list
        list.add(new SoftwareEngineer("Alok"));
        list.add(new DataScientist("Vishal"));
        list.add(new ProductManager("Karan"));

        //Call the resumeScreening method
        Resume.resumeScreening(list);

    }
}
