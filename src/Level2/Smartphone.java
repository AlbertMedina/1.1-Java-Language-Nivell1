package Level2;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }


    @Override
    public void takePicture() {
        System.out.println("Taking picture...");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm ringing...");
    }
}
