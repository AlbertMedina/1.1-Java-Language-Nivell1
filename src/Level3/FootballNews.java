package Level3;

public class FootballNews extends News {

    private String competition;
    private String club;
    private String player;

    public FootballNews(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public int calculateNewsPrice() {
        int price = 300;

        if (competition.equalsIgnoreCase("Champions League")) {
            price += 100;
        }

        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 100;
        }

        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            price += 50;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 5;

        if (competition.equalsIgnoreCase("Champions League")) {
            rating += 3;
        }

        if (competition.equalsIgnoreCase("LaLiga")) {
            rating += 2;
        }

        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            rating += 1;
        }

        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            rating += 1;
        }

        return rating;
    }
}
