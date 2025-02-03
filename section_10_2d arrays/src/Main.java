//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*
         * 123
         * 456
         * 789
         *
         * */
/*
Approach 1 not recommended takes too many lines
        int[][] my2dArray = new int[3][3];
        my2dArray[0][0] = 1;
        my2dArray[0][1] = 2;
        my2dArray[0][2] = 3;
        my2dArray[1][0] = 4;
        my2dArray[1][1] = 5;
        my2dArray[1][2] = 6;
        my2dArray[2][0] = 7;
        my2dArray[2][1] = 8;
        my2dArray[2][2] = 9;
*/

        /* Approach 2 Recommended i = no of rows, j = no of columns*/
        int[][] my2dArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        /*
        for (int i = 0; i < my2dArray.length; i++) {
            for (int j = 0; j < my2dArray[i].length; j++) {
                System.out.print(my2dArray[i][j] + " ");
            }
            System.out.println();
        }
        */

        /* Enhanced for loop*/


        for (int[] rows : my2dArray) {
            for (int num : rows) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        //finding Largest number of Array

        int largest = my2dArray[0][0];
        int lowest = my2dArray[0][0];

        for (int[] rows : my2dArray) {
            for (int num : rows) {
                if (num > largest) {
                    largest = num;
                }

                if (num < lowest) {
                    lowest = num;
                }

            }
            System.out.println();
        }
        System.out.println("The largest number of your 2D Array is: " + largest);
        System.out.println("The lowest number of your 2D Array is: " + lowest);


        //Sum of all Array numbers
        int sum = 0;
        for (int[] rows : my2dArray) {
            for (int num : rows) {
                sum += num;
            }
        }
        System.out.println("The Sum of your 2D Array is: " + sum);
    }
}