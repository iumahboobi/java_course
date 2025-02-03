import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("How many slices do you want to put in your Sandwich?");

        Scanner scanner = new Scanner(System.in);
        int noOfSlices= scanner.nextInt();
        sandwichMaker(noOfSlices);
        scanner.close();
    }

    public static void sandwichMaker(int slices) {
        System.out.println("Take two slices of Bread");
        System.out.println("Spread butter on the slice");
        System.out.println("Add slice of the cheese");
        System.out.println("You put " + slices + " slices in the Sandwich");
        System.out.println("Put the second slice of Bread on the top.");
        System.out.println("Sandwich is Ready");
    }
}