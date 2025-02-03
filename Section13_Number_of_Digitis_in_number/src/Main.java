import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Digit counter in a number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        int result = digitCounter(number);
        System.out.println("There are " + result + " digits in this number ");

        scanner.close();


    }

    public static int digitCounter(int num) {


       // num = Math.abs(num);

        //Base case
        if (num == 0) {
            return 1;

        }
        //Recursive Case
        if(num<10) {

            return 1;

        }


        return 1+ digitCounter(num/10);

    }

}