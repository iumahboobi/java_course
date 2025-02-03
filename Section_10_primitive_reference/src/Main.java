import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first whole number");
        int number1 = scanner.nextInt();

        System.out.println("Please enter the second whole number");
        int number2 = scanner.nextInt();

        int sum = add(number1, number2);
        int sub = subtract(number1, number2);
        int divide = division(number1, number2);
        int multiplication= multiply(number1,number2);
        System.out.println("The sum of both numbers is: " + sum);
        System.out.println("The subtraction of both numbers is: " + sub);
        System.out.println("The subtraction of both numbers is: " + divide);
        System.out.println("The subtraction of both numbers is: " + multiplication);

        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int division(int num1, int num2) {
        return num1/num2;
    }
    public static int multiply(int num1, int num2) {
        return num1*num2;
    }
}
