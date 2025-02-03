import java.util.Scanner;

public class BudgetTrackerPlus {

    public static void main(String[] args) {

        double income,rent,groceries,transport,entertainment,totalExpenses,budget,rentPercentage,groceriesPercentage,entertainmentPercentage,transportPercentage;
        // Declare and initialise scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking user input for monthly income
         System.out.print("Please Enter your Monthly Income");
          income= scanner.nextDouble();


        // Taking user input for various expenses including rent, groceries
        System.out.println("Enter your Rent");
         rent = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter your Groceries");
         groceries = scanner.nextDouble();
        scanner.nextLine();

        // transportation and entertainment.

        System.out.println("Enter your Transport");
         transport = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter your Entertainment");
         entertainment = scanner.nextDouble();
        scanner.nextLine();

        // Calculating total expenses
        totalExpenses = rent+ groceries+entertainment+transport;

        // Calculating remaining budget
        budget = income - totalExpenses;

        // Calculating percentage of income spent on each category
        rentPercentage = (rent/income) *100;
        System.out.println("Your Rent Percentage is :" + rentPercentage);

         groceriesPercentage = (groceries/income) *100;
        System.out.println("Your Rent Percentage is :" + groceriesPercentage);

         entertainmentPercentage = (groceries/income) *100;
        System.out.println("Your Rent Percentage is :" + entertainmentPercentage);

         transportPercentage = (transport/income) *100;
        System.out.println("Your Rent Percentage is :" + transportPercentage);

        // Display budget summary
        System.out.println("\nBudget Summary: ");
        System.out.println("\nTotal Income: "+income);
        System.out.println("\nRemaining Budget: "+budget);
        System.out.println("\nRent: "+rentPercentage + "%");
        System.out.println("\nGroceries: " +groceriesPercentage + "%");
        System.out.println("\nTransportation: " +transportPercentage+"%");
        System.out.println("\nEntertainment: "+ entertainmentPercentage+"%");

        // Close Scanner object (good practice)
        scanner.close();
    }
}