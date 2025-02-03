import java.util.Scanner;

import static java.util.Collections.reverse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Magic Mirror!");

        System.out.println("Enter the String to Mirrored");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println("You entered :" + word);

        String mirroredString = magicMirror(word);
        System.out.println("The Mirror String is: " + mirroredString);

        scanner.close();
    }

    public static String magicMirror(String word) {

        //base case if string is empty
        if (word == null || word.length() <= 1) {
            return word;
        }
        return magicMirror(word.substring(1)) + word.charAt(0);
    }
}