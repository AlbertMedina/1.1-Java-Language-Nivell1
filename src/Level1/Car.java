package Level1;

public class Car {

    public static final String brand = "Renault";
    public static String model;
    public final int power;

    public Car(String model, int power) {
        Car.model = model;
        this.power = power;
    }

    public static void brake() {
        System.out.println("The car is braking.");
    }

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}
