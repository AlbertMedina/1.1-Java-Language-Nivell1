package Level3;

public class BasketballNews extends News {

    private String competition;
    private String club;

    public BasketballNews(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public int calculateNewsPrice() {
        int price = 250;

        if (competition.equals("Euroleague")) {
            price += 75;
        }

        if (club.equals("Barça") || club.equals("Madrid")) {
            price += 75;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 4;

        if (competition.equals("Euroleague")) {
            rating += 3;
        }

        if (competition.equals("ACB")) {
            rating += 2;
        }

        if (club.equals("Barça") || club.equals("Madrid")) {
            rating += 1;
        }

        return rating;
    }
}
