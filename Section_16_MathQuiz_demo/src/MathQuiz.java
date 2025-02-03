import java.util.Scanner;

public class MathQuiz {


    int score;

    // constructor
    public MathQuiz() {
        this.score = 0;
    }

    public void startQuiz() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            askQuestion(scanner);
        }
        System.out.println("Your Final score is " + score + "out of 5");
        scanner.close();
    }

    public void askQuestion(Scanner scanner) {

        Question question = new Question();
        question.generateQuestion();
        double userAnswer;


        // Check if input is valid double

        while (true) {
            System.out.println("Your Answer : ");

            if (scanner.hasNextDouble()) {
                userAnswer = scanner.nextDouble();

                break;
            } else {

                System.out.println("Invalid Input! Please enter a number");
                scanner.next();
            }
        }


        if (question.checkAnswer(userAnswer)) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Inorrect");
        }
    }
}
