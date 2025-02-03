import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Welcome to see Harshad Number");
        System.out.println("Harshad number is when a number is divisible by its summ for e.g 300 -> 3+0+0 =3 and 300 is divided by 3");

        System.out.println("Please Enter a number");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        int originalNumber = userInput;
        int sumOfNumber = 0;

        while (userInput > 0) {
            sumOfNumber += userInput % 10;
            userInput /= 10;
        }
        System.out.println("this is userinput " + userInput);

        if (originalNumber % sumOfNumber == 0) {
            System.out.println("The number is Harshad number");

        } else {
            System.out.println("The number isn't Harshad Number");
        }
    }
}