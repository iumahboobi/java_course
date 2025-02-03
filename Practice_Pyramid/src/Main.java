import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the level for pyramids");

        Scanner scanner = new Scanner(System.in);

        int level = scanner.nextInt();

        for (int i = 0; i <= level; i++) {

            for (int j = 0; j < level - i; j++) {

                System.out.print(" ");

            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }


        scanner.close();

    }
}