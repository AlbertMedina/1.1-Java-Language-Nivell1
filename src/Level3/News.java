package Level3;

public abstract class News {

    private String headline;
    private String text;
    private int rating;
    private int price;

    public News(String headline) {
        this.headline = headline;
        this.text = "";
    }

    public abstract int calculateNewsPrice();

    public abstract int calculateNewsRating();
}
