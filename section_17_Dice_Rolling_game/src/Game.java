import java.util.Scanner;

public class Game {

    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    double score = 0;
    double bonus = 0;
    boolean isPlaying = true;

    // Method to roll both Dice
    public void rollDice() {
        dice1.roll();
        dice2.roll();
    }

    // Method to calculate score and apply bonus for doubles
    public void calculateScore() {
        int rollTotal = dice1.getValue() + dice2.getValue();
        score += rollTotal; // Add roll total to score

        // Check for doubles and apply bonus
        if (dice1.getValue() == dice2.getValue()) {
            bonus += 5; // Add 5 bonus points for doubles, accumulate bonus
            System.out.println("!!!! You are rewarded a bonus of 5 points !!!!!");
            System.out.println("---------------------------------------");
        }
    }

    // Method to display dice values
    public void displayResult() {
        System.out.println("Dice:1 -> " + dice1.getValue() + " | Dice:2 -> " + dice2.getValue());
    }

    // Method to play the game
    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (isPlaying) {

            rollDice();        // Roll the dice
            calculateScore();   // Calculate score and apply bonus
            displayResult();    // Display dice values

            // Ask if the player wants to roll again
            System.out.println("Do you want to roll again? (yes/no)");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("no")) {
                isPlaying = false;
                // Final score display
                System.out.println("Thanks for playing! See you soon.");
                System.out.println("Your score is: " + score);
                System.out.println("Bonus: " + bonus);
                System.out.println("Your final score is: " + (score + bonus)); // Total score including bonus
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        // Start the game
        Game game = new Game();
        game.playGame();
    }
}
