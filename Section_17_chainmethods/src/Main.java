//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to chain Method");

        SmartPhone smartPhone1 = new SmartPhone("iphone", "Pro Max 16", 1500);
        smartPhone1.discountOnPhone(10).countryOfUsage("Germany");
        ;
    }
}