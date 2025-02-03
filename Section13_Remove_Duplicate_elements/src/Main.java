import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Remove duplicate Elements");


        String[] countries = {"Afghanistan", "Germany", "Pakistan", "India","Afghanistan", "Germany", "Pakistan", "India","Uzbekistan","USA"};
        String[] countriesRemoved =dupliElementRemover(countries);
        Arrays.sort(countriesRemoved);
        String finalResult = String.join(",",countriesRemoved);
        System.out.println("The countries after deleted countries are: "+finalResult );

    }

    public static String[] dupliElementRemover(String[] array) {
        Set<String> set = new HashSet<>(Arrays.asList(array));
        return set.toArray(new String[0]);
    }
}