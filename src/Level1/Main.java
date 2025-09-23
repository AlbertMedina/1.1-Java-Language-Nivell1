package Level1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creating WindInstrument instance:");
        WindInstrument oboe = new WindInstrument("Oboe", 1000);
        oboe.play();

        System.out.println();

        System.out.println("Accessing a static member of StringInstrument:");
        System.out.println("String instrument material: " + StringInstrument.material);

        System.out.println();

        System.out.println("Creating StringInstrument instance:");
        StringInstrument violin = new StringInstrument("Violin", 2000);
        violin.play();

        System.out.println();

        System.out.println("Creating PercussionInstrument instance:");
        PercussionInstrument cymbal = new PercussionInstrument("Cymbal", 500);
        cymbal.play();

    }
}
