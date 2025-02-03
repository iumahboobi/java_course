import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Adding diaognal Array");


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the size of the Square matrix ");
        int n = scanner.nextInt();

        // Step 2: Declare and initialize the matrix
        int[][] matrix = new int[n][n];

        //3. Now entering the Elements of Array
        System.out.println("Enter the elements of the Square matrix ");


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please enter the values for " + i + " " + j);
                matrix[i][j] = scanner.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(matrix));

        // Step: Initialize the sum of Diagonals

        int sumOfPriDiagonals = 0;
        int sumOfSecDiagonals = 0;

// calculate the sum of primary diagonal
        for (int i = 0; i < n; i++) {
            sumOfPriDiagonals += matrix[i][i]; // because we go only to row and take matrix of ii 11,22,33
        }
        System.out.println("The sum of Primarydiagonal is " + sumOfPriDiagonals);

        //Calculate the sum of secondary elements

        for (int i = 0; i < n; i++) {
            if (i != n - 1 - i) {
                sumOfSecDiagonals += matrix[i][n - 1 - i];
            }

        }
        System.out.println("The sum of Secondarydiagonal is " + sumOfSecDiagonals);

    }
}