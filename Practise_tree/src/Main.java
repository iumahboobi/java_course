import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! to Tree generator");

        System.out.println("Please enter the number for finding Factorial");


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorialResult = factorial(number);

        System.out.println("The result of your Factorial is: " + factorialResult);


        /*
        int level = scanner.nextInt();

        for (int i = 1; i <= level; i++) {

            for (int j = 0; j < level - i; j++) {

                System.out.printf(" ");

            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        */


        scanner.close();


    }

    public static int factorial(int num) {

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}