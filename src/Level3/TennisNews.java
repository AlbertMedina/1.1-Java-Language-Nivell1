package Level3;

public class TennisNews extends News {

    private final String competition;
    private final String player;

    public TennisNews(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
    }

    @Override
    public int calculateNewsPrice() {
        int price = 150;

        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") || player.equalsIgnoreCase("Djokovic")) {
            price += 100;
        }

        return price;
    }

    @Override
    public int calculateNewsRating() {
        int rating = 4;

        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") || player.equalsIgnoreCase("Djokovic")) {
            rating += 3;
        }

        return rating;
    }

    @Override
    public String toString() {
        return super.toString() + "\n- Sport: Tennis" + "\n- Competition: " + competition + "\n- Player: " + player;
    }
}
