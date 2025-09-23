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

        if (competition.equals("Champions League")) {
            price += 100;
        }

        if (club.equals("Barça") || club.equals("Madrid")) {
            price += 100;
        }

        if (player.equals("Ferran Torres") || player.equals("Benzema")) {
            price += 50;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 5;

        if (competition.equals("Champions League")) {
            rating += 3;
        }

        if (competition.equals("LaLiga")) {
            rating += 2;
        }

        if (club.equals("Barça") || club.equals("Madrid")) {
            rating += 1;
        }

        if (player.equals("Ferran Torres") || player.equals("Benzema")) {
            rating += 1;
        }

        return rating;
    }
}
