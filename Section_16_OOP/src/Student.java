

public class Student {

    String name;
    int rollNumber;
    int age;
    double height;

    //Default Constructor
    public Student(String name, int rollNumber, int age, double height) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.height = height;
    }

    //@override to string because Java does not automatically format the output of an object
}
