import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to the Adventure Text Game");
        System.out.println("Your goal is to find the hidden treasure. Choose Wisely.");
        System.out.println("You are at crossroad. Do you want to go left or right");

        System.out.println("Type 'left' or 'right'");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "left":
                System.out.println("You entered in the cave. Would you like to enter the cave or pass it?");
                System.out.println("Type 'enter' or 'pass' ");
                String choice1a = scanner.nextLine().toLowerCase();
                switch (choice1a) {
                    case "enter":
                        System.out.println("Great now you are in the cave and there is dragon sleeping");
                        System.out.println("Do you want to fight the Dragon or want to sneak?");
                        System.out.println("Select 'fight' or 'sneak' ");

                        String choice1b = scanner.nextLine().toLowerCase();

                        switch (choice1b) {
                            case "fight":
                                System.out.println("You have shown a great Courage, You defeated Dragon and win treasure. Hurray!!!!");
                                break;
                            case "sneak":
                                System.out.println("You sneaked the dragon,but treasure was there. You survived :D ");
                            default:
                                System.out.println("Wrong Entry you should start again");
                        }
                        break;
                    case "pass":
                        System.out.println("Great now you  pass the cave and you survive but treasure was there. You still won");
                        break;

                    default:
                        System.out.println("You entered invalid case.You lost the game");
                }

                break;


            case "right":
                System.out.println("You pass the forest and find a river");
                System.out.println("Do You want to pass the river with 'boat' or 'swim'");

                String choice2 = scanner.nextLine().toLowerCase();
                switch (choice2) {

                    case "boat":
                        System.out.println("Great there are tools available to build a boat but they are expensive");
                        break;
                    case "swim":
                        System.out.println("Great skill, you pass the river by swimming, You win");
                        break;
                    default:
                        System.out.println("Entry is wrong you are trapped in forest.");
                }


                break;
            default:
                System.out.println("Invalid Choice. Try again");
        }


        scanner.close();


    }
}