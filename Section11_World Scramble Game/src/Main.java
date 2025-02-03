import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Word Scramble Game!");
        System.out.println("--------Guess The Word----------");
        String[] countries = {"Afghanistan", "Pakistan", "India", "Australia"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean keepPlaying = true;
        int playerScore = 0;

        while (keepPlaying) {
            String word = countries[random.nextInt(countries.length)];
            String scrambledWord = scrambleWord(word, random);
            System.out.println("The Scrambled Word is" + scrambledWord);

            boolean isWordGuessed = false;
            int attempts = 3;
            while (attempts > 0 && !isWordGuessed) {

                System.out.println("Enter your guess: ");
                String playerGuess = scanner.nextLine();

                if (playerGuess.equalsIgnoreCase(word)) {
                    System.out.println("Correct");
                    playerScore = playerScore + 5;
                    isWordGuessed = true;
                } else {
                    System.out.println("The word is not correct");
                    attempts--;
                    System.out.println("Attempts remaining are :" + attempts);
                }
            }

            if (!isWordGuessed) {
                System.out.println("The correct word was: " + word);
            }

            System.out.println("The socre is: " + " " + playerScore);

            System.out.println("Do you want to play? Yes/No");
            String response = scanner.nextLine();

            keepPlaying = response.equalsIgnoreCase("yes");

        }

        System.out.println("Your final score is : " + playerScore);
        System.out.println("------- Thanks for Playing see you soon !! ---------");
        scanner.close();


    }

    public static String scrambleWord(String word, Random random) {
        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            int j = random.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
}