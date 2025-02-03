import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to Students Info !!! ");
        System.out.println("How Many Students do you want to enter?");

        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the name of the " + (i + 1) + " Student");
            String name = scanner.nextLine();

            System.out.println("Enter the roll number  of the Student " + (i + 1));
            int rollNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the age of the  Student " + (i + 1));
            int age = scanner.nextInt();


            System.out.println("Enter the height of the  Student" + (i + 1) + "in cm");
            double height = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(name, rollNumber, age, height);
        }

        // Printing students Data

        calculateAndDisplayStatistic(students);


    }


    public static void calculateAndDisplayStatistic(Student[] students) {


        int totalAge = 0;
        int oldestAge = students[0].age;
        double totalHeight = 0.0;
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


        System.out.println("//n  Students Statistics");

        System.out.println("Average Age: " + averageAge + " years");
        System.out.println("Average Height: " + averageHeight + " cm");
        System.out.println("Oldest Student: " + oldestStudent + " ( " + oldestAge + " years old)");
        System.out.println("Tallest Student: " + tallestStudent + " ( " + tallestHeight + " cm)");
    }

}