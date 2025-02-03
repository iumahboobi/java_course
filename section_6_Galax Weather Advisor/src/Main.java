import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Galaxy Weather Advisor");


        String planet;
        double temperature;
        String advice="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the planet. Earth, Mars,Venus or Jupiter");
        planet=scanner.nextLine();
        System.out.println("Enter the Temperature.");
        temperature=scanner.nextDouble();

        if (planet.equals("earth")) {
            if (temperature < 0) {
                advice = "It's freezing on Earth! Wear a heavy coat.";
            } else if (temperature < 15) {
                advice = "It's quite chilly on Earth. Wear a jacket.";
            } else if (temperature < 25) {
                advice = "The weather on Earth is pleasant. A light sweater should be enough.";
            } else {
                advice = "It's warm on Earth. Wear something light!";
            }
        } else if (planet.equals("mars")) {
            if (temperature < -60) {
                advice = "It's extremely cold on Mars! Wear a space suit with thermal insulation.";
            } else if (temperature < 0) {
                advice = "It's very cold on Mars. Wear a thermal suit.";
            } else {
                advice = "It's unusually warm on Mars. Enjoy the rare warmth!";
            }
        } else if (planet.equals("venus")) {
            if (temperature < 400) {
                advice = "It's incredibly hot on Venus! Stay indoors with air conditioning.";
            } else {
                advice = "It's scorching hot on Venus. Avoid going outside!";
            }
        } else if (planet.equals("jupiter")) {
            if (temperature < -100) {
                advice = "It's freezing on Jupiter! Stay in your heated space module.";
            } else if (temperature < -50) {
                advice = "It's very cold on Jupiter. Wear a thermal space suit.";
            } else {
                advice = "It's surprisingly warm on Jupiter. Enjoy the pleasant temperature!";
            }
        } else {
            advice = "Unknown planet! Please enter a valid planet name.";
        }


        System.out.println("Our Advice:"+advice);



        scanner.close();
    }
}