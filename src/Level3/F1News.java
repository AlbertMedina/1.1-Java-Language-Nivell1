package Level3;

public class F1News extends News {

    private String racingTeam;

    public F1News(String headline, String racingTeam) {
        super(headline);
        this.racingTeam = racingTeam;
    }

    @Override
    public int calculateNewsPrice() {
        int price = 100;

        if (racingTeam.equals("Ferrari") || racingTeam.equals("Mercedes")) {
            price += 50;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 4;

        if (racingTeam.equals("Ferrari") || racingTeam.equals("Mercedes")) {
            rating += 2;
        }

        return rating;
    }
}
