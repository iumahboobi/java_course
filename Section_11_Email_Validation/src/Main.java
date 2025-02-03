import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your email address");

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();


        if (isValidEmail(email)) {
            System.out.println("The email is correct");
        } else {
            System.out.println("The email is not correct");
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {

        int atSymbolCounter = 0;
        // Must contains one @
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atSymbolCounter++;
            }
        }

        if (atSymbolCounter != 1) {
            System.out.println("The email address must contain @");
            return false;
        }

        // @ should not at the beginning nor at the end

        int atIndex = email.indexOf('@');
        if (atIndex < 1 || atIndex == email.length() - 1) {
            System.out.println("The @ should not be at the beginning nor at the end");
            return false;
        }

        // step 3. Verify there is atleast one . after the @

        int dotIndex = email.indexOf('.', atIndex + 1);

        if (dotIndex == -1) {

            System.out.println("There must be a . after the @");
            return false;
        }

        // Check that the . is not the first or last character after the @

        if (dotIndex == atIndex + 1 || dotIndex == email.length() - 1) {
            System.out.println("The . should not be right after @ or at the end");
            return false;
        }

        // ensure there is no space in the email

        if (email.contains(" ")) {
            System.out.println("The email should not contain spaces");
            return false;
        }

        return true;
    }


}