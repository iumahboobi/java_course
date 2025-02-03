import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Factorial Multiplying");
        System.out.println("Enter the number to find its factorial");

        Scanner scanner = new Scanner(System.in);

        int factNumber = scanner.nextInt();
        int factorialResult = factorial(factNumber);

        System.out.println("The result of factorial you entere is: " + factorialResult);
    }

    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}