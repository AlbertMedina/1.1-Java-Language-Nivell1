package Level3;

public class F1News extends News {

    private final String racingTeam;

    public F1News(String headline, String racingTeam) {
        super(headline);
        this.racingTeam = racingTeam;
    }

    @Override
    public int calculateNewsPrice() {
        int price = 100;

        if (racingTeam.equalsIgnoreCase("Ferrari") || racingTeam.equalsIgnoreCase("Mercedes")) {
            price += 50;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 4;

        if (racingTeam.equalsIgnoreCase("Ferrari") || racingTeam.equalsIgnoreCase("Mercedes")) {
            rating += 2;
        }

        return rating;
    }

    @Override
    public String toString() {
        return super.toString() + "\n- Sport: F1" + "\n- Racing team: " + racingTeam;
    }
}
