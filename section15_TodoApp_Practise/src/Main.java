import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final ArrayList<String> tasks = new ArrayList<>();
    public static final ArrayList<Boolean> isCompleted = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("Hello and welcome to TODO App!");

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {

            menu();
            System.out.println("-----------------------");
            System.out.println("Please Enter your Choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); // always add this after scanner.int to consume the leftover newline character.

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    markAsCompleted(scanner);
                    break;

                case 4:
                    removeTask(scanner);
                    break;

                case 5:
                    System.out.println("The application is closed successfully!!! ");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Please Enter a valid choice from 1 to 5");
                    break;
            }
        }


        scanner.close();
    }


    // 1. Our Menu List (Method)

    public static void menu() {

        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark as Completed");
        System.out.println("4. Remove the Task");
        System.out.println("5. Exit Application");
    }

    // 2. First Create methods for all Tasks

    public static void addTask(Scanner scanner) {

        System.out.println("Please enter your Task");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task Added Successfully !!! ");
        isCompleted.add(false);
    }

    public static void viewTasks() {
        System.out.println("Your Tasks:");

        if (tasks.isEmpty()) {
            System.out.println("Your task's List is empty: ");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {

            String status = isCompleted.get(i) ? "Done" : "Pending";
            System.out.println((i + 1) + ". " + tasks.get(i) + " [ " + status + " ]");
        }
        System.out.println("-------------------------------");
    }

    public static void markAsCompleted(Scanner scanner) {

        if (tasks.isEmpty()) {
            System.out.println("No Tasks to be marked");
        }

        System.out.println("Please mark the task to be completed ");
        viewTasks();


        int taskToBeCompleted = scanner.nextInt();
        scanner.nextLine();

        if (taskToBeCompleted < 1 || taskToBeCompleted > tasks.size()) {
            System.out.println("Enter Valid Task Number");
        } else {
            isCompleted.set(taskToBeCompleted - 1, true);
            System.out.println("The task " + taskToBeCompleted + " " + "'" + tasks.get(taskToBeCompleted - 1) + "'" + " marked successfully!!!");
        }
    }

    public static void removeTask(Scanner scanner) {

        System.out.println("Select Task to be Removed");
        viewTasks();

        if (tasks.isEmpty()) {
            System.out.println("No Task Available  to be removed.");
        }

        int remTask = scanner.nextInt();

        if (remTask < 1 || remTask > tasks.size()) {
            System.out.println("Not Valid Task number");
        } else {
            tasks.remove(remTask - 1);
            System.out.println("The Task is removed successfully !!! ");
            isCompleted.set(remTask - 1, false);
        }

    }

}