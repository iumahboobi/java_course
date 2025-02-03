//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello and welcome Multi level Inheritence");

        Device myComputer = new Computer("Apple", "M4", 64, 1024);
        Device myLaptop = new Laptop("Lenovo", "Thinkpad", 128, 2048, 1800, 15);
        myComputer.displayInfo();
        myLaptop.displayInfo();

    }
}