package com.javagenerics.day01;

import java.util.ArrayList;
import java.util.List;

//Create an abstract class to indicate the course type
abstract class CourseType{
    //Create a private variable courseName
    private String courseName;

    //Parameterized Constructor to initialize variable
    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    //Create a getter method to get the course name
    public String getCourseName() {
        return courseName;
    }

    //Create an abstract method
    abstract void courseType();
}

//Create a class ExamBasedCourse Which extends CourseType class
class ExamBasedCourse extends CourseType{

    //Parameterized Constructor to initialize variable
    public ExamBasedCourse(String courseName) {
        //Call the superclass constructor
        super(courseName);
    }

    //override the courseType method
    void courseType(){
        System.out.println("Exam-Based Course: ");
    }
}

//Create a class AssignmentBasedCourse Which extends CourseType class
class AssignmentBasedCourse extends CourseType{
    //Parameterized Constructor to initialize variable
    public AssignmentBasedCourse(String courseName) {
        //Call the superclass constructor
        super(courseName);
    }

    //override the courseType method
    void courseType(){
        System.out.println("Assignment-Based Course: ");
    }
}

//Create a class ResearchBasedCourse Which extends CourseType class
class ResearchBasedCourse extends CourseType{
    public ResearchBasedCourse(String courseName) {
        //Call the superclass constructor
        super(courseName);
    }

    //override the courseType method
    void courseType(){
        System.out.println("Research-Based Course: ");
    }
}

//Create a generic class to indicate the course
class Course<T extends CourseType>{
    //Create an ArrayList to store the course Details
    ArrayList<T> course = new ArrayList<>();

    //Create  a method to add data into list
    public void add(T data){
        course.add(data);
    }

    //Create a static method to display details
    public static void displayDetails(List<? extends CourseType> course){
        //Call the method to display the course type
        course.getFirst().courseType();

        //Use for loop to print the details
        for(CourseType val: course){
            //Print the value
            System.out.println(val.getCourseName());
        }
        System.out.println(); //Next line
    }

}

//Create a class MultiLevelUniversityCourseManagement
public class MultiLevelUniversityCourseManagement {
    public static void main(String[] args) {

        //Create an object of generic class Course and pass the ExamBasedCourse class as a parameter type
        Course<ExamBasedCourse> examCourses = new Course<>();
        //Call the method to add the courses in list
        examCourses.add(new ExamBasedCourse("B.Tech"));
        examCourses.add(new ExamBasedCourse("B.Com"));
        examCourses.add(new ExamBasedCourse("M.Tech"));

        //Call the method to displayDetails
        Course.displayDetails(examCourses.course);

        //Create an object of generic class Course and pass the ExamBasedCourse class as a parameter type
        Course<AssignmentBasedCourse> assignmentCourses = new Course<>();
        //Call the method to add the courses in list
        assignmentCourses.add(new AssignmentBasedCourse("Java Full Stack"));
        assignmentCourses.add(new AssignmentBasedCourse("MERN Stack"));
        assignmentCourses.add(new AssignmentBasedCourse("Ethical Hacking"));

        //Call the method to displayDetails
        Course.displayDetails(assignmentCourses.course);

        //Create an object of generic class Course and pass the ExamBasedCourse class as a parameter type
        Course<ResearchBasedCourse> researchCourses = new Course<>();
        //Call the method to add the courses in list
        researchCourses.add(new ResearchBasedCourse("Data analysis"));
        researchCourses.add(new ResearchBasedCourse("Statistics and probability"));
        researchCourses.add(new ResearchBasedCourse("Scientific writing"));

        //Call the method to displayDetails
        Course.displayDetails(researchCourses.course);
    }
}
