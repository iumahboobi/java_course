import java.util.Scanner;

public class InputGame extends Game {


    public InputGame(String wordToGuess, int attempts) {
        super(wordToGuess, attempts);
    }

    @Override
    void playGame() {
        super.playGame();
        Scanner scanner = new Scanner(System.in);
        displayHint();
        
        while (attempts > 0) {
            System.out.println("Current Word: " + getRevealWord());
            System.out.println("Please Enter the word");

            char inputWord = scanner.next().charAt(0);
            boolean correctGuess = false;


            // loop through the wordToGuess

            for (int i = 0; i < wordToGuess.length(); i++) {

                if (wordToGuess.charAt(i) == inputWord) {
                    revealedLetters[i] = inputWord;
                    correctGuess = true;

                }
            }

            // if guess is wrong
            if (!correctGuess) {
                attempts--;
                System.out.println("Sorry your guess is wrong");
                System.out.println("Attempts left: " + attempts);

            } else {
                System.out.println("Your guess is correct: ");
            }

            // If guess is fully correct
            if (getRevealWord().equals(wordToGuess)) {
                System.out.println("🎉 Congratulations! You guessed the word correctly!");
                break;
            }
        }
        if (attempts == 0) {
            System.out.println("Game Over !!!  You have " + attempts + " attempts left.");
        }
        scanner.close();

    }
}