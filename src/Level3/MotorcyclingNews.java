package Level3;

import java.util.Objects;

public class MotorcyclingNews extends News {

    private String racingTeam;

    public MotorcyclingNews(String headline, String racingTeam) {
        super(headline);
        this.racingTeam = racingTeam;
    }

    @Override
    public int calculateNewsPrice() {
        int price = 100;

        if (racingTeam.equalsIgnoreCase("Honda") || racingTeam.equalsIgnoreCase("Yamaha")) {
            price += 50;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 3;

        if (racingTeam.equalsIgnoreCase("Honda") || racingTeam.equalsIgnoreCase("Yamaha")) {
            rating += 3;
        }

        return rating;
    }
}
