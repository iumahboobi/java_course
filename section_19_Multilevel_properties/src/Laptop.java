public class Laptop extends Computer {


    // Properties

    double weight;
    double screenSize;


    //constructor


    public Laptop(String brand, String model, double ram, double storage, double weight, double screenSize) {
        super(brand, model, ram, storage);
        this.weight = weight;
        this.screenSize = screenSize;
    }

    void displayInfo() {
        System.out.println("Weight: " + weight + "gm");
        System.out.println("Screen Size : " + screenSize + " '' ");
    }
}
