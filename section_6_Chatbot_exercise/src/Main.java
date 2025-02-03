import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user

        Scanner scanner = new Scanner(System.in);

        String userInput ;
        // Prompt the user to enter their input
        System.out.println("Please enter something");
        // Read the user's input and store it in the variable userInput
        userInput = scanner.nextLine();

        // Check if the user's input is a greeting (e.g., "hello" or "hi")
        if(userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi") ){
           System.out.println("chatbot: Hello, How Can I help you? ");
        }
        // and display a relevant response

        // Check if the user's input is an inquiry about well-being (e.g., "how are you" or "how's it going")
        // and display a relevant response
        if(userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how's it going") ){
            System.out.println("chatbot: i am fine, and its beautiful sunny day here. ");
        }

        // Check if the user's input is about the weather (e.g., "what's the weather like" or "weather")
        // and display a relevant response
        if(userInput.equalsIgnoreCase("what's the weather like") || userInput.equalsIgnoreCase("weather") ){
            System.out.println("chatbot: its beautiful sunny day here. ");
        }

        // Check if the user's input is a farewell (e.g., "bye" or "goodbye")
        // and display a relevant response
        if(userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye") ){
            System.out.println("chatbot: Good Bye , See you next time ");
        }

        // If the user's input doesn't match any of the predefined options, respond with a default message
        if (!userInput.equalsIgnoreCase("hello") && !userInput.equalsIgnoreCase("hi") &&
                !userInput.equalsIgnoreCase("how are you") && !userInput.equalsIgnoreCase("how's it going") &&
                !userInput.equalsIgnoreCase("what's the weather like") && !userInput.equalsIgnoreCase("weather") &&
                !userInput.equalsIgnoreCase("bye") && !userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: I'm sorry, I don't understand that.");
        }

        // Close the Scanner object to free up resources
        scanner.close();
    }
}