import java.util.Random;

public class AdvancedGame extends InputGame {

    public AdvancedGame(String wordToGuess, int attempts) {
        super(wordToGuess, attempts);
    }


    void revealRandomLetter() {
        Random random = new Random();
        boolean revealed = false;

        while (!revealed) {

            // pick up random index
            int index = random.nextInt(wordToGuess.length());

            // if letter is not revealed
            if (revealedLetters[index] == '-') {
                revealedLetters[index] = wordToGuess.charAt(index);
                revealed = true;
            }


        }


    }

    @Override
    void displayHint() {
        super.displayHint();

        //Reveal a random letter as an additional hint
        revealRandomLetter();
        System.out.println("🔍 Bonus Hint: A random letter has been revealed: " + getRevealWord());
    }
}
