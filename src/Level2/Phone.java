package Level2;

public class Phone {

    public String brand;
    public String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}
