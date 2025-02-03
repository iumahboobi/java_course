import java.util.Random;

public class Question {

    private int operand1;
    private int operand2;
    private char operator;
    private double correctAnswer;


    // constructor
    public Question() {
        Random rand = new Random();

        this.operand1 = rand.nextInt(100);
        this.operand2 = rand.nextInt(100);

        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[rand.nextInt(4)];

        calculateAnswer();
    }

    public  void calculateAnswer() {

        // Method to calculate the correct answer based on the operator
        switch (operator) {

            case '+':
                correctAnswer = operand1 + operand2;
                break;

            case '-':
                correctAnswer = operand1 - operand2;
                break;

            case '*':
                correctAnswer = operand1 * operand2;
                break;

            case '/':
                correctAnswer = (double) operand1 / operand2;
                break;
        }
    }

    public void generateQuestion() {
        System.out.println("What is " + operand1 + " " + operator + " " + operand2 + " ?");
    }

    // Method to check it the user's answer is correct

    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.001;
    }
}
