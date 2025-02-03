import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Students data");

        System.out.println("Enter the Number of Students");
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        //array to Store each Students

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {

            System.out.println("Enter the Name of the Student " + (i + 1));
            String name = scanner.nextLine();

            System.out.println("Enter the Roll Number of the Student " + (i + 1));
            int rollNumber = scanner.nextInt();
            System.out.println("Enter the Age of the Student " + (i + 1));
            int age = scanner.nextInt();
            System.out.println("Enter the Height of the Student " + (i + 1));
            double height = scanner.nextInt();
            scanner.nextLine();
            students[i] = new Student(name, rollNumber, age, height);
        }

        calculateAndDisplayStatistics(students);

        scanner.close();
    }


    public static void calculateAndDisplayStatistics(Student[] students) {

        int totalAge = 0;
        double totalHeight = 0;
        int oldestStudent = students[0].age;
        double tallestStudent = students[0].height;

        String tallestStudentName = students[0].name;
        String oldestStudentNameName = students[0].name;


        for (Student student : students) {
            totalAge += student.age;
            totalHeight += student.height;

            if (student.age > oldestStudent) {
                oldestStudent = student.age;
                oldestStudentNameName = student.name;
            } else if (student.height > tallestStudent) {
                tallestStudent = student.height;
                tallestStudentName = student.name;
            }
        }

        // Update Average height and Average age
        double averageAge = (double) totalAge / students.length;
        double averageHeight = totalHeight / students.length;

        System.out.println("Tallest Student is : " + "( " + tallestStudentName + " )" + " and the height is :" + tallestStudent);
        System.out.println("Oldest Student is : " + "( " + oldestStudentNameName + " ) " + " and old is :" + oldestStudent);
        System.out.println("Average Age: " + averageAge);
        System.out.println("Average Height: " + averageHeight);
    }
}