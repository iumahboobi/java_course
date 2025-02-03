public class Device {

    String brand;
    String model;

    //Constructor
    public Device(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }

    // Output
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
