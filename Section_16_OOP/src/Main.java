import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello and welcome to Students Information");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to enter? ");


        int numOfStudents = scanner.nextInt();

        // create an array to store multiple Student objects
        Student[] students = new Student[numOfStudents];


        // Loop to take input for each student and store it in the array

        String name = null;
        int rollNumber = 0;
        int age = 0;
        double height = 0;
        for (int i = 0; i < numOfStudents; i++) {

            scanner.nextLine(); // consume new line

            // Taking input for the name, roll number, age, and height of the student

            System.out.println("Enter details for student " + (i + 1));

            System.out.println("Name: ");
            name = scanner.nextLine();

            System.out.println("Roll Number: ");
            rollNumber = scanner.nextInt();

            System.out.println("Age: ");
            age = scanner.nextInt();

            System.out.println("Height: ");
            height = scanner.nextDouble();
            students[i] = new Student(name, rollNumber, age, height);
        }

        calculateAndDisplayStatistics(students);
        scanner.close();


    }

    public static void calculateAndDisplayStatistics(Student[] students) {

        // calculating average age

        int totalAge = 0;
        double totalHeight = 0.0;
        int oldestAge = students[0].age;
        double tallestHeight = students[0].height;

        String oldestStudent = students[0].name;
        String tallestStudent = students[0].name;

        for (Student student : students) {
            totalAge += student.age;
            totalHeight += student.height;

            if (student.age > oldestAge) {
                oldestAge = student.age;
                oldestStudent = student.name;

            }
            if (student.height > tallestHeight) {
                tallestHeight = student.height;
                tallestStudent = student.name;
            }
        }
        double averageAge = (double) totalAge / students.length;
        double averageHeight = totalHeight / students.length;


        System.out.println("\\n --------Statisctics---------");
        System.out.println("Average age of Students: " + averageAge);
        System.out.println("Average height of Students: " + averageHeight);
        System.out.println("Oldest Student is: " + oldestStudent);
        System.out.println("Tallest student is: " + " : " + tallestStudent);
    }
}