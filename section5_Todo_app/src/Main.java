import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final ArrayList<String> tasks = new ArrayList<>();
    private static final ArrayList<Boolean> isCompleted = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello and welcome to TODO app!");


        //Menu Display: Use a loop to repeatedly show the menu and get user input.

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {

            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;

                case 2:
                    viewTask();
                    break;
                case 3:
                    markAsCompleted(scanner);
                    break;

                case 4:
                    removeTask(scanner);
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Exiting the Todo app. Good Bye!! ");
                    break;

                default:
                    System.out.println("Invalid choice Please Try again");
            }
        }
        scanner.close();

        //Add a Task: Use an ArrayList to store tasks. A method should be used to add a task.

        //  View Tasks: A method should be used to display all tasks.

        // Mark as Completed: A method should be used to mark a task as completed.

        // Remove a Task: A method should be used to remove a task.

        // Exit: Use a conditional statement to exit the loop.


    }

    public static void printMenu() {

        System.out.println("1: Add a Task");
        System.out.println("2: View Task");
        System.out.println("3: Mark as Completed");
        System.out.println("4: Remove a Task");
        System.out.println("5: Exit");
    }

    public static void addTask(Scanner scanner) {
        System.out.print("Please add your task: ");
        String addTask = scanner.nextLine();
        tasks.add(addTask);
        isCompleted.add(false);
        System.out.println("Task added successfully");
    }

    public static void viewTask() {
        System.out.println("To Do List : ");
        System.out.println("------------------------");
        int counter = 1;
        for (String task : tasks) {
            String status = isCompleted.get(counter - 1) ? "Completed" : "Pending";
            System.out.println((counter + "." + task + " [" + status + "]"));
            counter++;
        }
        System.out.println("------------------------");
    }

    public static void markAsCompleted(Scanner scanner) {

        System.out.println("Enter the task number to mark as completed");
        int taskNumber = scanner.nextInt();

        if (taskNumber < 1 || taskNumber > tasks.size()) {

            System.out.println("Invalid Task number. Please enter valid Task number");

        } else {
            isCompleted.set(taskNumber - 1, true);
            System.out.println("Task " + taskNumber + " marked as completed: " + tasks.get(taskNumber - 1) + ".");
        }

    }

    public static void removeTask(Scanner scanner) {

        System.out.println("Please Enter the Task number to delete from your Todo List");
        int remTask = scanner.nextInt();

        if (remTask < 1 || remTask > tasks.size()) {
            System.out.println("The Task you want to remove does not exist");

        } else {

            String removedTask = tasks.remove(remTask - 1);

            System.out.println("Your  task is removed: " + removedTask);
            isCompleted.remove(remTask - 1);
        }
    }
}