import java.util.Random;

public class Dice {

    private int value;


    //constructor

    public Dice() {
        this.value = 1;  // Intitialize the value to 1.
    }

    // Method to roll the Dice.
    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    // Method to get the current value

    public int getValue() {
        return this.value;
    }
}
