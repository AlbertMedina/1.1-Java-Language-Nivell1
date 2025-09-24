package Level3;

import java.util.ArrayList;
import java.util.List;

public class Copywriter {

    private String name;
    private final String dni;
    private static int salary = 1500;
    private List<News> news;

    public Copywriter(String name, String dni) {
        this.name = name;
        this.dni = dni;
        news = new ArrayList<>();
    }

    public String getDNI() {
        return dni;
    }

    public void addFootballNews(String headline, String competition, String club, String player) {
        if (!hasNewsWithHeadline(headline)) {
            news.add(new FootballNews(headline, competition, club, player));
            System.out.print("News added successfully.");
        } else {
            System.out.print("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addBasketballNews(String headline, String competition, String club) {
        if (!hasNewsWithHeadline(headline)) {
            news.add(new BasketballNews(headline, competition, club));
            System.out.print("News added successfully.");
        } else {
            System.out.print("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addTennisNews(String headline, String competition, String player) {
        if (!hasNewsWithHeadline(headline)) {
            news.add(new TennisNews(headline, competition, player));
            System.out.print("News added successfully.");
        } else {
            System.out.print("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addF1News(String headline, String racingTeam) {
        if (!hasNewsWithHeadline(headline)) {
            news.add(new F1News(headline, racingTeam));
            System.out.print("News added successfully.");
        } else {
            System.out.print("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addMotorcyclingNews(String headline, String racingTeam) {
        if (!hasNewsWithHeadline(headline)) {
            news.add(new MotorcyclingNews(headline, racingTeam));
            System.out.print("News added successfully.");
        } else {
            System.out.print("News cannot be added because it already exists for this copywriter.");
        }
    }

    private Boolean hasNewsWithHeadline(String headline) {
        return news.stream().anyMatch(n -> n.getHeadline().equals(headline));
    }
}
