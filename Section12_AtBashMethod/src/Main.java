import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome! to Decode and Encode");


        System.out.println("Enter 1 for encode");
        System.out.println("Enter 2 for decode");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        scanner.nextLine();  //to consume the leftover newline before calling scanner.nextLine() again for the actual string input.

        if (choice == 1) {
            System.out.println("Enter the word to encode: ");
            String input = scanner.nextLine();
            String encodedWord = encode(input, 0);
            System.out.println("The encoded word is: " + encodedWord);

        } else if (choice == 2) {
            System.out.println("Please enter the Word to decode.");
            String inputWord = scanner.nextLine();
            String decodedWord = decode(inputWord, 0);
            System.out.println("The decoded word is: " + decodedWord);

        } else {
            System.out.println("Your choice is invalid. Please Choose valid number");
        }
        scanner.close();
    }

    // Method for Encoding

    public static String encode(String input, int index) {

        if (index == input.length()) {
            return " ";
        }
        char ch = input.charAt(index);
        char encodedChar = atBash(ch);
        return encodedChar + encode(input, index + 1);
    }


    // Method for Decode

    public static String decode(String input, int index) {

        if (index == input.length()) {
            return " ";
        }
        char ch = input.charAt(index);
        char decodedChar = atBash(ch);
        return decodedChar + decode(input, index + 1);
    }

    // Method for character swap
    public static char atBash(char ch) {
        //122 - (98-97) = 121 ->b
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('z' - (ch - 'a'));
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) ('Z' - (ch - 'A'));
        }
        return ch;
    }
}