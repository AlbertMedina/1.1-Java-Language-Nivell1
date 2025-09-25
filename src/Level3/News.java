package Level3;

public abstract class News {

    private final String headline;
    private String text;
    private int rating = -1;
    private int price = -1;

    public News(String headline) {
        this.headline = headline;
        this.text = "";
    }

    public abstract int calculateNewsPrice();

    public abstract int calculateNewsRating();

    @Override
    public String toString() {
        return headline.toUpperCase();
    }

    public String getHeadline() {
        return headline;
    }

    public int getRating() {
        if (rating == -1) {
            rating = calculateNewsRating();
        }
        return rating;
    }

    public int getPrice() {
        if (price == -1) {
            price = calculateNewsPrice();
        }
        return price;
    }
}
