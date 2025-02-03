import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Please Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        if (n == 1) {
            System.out.println(firstTerm);
        } else {
            System.out.print(firstTerm + " " + secondTerm);

            for (int i = 3; i < n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(" " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
        scanner.close();
    }
}