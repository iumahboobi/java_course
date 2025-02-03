import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //sum of all Array Elements

        int [][] arr4= {{1,2},{3,4},{5,6}};

        int sum4 = 0;

        for(int i = 0 ; i<arr4.length; i++){
            for(int j = 0; j< arr4[i].length; j++){
                sum4+= arr4[i][j];
            }
        }

        System.out.println("the sum of array is: "+ sum4);



        System.out.println("Hello and welcome to 2d Array");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Matrix");
        int n = scanner.nextInt();
        int[][] array2d = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the values for " + i + " " + j);
                array2d[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("The entered matrix is ");


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(array2d[i][j] + " ");
            }
            System.out.println();
        }

        //Now add the diagonals left and right diagonals
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array2d[i][i];
        }
        // The left diagonal counting avoid the center element by counting it twice
        for(int i=0;i<n;i++){
            sum+= array2d[i][n-1-i];
        }
        System.out.println("The sum of the diagonal is " + sum);
        scanner.close();
    }



}