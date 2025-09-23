package Level1;

public class StringInstrument extends Instrument {

    public static String material = "Wood";

    static {
        System.out.println("StringInstrument class loaded.");
    }

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }
}
