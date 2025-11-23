//ASSIGNMENT 1: Student Class Design & Basic 
//Operations 
 
//Problem Statement: 
 
//Create a Student Record Management system that allows the user to input, display, and calculate grades for students. Implement a class-based structure using Object-Oriented Programming 
//principles to manage student data such as roll number, name, course, marks, and grade. The program should also allow the display of student records and calculate the grade based on marks. 

// CODE :- 
// Assignment 1: Student Class Design & Basic Operations
// Name: Subhrajeet
// Roll Number: 2401350018

import java.util.Scanner; // Import Scanner to read user input

// -------------------------------------------------------
// Part 1: The Blueprint ( The Student Class )
// -------------------------------------------------------
class Student {
    // Attributes: Variables to hold student data
    int rollNumber;
    String name;
    String course;
    double marks;
    char grade;

    // Constructor: A special method to initialize the object
    public Student(int rollNumber, String name, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
        calculateGrade(); // Calculate grade automatically when student is created
    }

    // Method to calculate grade based on marks
    public void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("\n-----------------------------");
        System.out.println("      STUDENT RECORD         ");
        System.out.println("-----------------------------");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
        System.out.println("-----------------------------");
    }
}

public class lab_assignment1 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Management System Input ===");

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        Student student1 = new Student(rollNumber, name, course, marks);

        student1.displayInfo();

    }
}
