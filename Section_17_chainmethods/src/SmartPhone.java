import java.util.Objects;

public class SmartPhone {

    String brand;
    String modal;
    int price;


    // constructor

    public SmartPhone(String brand, String modal, int price) {
        this.brand = brand;
        this.modal = modal;
        this.price = price;

        System.out.println("The name of the Phone is " + brand + " and the modal is " + modal + " and the price is " + price);
    }

    // chain method


    public SmartPhone discountOnPhone(int discountPercentage) {

        double discountAmount = (price * discountPercentage) / 100.0;

        double newPrice = price - discountAmount;

        System.out.println("You get discount on this phone of " + discountPercentage + " % and you get " + discountAmount + " and the new price is: " + newPrice);
        return this;
    }

    public void countryOfUsage(String country) {

        if (Objects.equals(country, "Germany")) {

            System.out.println("This is valid for this country: " + country);

        } else {

            System.out.println("Unfortunately not available fro this country");
        }
    }
}
