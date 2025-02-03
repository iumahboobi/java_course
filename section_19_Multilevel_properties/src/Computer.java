public class Computer extends Device {
    
    double ram;
    double storage;

    public Computer(String brand, String model, double ram, double storage) {
        super(brand, model);
        this.ram = ram;
        this.storage = storage;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Ram: " + ram);
        System.out.println("Storage: " + storage + " GB");
    }
}
