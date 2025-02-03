import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Number guessing game");
        System.out.println(" Think of a number between 1 and 100 ");
        System.out.println("----Guessing the Number---");

        int low = 1;
        int high = 100;

        boolean correct = false;
        Scanner scanner = new Scanner(System.in);
        while (!correct) {

            //guess = 1 + (100 -1) /2
            // guess = 1 + (99)/2 -> 50
            // guess = 1 + (75)/2 -> 38
            int guess = low + (high - low) / 2;
            System.out.println("Is your guess  " + guess);
            System.out.println("Enter 'h' if your number is higher than" + guess + " and 'l' if lower and 'c' if Correct");

            char feedBack = scanner.next().charAt(0);

            if (feedBack == 'h') {
                low = guess + 1;
            } else if (feedBack == 'l') {
                high = guess - 1;
            } else if (feedBack == 'c') {
                correct = true;
                System.out.println("Your number is :" + guess);
            } else {
                System.out.println("Invalid input! Please enter 'h', 'l', or 'c'.");
            }
        }
        scanner.close();
    }
}