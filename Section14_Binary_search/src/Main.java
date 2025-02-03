import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Binary Search");

        int[] intArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number if it is available in our Array: ");


        int target = scanner.nextInt();

        int result = binarySearch(intArray, target);

        if (result != -1) {
            System.out.println("Yes The number is available and he result of Binary Search is: " + result);
        } else {
            System.out.println("No the number you entered is not available");
        }
        scanner.close();

    }

    public static int binarySearch(int[] sortedArray, int target) {


        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2; //find the middle index


            if (sortedArray[mid] == target) {
                return mid;
            }

            if (sortedArray[mid] < target) {

                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }


        return -1;
    }
}