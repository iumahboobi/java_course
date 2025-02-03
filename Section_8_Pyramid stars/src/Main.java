import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of levels
        System.out.println("Enter the number of Levels");
        int levels = scanner.nextInt();





        // Build the pyramid

        for(int i =1; i <= levels; i++){
            for(int j = 0; j < levels - i; j++){

                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}