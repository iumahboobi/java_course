import java.util.Arrays;

public class Game {


    String wordToGuess;
    int attempts;
    char[] revealedLetters;


    //constructor
    public Game(String wordToGuess, int attempts) {
        this.wordToGuess = wordToGuess;
        this.attempts = attempts;
        this.revealedLetters = new char[wordToGuess.length()];

        // Initialize revealedLetters with dashes
        Arrays.fill(revealedLetters, '-');
    }

    void playGame() {
        System.out.println("Welcome to Word Guessing Game");
    }

    void displayHint() {
        System.out.println("Hint: The word has " + wordToGuess.length() + " letters");
    }

    String getRevealWord() {
        return new String(revealedLetters);
    }
}
