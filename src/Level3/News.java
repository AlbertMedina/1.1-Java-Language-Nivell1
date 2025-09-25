package Level3;

public abstract class News {

    private final String headline;
    private String text;
    private int rating;
    private int price;

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
}
