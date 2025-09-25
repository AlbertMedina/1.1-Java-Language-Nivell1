package Level3;

import java.util.ArrayList;
import java.util.List;

public class Copywriter {

    private String name;
    private final String dni;
    private static int salary = 1500;
    private List<News> newsList;

    public Copywriter(String name, String dni) {
        this.name = name;
        this.dni = dni;
        newsList = new ArrayList<>();
    }

    public String getDNI() {
        return dni;
    }

    public void addFootballNews(String headline, String competition, String club, String player) {
        if (!hasNewsWithHeadline(headline)) {
            newsList.add(new FootballNews(headline, competition, club, player));
            System.out.println("News added successfully.");
        } else {
            System.out.println("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addBasketballNews(String headline, String competition, String club) {
        if (!hasNewsWithHeadline(headline)) {
            newsList.add(new BasketballNews(headline, competition, club));
            System.out.println("News added successfully.");
        } else {
            System.out.println("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addTennisNews(String headline, String competition, String player) {
        if (!hasNewsWithHeadline(headline)) {
            newsList.add(new TennisNews(headline, competition, player));
            System.out.println("News added successfully.");
        } else {
            System.out.println("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addF1News(String headline, String racingTeam) {
        if (!hasNewsWithHeadline(headline)) {
            newsList.add(new F1News(headline, racingTeam));
            System.out.println("News added successfully.");
        } else {
            System.out.println("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void addMotorcyclingNews(String headline, String racingTeam) {
        if (!hasNewsWithHeadline(headline)) {
            newsList.add(new MotorcyclingNews(headline, racingTeam));
            System.out.println("News added successfully.");
        } else {
            System.out.println("News cannot be added because it already exists for this copywriter.");
        }
    }

    public void removeNews(String headline) {
        News news = getNewsByHeadline(headline);
        if (news != null) {
            newsList.remove(news);
            System.out.println("News removed successfully.");
        } else {
            System.out.println("News not found, it cannot be removed.");
        }
    }

    public String getNews() {
        StringBuilder sb = new StringBuilder();
        if (newsList.isEmpty()) {
            sb.append("This copywriter has no news for the time being.");
        } else {
            sb.append("This copywriter has the following news:");
            for (News n : newsList) {
                sb.append("\n").append(n.toString());
            }
        }
        return sb.toString();
    }

    public int getNewsRating(String headline) {
        News news = getNewsByHeadline(headline);
        if (news != null) {
            return news.getRating();
        } else {
            System.out.println("News not found, rating cannot be calculated.");
            return -1;
        }
    }

    public int getNewsPrice(String headline) {
        News news = getNewsByHeadline(headline);
        if (news != null) {
            return news.getPrice();
        } else {
            System.out.println("News not found, price cannot be calculated.");
            return -1;
        }
    }

    private Boolean hasNewsWithHeadline(String headline) {
        return newsList.stream().anyMatch(n -> n.getHeadline().equalsIgnoreCase(headline));
    }

    private News getNewsByHeadline(String headline) {
        return newsList.stream().filter(n -> n.getHeadline().equalsIgnoreCase(headline)).findFirst().orElse(null);
    }
}
