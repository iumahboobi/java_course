import java.util.Random;

public class Question {
    int operand1;
    int operand2;
    char operator;
    double correctAnswer;

    //Constructor to generate random operands and random operator
    public Question() {

        Random rand = new Random();
        this.operand1 = rand.nextInt(100) + 1;
        this.operand2 = rand.nextInt(100) + 1;

        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[rand.nextInt(4)];
        calculateAnswer();
    }

    void generateQuestion() {
        System.out.println("What is " + operand1 + " " + operator + " " + operand2 + " ?");
    }

    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.0001;
    }

    public void calculateAnswer() {

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
}
