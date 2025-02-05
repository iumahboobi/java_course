import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] wordPool = {"Arsenal", "Manchester united", "Chelsea", "West Ham United", "Spurs", "Manchester City"};

        Random random = new Random();
        String wordToGuessArray = wordPool[random.nextInt(wordPool.length)];
        String wordToGuess = wordToGuessArray.toLowerCase();


        AdvancedGame game = new AdvancedGame(wordToGuess, 7);
        game.playGame();
    }
}