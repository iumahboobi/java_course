import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vowel and Consonant Counter");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your desired word:");
        String word = scanner.nextLine();

        int vowelCounter = 0;
        int consonantCounter = 0;
        String vowelList = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if character is a letter
            if (!Character.isLetter(ch)) {
                continue;
            }

            // Print valid characters
            System.out.println("Current character: " + ch);

            // Check if it's a vowel
            if (vowelList.indexOf(ch) != -1) {
                vowelCounter++;
            } else {
                consonantCounter++;
            }

            // Ask user if they want to continue
            System.out.println("Do you want to continue? (yes to continue, no to exit)");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("no")) {
                break;
            } else if (!userChoice.equalsIgnoreCase("yes")) {
                System.out.println("Invalid input. Assuming 'yes' to continue.");
            }
        }

        System.out.println("Total Vowels: " + vowelCounter);
        System.out.println("Total Consonants: " + consonantCounter);

        scanner.close();
    }
}
