package Level3;

public class BasketballNews extends News {

    private final String competition;
    private final String club;

    public BasketballNews(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public int calculateNewsPrice() {
        int price = 250;

        if (competition.equalsIgnoreCase("Euroleague")) {
            price += 75;
        }

        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 75;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 4;

        if (competition.equalsIgnoreCase("Euroleague")) {
            rating += 3;
        }

        if (competition.equalsIgnoreCase("ACB")) {
            rating += 2;
        }

        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            rating += 1;
        }

        return rating;
    }

    @Override
    public String toString() {
        return super.toString() + "\n- Sport: Basketball" + "\n- Competition: " + competition + "\n- Club: " + club;
    }
}
